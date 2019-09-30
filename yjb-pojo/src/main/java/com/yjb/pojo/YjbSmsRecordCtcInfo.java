package com.yjb.pojo;

import java.util.Date;

public class YjbSmsRecordCtcInfo {

 	private Long recordId;

	private String smsId;

    private Long smsCtc;

    private Date smsTime;

    private Byte smsStatus;

    private String smsContent;
    
    private String ctcPhone;
    
    private String ctcName;
    
    
    public String getCtcName() {
		return ctcName;
	}

	public void setCtcName(String ctcName) {
		this.ctcName = ctcName;
	}

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getSmsId() {
		return smsId;
	}

	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}

	public Long getSmsCtc() {
		return smsCtc;
	}

	public void setSmsCtc(Long smsCtc) {
		this.smsCtc = smsCtc;
	}

	public Date getSmsTime() {
		return smsTime;
	}

	public void setSmsTime(Date smsTime) {
		this.smsTime = smsTime;
	}

	public Byte getSmsStatus() {
		return smsStatus;
	}

	public void setSmsStatus(Byte smsStatus) {
		this.smsStatus = smsStatus;
	}

	public String getSmsContent() {
		return smsContent;
	}

	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}

	public String getCtcPhone() {
		return ctcPhone;
	}

	public void setCtcPhone(String ctcPhone) {
		this.ctcPhone = ctcPhone;
	}
}
