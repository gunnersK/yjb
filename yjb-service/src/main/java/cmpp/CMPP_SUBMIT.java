package cmpp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class CMPP_SUBMIT extends Message_Header {
private long Msg_Id=0x00;
private byte Pk_total=0x01;
private byte Pk_number=0x01;
private byte Registered_Delivery=0x01;
private byte Msg_level=0x01;
private String Service_Id="uvYYiveSv";
private byte Fee_UserType=0x00;
private String Fee_terminal_Id="";
private byte TP_pId=0x00;
private byte TP_udhi=0x00;
private byte Msg_Fmt=0x0f;
private String Msg_src="";
private String FeeType="01";
private String FeeCode="000000";
private String ValId_Time="";
private String At_Time="";
private String Src_Id="";
private byte DestUsr_tl=0x01;
private String Dest_terminal_Id="";
private byte Msg_Length;
private byte[] Msg_Content;
private String Reserve="00000000";

public byte[] toByteArray(){
	
	ByteArrayOutputStream bous=new ByteArrayOutputStream();
	DataOutputStream dous=new DataOutputStream(bous);
	
	try {
		dous.writeInt(this.getTotalLength());
		dous.writeInt(this.getCommandId());
		dous.writeInt(this.getSequenceId());
		dous.writeLong(this.Msg_Id);
		dous.writeByte(this.Pk_total);
		dous.writeByte(this.Pk_number);
		dous.writeByte(this.Registered_Delivery);
		dous.writeByte(this.Msg_level);
		MsgUtils.writeString(dous, this.Service_Id, 10);
		dous.writeByte(this.Fee_UserType);
		MsgUtils.writeString(dous, this.Fee_terminal_Id, 21);
		dous.writeByte(this.TP_pId);
		dous.writeByte(this.TP_udhi);
		dous.writeByte(this.Msg_Fmt);
		MsgUtils.writeString(dous, this.Msg_src, 6);
		MsgUtils.writeString(dous, this.FeeType, 2);
		MsgUtils.writeString(dous, this.FeeCode, 6);
		MsgUtils.writeString(dous, this.ValId_Time, 17);
		MsgUtils.writeString(dous, this.At_Time, 17);
		MsgUtils.writeString(dous, this.Src_Id, 21);
		dous.writeByte(this.DestUsr_tl);
		MsgUtils.writeString(dous, this.Dest_terminal_Id, 21);
		dous.writeByte(this.Msg_Length);
		dous.write(this.Msg_Content);
		MsgUtils.writeString(dous, this.Reserve, 8);
		dous.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("cmpp_submit封装成功");
	}
	return bous.toByteArray();
	
}

public long getMsg_Id() {
	return Msg_Id;
}
public void setMsg_Id(long msgId) {
	Msg_Id = msgId;
}
public byte getPk_total() {
	return Pk_total;
}
public void setPk_total(byte pkTotal) {
	Pk_total = pkTotal;
}
public byte getPk_number() {
	return Pk_number;
}
public void setPk_number(byte pkNumber) {
	Pk_number = pkNumber;
}
public byte getRegistered_Delivery() {
	return Registered_Delivery;
}
public void setRegistered_Delivery(byte registeredDelivery) {
	Registered_Delivery = registeredDelivery;
}
public byte getMsg_level() {
	return Msg_level;
}
public void setMsg_level(byte msgLevel) {
	Msg_level = msgLevel;
}
public String getService_Id() {
	return Service_Id;
}
public void setService_Id(String serviceId) {
	Service_Id = serviceId;
}
public byte getFee_UserType() {
	return Fee_UserType;
}
public void setFee_UserType(byte feeUserType) {
	Fee_UserType = feeUserType;
}
public String getFee_terminal_Id() {
	return Fee_terminal_Id;
}
public void setFee_terminal_Id(String feeTerminalId) {
	Fee_terminal_Id = feeTerminalId;
}
public byte getTP_pId() {
	return TP_pId;
}
public void setTP_pId(byte tPPId) {
	TP_pId = tPPId;
}
public byte getTP_udhi() {
	return TP_udhi;
}
public void setTP_udhi(byte tPUdhi) {
	TP_udhi = tPUdhi;
}
public byte getMsg_Fmt() {
	return Msg_Fmt;
}
public void setMsg_Fmt(byte msgFmt) {
	Msg_Fmt = msgFmt;
}
public String getMsg_src() {
	return Msg_src;
}
public void setMsg_src(String msgSrc) {
	Msg_src = msgSrc;
}
public String getFeeType() {
	return FeeType;
}
public void setFeeType(String feeType) {
	FeeType = feeType;
}
public String getFeeCode() {
	return FeeCode;
}
public void setFeeCode(String feeCode) {
	FeeCode = feeCode;
}
public String getValId_Time() {
	return ValId_Time;
}
public void setValId_Time(String valIdTime) {
	ValId_Time = valIdTime;
}
public String getAt_Time() {
	return At_Time;
}
public void setAt_Time(String atTime) {
	At_Time = atTime;
}
public String getSrc_Id() {
	return Src_Id;
}
public void setSrc_Id(String srcId) {
	Src_Id = srcId;
}
public byte getDestUsr_tl() {
	return DestUsr_tl;
}
public void setDestUsr_tl(byte destUsrTl) {
	DestUsr_tl = destUsrTl;
}
public String getDest_terminal_Id() {
	return Dest_terminal_Id;
}
public void setDest_terminal_Id(String destTerminalId) {
	Dest_terminal_Id = destTerminalId;
}
public byte getMsg_Length() {
	return Msg_Length;
}
public void setMsg_Length(byte msgLength) {
	Msg_Length = msgLength;
}
public byte[] getMsg_Content() {
	return Msg_Content;
}
public void setMsg_Content(byte[] msgContent) {
	Msg_Content = msgContent;
}
public String getReserve() {
	return Reserve;
}
public void setReserve(String reserve) {
	Reserve = reserve;
}





}
