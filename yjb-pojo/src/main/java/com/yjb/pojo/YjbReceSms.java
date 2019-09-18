package com.yjb.pojo;

import java.util.Date;

public class YjbReceSms {
    private String receSmsId;

    private Long receFrom;

    private Date receTime;

    private Byte receStatus;

    private String receContent;

    public String getReceSmsId() {
        return receSmsId;
    }

    public void setReceSmsId(String receSmsId) {
        this.receSmsId = receSmsId == null ? null : receSmsId.trim();
    }

    public Long getReceFrom() {
        return receFrom;
    }

    public void setReceFrom(Long receFrom) {
        this.receFrom = receFrom;
    }

    public Date getReceTime() {
        return receTime;
    }

    public void setReceTime(Date receTime) {
        this.receTime = receTime;
    }

    public Byte getReceStatus() {
        return receStatus;
    }

    public void setReceStatus(Byte receStatus) {
        this.receStatus = receStatus;
    }

    public String getReceContent() {
        return receContent;
    }

    public void setReceContent(String receContent) {
        this.receContent = receContent == null ? null : receContent.trim();
    }
}