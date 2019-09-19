package com.yjb.service;

import com.yjb.pojo.LayUITableResult;
import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbContact;
import com.yjb.pojo.YjbContactArgs;

public interface ContactService {
	
	//查询所有联系人
	public LayUITableResult getContactsList(YjbContactArgs yjbContactArgs);
	
	//新增联系人
	public YJBResult addConatct(YjbContact yjbContact); 

}
