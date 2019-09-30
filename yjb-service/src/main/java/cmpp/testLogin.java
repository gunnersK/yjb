package cmpp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testLogin {

	public static Socket socket;
	public static String IP="112.35.10.164";
	public static int port=1990;
	public static DataInputStream in;
	public static DataOutputStream out;
	
	
	/***
	 * 创建指定地址socket连接
	 * @return
	 */
	public static Socket getSocketInstance(){
		try {
			socket=new Socket(IP,port);
			socket.setKeepAlive(true);
			socket.setSoTimeout(10000);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return socket;
		
	}
	 
	/***
	 * connect初始化连接服务器
	 * @throws IOException
	 */
	public static void connectISMG() throws IOException{
		System.out.println("正在连接到服务器"+IP);
		CMPP_CONNECT connect=new CMPP_CONNECT();
		connect.setTotalLength(12+6+16+1+4);
		connect.setCommandId(0x00000001);
		connect.setSequenceId(MsgUtils.getSequence());
		connect.setSourceAddr("muquan");
		String timestamp=MsgUtils.getTimestamp();
		connect.setAuthenticatorSource(MsgUtils.getAuthenticatorSource("muquan", "muquan", timestamp));
		connect.setTimestamp(Integer.parseInt(timestamp));
		connect.setVersion((byte)0x20);
		List<byte[]> dataList=new ArrayList<byte[]>();
		dataList.add(connect.toByteArray());
		out=new DataOutputStream(getSocketInstance().getOutputStream());
		if(out!=null&&null!=dataList){
			for(byte[]data:dataList){
				out.write(data);
				out.flush();
				System.out.println("connect数据发送完成");
			}
		}
		
		in=new DataInputStream(socket.getInputStream());
		int len=in.readInt();
		List<byte[]> getData=new ArrayList<byte[]>();
		if(null!=in&&0!=len){
			byte[] data=new byte[len-4];
			in.read(data);
			getData.add(data);
			for(byte[] returnData:getData){
				Message_Header header=new Message_Header(returnData);
				switch(header.getCommandId()){
				case 0x80000001:
					CMPP_CONNECT_RESP connectResp=new CMPP_CONNECT_RESP(returnData);
					System.out.println("CMPP初始化链接状态值"+connectResp.getStatus());
				}
				

				
			}
			
		}
		
	}
	
	/***
	 * 发送短短信
	 * @param msg
	 * @param phoneNumber
	 * @throws IOException
	 */
	public static void sendShortMsg(String msg,String phoneNumber) throws IOException{
		int seq=MsgUtils.getSequence();
		try {
			byte[] msgByte=msg.getBytes("gb2312");
			CMPP_SUBMIT submit=new CMPP_SUBMIT();
			
			submit.setTotalLength(159+msgByte.length);
			submit.setCommandId(0x00000004);
			submit.setSequenceId(seq);
//			submit.setMsg_src("");
			submit.setSrc_Id("10691423235703");
			submit.setDest_terminal_Id(phoneNumber);
			submit.setMsg_Length((byte)msgByte.length);
			submit.setMsg_Content	(msgByte);
			List<byte[]> dataList=new ArrayList<byte[]>();
			dataList.add(submit.toByteArray());
			if(out!=null&&null!=dataList){
				for(byte[]data:dataList){
					out.write(data);
					out.flush();
					System.out.println("submit数据发送完成");
				}
			}
			
			in=new DataInputStream(socket.getInputStream());
			int len=in.readInt();
			List<byte[]> getData=new ArrayList<byte[]>();
			if(null!=in&&0!=len){
				byte[] data=new byte[len-4];
				in.read(data);
				getData.add(data);
				for(byte[] returnData:getData){
					Message_Header header=new Message_Header(returnData);
					switch(header.getCommandId()){
					case 0x80000004:
						CMPP_SUBMIT_RESP submitResp=new CMPP_SUBMIT_RESP(returnData);
						System.out.println("submitresp状态值"+submitResp.getResult());
						System.out.println("submitresp流水号值"+submitResp.getMsg_Id());
					}
					

				}	
				}
		} catch (UnsupportedEncodingException | EOFException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
	}
	
	
	/***
	 * 获取上行及状态报告回执信息
	 * @throws IOException
	 */
	public static void CMPP_DELIVER() throws IOException{
		in=new DataInputStream(socket.getInputStream());
		int len=in.readInt();
		List<byte[]> getData=new ArrayList<byte[]>();
		if(null!=in&&0!=len){
			byte[] data=new byte[len-4];
			in.read(data);
			getData.add(data);
			for(byte[] returnData:getData){
				System.out.println("获取状态报告中......");
				CMPP_DELIVER deliver=new CMPP_DELIVER(returnData);
				System.out.println(returnData.length+":"+Arrays.toString(returnData));
				System.out.println("================================================"+deliver.getCommandId());
				String content = deliver.getMsg_Content();
//				if(content != null)
//					System.out.println("CMPP_DELIVER内容"+new String(content.toString().getBytes("GBK")));
//				if(deliver.getCommandId() != 5 && deliver.getMsg_Content() != null){
//					System.exit(0);
//				}
				switch(deliver.getCommandId()){
				case 0x80000005:
					CMPP_SUBMIT_RESP submitResp=new CMPP_SUBMIT_RESP(returnData);
					System.out.println("CMPP_DELIVER内容"+deliver.getMsg_Content());
					System.out.println("CMPP_DELIVER状态值"+deliver.getStat());
					System.out.println("CMPP_DELIVER流水号值"+deliver.getMsg_Id2());
				}


			}	
			}
	}
	
	/***
	 * 长连接链路检测
	 * @throws IOException 
	 */
	public static void CMPP_ACTIVE_TEST() throws IOException{
		Message_Header header=new Message_Header();
		header.setTotalLength(12);
		header.setCommandId(0x00000008);
		header.setSequenceId(MsgUtils.getSequence());
		List<byte[]> dataList=new ArrayList<byte[]>();
		dataList.add(header.toByteArray());
		if(out!=null&&null!=dataList){
			for(byte[]data:dataList){
//				System.out.println(data);
				out.write(data);
				out.flush();
//				System.out.println("长连接链路检测中......");
			}
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			connectISMG();
//			sendShortMsg("!!!","17777538434");
			sendShortMsg("!!!","17878792473");
//		if(in!=null){
//			int a=0;
//			while(true){
//				CMPP_ACTIVE_TEST();
//				CMPP_DELIVER();
//			}
//
//		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread(new ReceiveThread()).start();
		
	}
	

}

class ReceiveThread implements Runnable{

	@Override
	public void run() {
		while(true){
			try {
				testLogin.CMPP_ACTIVE_TEST();
				testLogin.CMPP_DELIVER();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
