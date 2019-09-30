package com.yjb.pojo;

import java.util.Date;

public class YjbSmsRecordInfoArgs {
	
	private String ctcName;
	
	private String startDate;
	
	private String endDate;

	private int page;

	private int limit;
	
	

/*	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}*/

	
/*	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
*/
	

	public String getCtcName() {
		return ctcName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setCtcName(String ctcName) {
		this.ctcName = ctcName;
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

	public void setLimit(int limit) {
		this.limit = limit;
	}
	

	
	
	
}
