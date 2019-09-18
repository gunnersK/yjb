package com.yjb.pojo;

public class YjbContactArgs {
	private Long ctcId;

    private String ctcName;

    private String ctcGender;

    private String ctcEmail;

    private String ctcPhone;

    private String ctcTel;

    private Integer ctcGroup;

    private String ctcJob;

    private String comAddr;
    
    private int page;
	private int limit;
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
		this.ctcName = ctcName;
	}
	public String getCtcGender() {
		return ctcGender;
	}
	public void setCtcGender(String ctcGender) {
		this.ctcGender = ctcGender;
	}
	public String getCtcEmail() {
		return ctcEmail;
	}
	public void setCtcEmail(String ctcEmail) {
		this.ctcEmail = ctcEmail;
	}
	public String getCtcPhone() {
		return ctcPhone;
	}
	public void setCtcPhone(String ctcPhone) {
		this.ctcPhone = ctcPhone;
	}
	public String getCtcTel() {
		return ctcTel;
	}
	public void setCtcTel(String ctcTel) {
		this.ctcTel = ctcTel;
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
		this.ctcJob = ctcJob;
	}
	public String getComAddr() {
		return comAddr;
	}
	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int rows) {
		this.limit = rows;
	}
	@Override
	public String toString() {
		return "YjbContactArgs [ctcId=" + ctcId + ", ctcName=" + ctcName + ", ctcGender=" + ctcGender + ", ctcEmail="
				+ ctcEmail + ", ctcPhone=" + ctcPhone + ", ctcTel=" + ctcTel + ", ctcGroup=" + ctcGroup + ", ctcJob="
				+ ctcJob + ", comAddr=" + comAddr + ", page=" + page + ", limit=" + limit + "]";
	}
	
	
}
