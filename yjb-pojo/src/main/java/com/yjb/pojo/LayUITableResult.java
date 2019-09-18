package com.yjb.pojo;

import java.io.Serializable;
import java.util.List;

public class LayUITableResult implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	private String msg;
	
	private long count;
	
	private List data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
