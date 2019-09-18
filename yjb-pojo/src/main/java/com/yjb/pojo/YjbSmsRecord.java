package com.yjb.pojo;

import java.util.Date;

public class YjbSmsRecord {
    private Long recordId;

    private String smsId;

    private Long smsCtc;

    private Date smsTime;

    private Byte smsStatus;

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
        this.smsId = smsId == null ? null : smsId.trim();
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
}