package com.yjb.pojo;

public class YjbContact {
    private Long ctcId;

    private String ctcName;

    private String ctcGender;

    private String ctcEmail;

    private String ctcPhone;

    private String ctcTel;

    private Integer ctcGroup;

    private String ctcJob;

    private String comAddr;

    public Long getCtcId() {
        return ctcId;
    }

    public void setCtcId(Long ctcId) {
        this.ctcId = ctcId;
    }

    public String getCtcName() {
        return ctcName;
    }

    public void setCtcName(String ctcName) {
        this.ctcName = ctcName == null ? null : ctcName.trim();
    }

    public String getCtcGender() {
        return ctcGender;
    }

    public void setCtcGender(String ctcGender) {
        this.ctcGender = ctcGender == null ? null : ctcGender.trim();
    }

    public String getCtcEmail() {
        return ctcEmail;
    }

    public void setCtcEmail(String ctcEmail) {
        this.ctcEmail = ctcEmail == null ? null : ctcEmail.trim();
    }

    public String getCtcPhone() {
        return ctcPhone;
    }

    public void setCtcPhone(String ctcPhone) {
        this.ctcPhone = ctcPhone == null ? null : ctcPhone.trim();
    }

    public String getCtcTel() {
        return ctcTel;
    }

    public void setCtcTel(String ctcTel) {
        this.ctcTel = ctcTel == null ? null : ctcTel.trim();
    }

    public Integer getCtcGroup() {
        return ctcGroup;
    }

    public void setCtcGroup(Integer ctcGroup) {
        this.ctcGroup = ctcGroup;
    }

    public String getCtcJob() {
        return ctcJob;
    }

    public void setCtcJob(String ctcJob) {
        this.ctcJob = ctcJob == null ? null : ctcJob.trim();
    }

    public String getComAddr() {
        return comAddr;
    }

    public void setComAddr(String comAddr) {
        this.comAddr = comAddr == null ? null : comAddr.trim();
    }

	@Override
	public String toString() {
		return "YjbContact [ctcId=" + ctcId + ", ctcName=" + ctcName + ", ctcGender=" + ctcGender + ", ctcEmail="
				+ ctcEmail + ", ctcPhone=" + ctcPhone + ", ctcTel=" + ctcTel + ", ctcGroup=" + ctcGroup + ", ctcJob="
				+ ctcJob + ", comAddr=" + comAddr + "]";
	}
    
    
}