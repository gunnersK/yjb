package com.yjb.pojo;

public class YjbContactGroup {
    private Integer groId;

    private String groAbbr;

    private String groFullname;

    private String groOrgCode;

    private String groPinyin;

    private String groRepOrgCode;

    private String groRemarks;

    
    @Override
	public String toString() {
		return "YjbContactGroup [groId=" + groId + ", groAbbr=" + groAbbr + ", groFullname=" + groFullname
				+ ", groOrgCode=" + groOrgCode + ", groPinyin=" + groPinyin + ", groRepOrgCode=" + groRepOrgCode
				+ ", groRemarks=" + groRemarks + "]";
	}

	public Integer getGroId() {
        return groId;
    }

    public void setGroId(Integer groId) {
        this.groId = groId;
    }

    public String getGroAbbr() {
        return groAbbr;
    }

    public void setGroAbbr(String groAbbr) {
        this.groAbbr = groAbbr == null ? null : groAbbr.trim();
    }

    public String getGroFullname() {
        return groFullname;
    }

    public void setGroFullname(String groFullname) {
        this.groFullname = groFullname == null ? null : groFullname.trim();
    }

    public String getGroOrgCode() {
        return groOrgCode;
    }

    public void setGroOrgCode(String groOrgCode) {
        this.groOrgCode = groOrgCode == null ? null : groOrgCode.trim();
    }

    public String getGroPinyin() {
        return groPinyin;
    }

    public void setGroPinyin(String groPinyin) {
        this.groPinyin = groPinyin == null ? null : groPinyin.trim();
    }

    public String getGroRepOrgCode() {
        return groRepOrgCode;
    }

    public void setGroRepOrgCode(String groRepOrgCode) {
        this.groRepOrgCode = groRepOrgCode == null ? null : groRepOrgCode.trim();
    }

    public String getGroRemarks() {
        return groRemarks;
    }

    public void setGroRemarks(String groRemarks) {
        this.groRemarks = groRemarks == null ? null : groRemarks.trim();
    }
}