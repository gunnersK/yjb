package com.yjb.service;

import com.yjb.pojo.LayUITableResult;
import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbContactArgs;
import com.yjb.pojo.YjbSendSms;
import com.yjb.pojo.YjbSmsRecordInfoArgs;



public interface SendSmsService {
	
	//发送信息
	public YJBResult sendSms(YjbSendSms yjbSendSms);
	
	//查询已发送信息记录
	public LayUITableResult getRecord(YjbSmsRecordInfoArgs yjbSmsRecordInfoArgs);

	
	//删除信息记录
	public  YJBResult deleteByRecordId(int[] ids);
	
	//群发消息
	public YJBResult sendMoreSms(Long [] tels,String sendContent);
}
