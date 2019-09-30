package com.yjb.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjb.mapper.YjbSmsRecordMapper;
import com.yjb.pojo.LayUITableResult;
import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbSendSms;
import com.yjb.pojo.YjbSmsRecordInfoArgs;
import com.yjb.service.SendSmsService;

@Controller
public class SendSmsController {
	
	@Autowired
	private SendSmsService sendSmsService;
	
	//发送短信
	@RequestMapping("/sendSms/save")
	@ResponseBody
	public YJBResult addSendSms(YjbSendSms yjbSendSms){
		return sendSmsService.sendSms(yjbSendSms);		
	}
	
	//查询收发记录
	@RequestMapping("/record/list")
	@ResponseBody
	public LayUITableResult getRecords(YjbSmsRecordInfoArgs yjbSmsRecordInfoArgs) throws UnsupportedEncodingException {
		if(yjbSmsRecordInfoArgs.getCtcName() != null){
			String ctcName = new String(yjbSmsRecordInfoArgs.getCtcName().getBytes("iso-8859-1"), "utf-8");
			yjbSmsRecordInfoArgs.setCtcName(ctcName);
		}
		return sendSmsService.getRecord(yjbSmsRecordInfoArgs);
	}
	
	
	//删除收发记录
	@RequestMapping("/delete/record")
	@ResponseBody
	public YJBResult deleteRecordById(int [] ids){
		return sendSmsService.deleteByRecordId(ids);
	}
	
	//群发短信
	@RequestMapping("/sendSms/more")
	@ResponseBody
	public YJBResult addSendSmsMore(Long[] ctcId,String sendContent){
		return sendSmsService.sendMoreSms(ctcId,sendContent);		
	}
}
