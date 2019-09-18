package com.yjb.pojo;

import java.util.Date;

public class YjbSendSms {
    private String sendSmsId;

    private Long sendTo;

    private Date sendTime;

    private Byte sendStatus;

    private String sendContent;

    public String getSendSmsId() {
        return sendSmsId;
    }

    public void setSendSmsId(String sendSmsId) {
        this.sendSmsId = sendSmsId == null ? null : sendSmsId.trim();
    }

    public Long getSendTo() {
        return sendTo;
    }

    public void setSendTo(Long sendTo) {
        this.sendTo = sendTo;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Byte getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Byte sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getSendContent() {
        return sendContent;
    }

    public void setSendContent(String sendContent) {
        this.sendContent = sendContent == null ? null : sendContent.trim();
    }
}