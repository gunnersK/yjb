package cmpp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class CMPP_SUBMIT_RESP extends Message_Header{
private long Msg_Id;
private byte Result;


	public CMPP_SUBMIT_RESP(byte[] data){
		ByteArrayInputStream bins=new ByteArrayInputStream(data);
		DataInputStream dins=new DataInputStream(bins);
		try {
			this.setTotalLength(data.length+4);
			this.setCommandId(dins.readInt());
			this.setSequenceId(dins.readInt());
			this.Msg_Id=dins.readLong();
			this.Result=dins.readByte();
			dins.close();
			bins.close();
		} catch (IOException e){}
	}


	public long getMsg_Id() {
		return Msg_Id;
	}


	public void setMsg_Id(long msgId) {
		Msg_Id = msgId;
	}


	public byte getResult() {
		return Result;
	}


	public void setResult(byte result) {
		Result = result;
	}
	
	
}
