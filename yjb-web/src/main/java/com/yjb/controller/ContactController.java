package com.yjb.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjb.pojo.LayUITableResult;
import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbContact;
import com.yjb.pojo.YjbContactArgs;
import com.yjb.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	//查询所有联系人
	@RequestMapping(value="/contact/list",method=RequestMethod.POST)
	@ResponseBody
	public LayUITableResult getContactsList(YjbContactArgs yjbContactArgs){
		System.out.println(yjbContactArgs.getCtcGroup());
		return contactService.getContactsList(yjbContactArgs);
	}
	
	//新增联系人
	@RequestMapping("/contact/save")
	@ResponseBody
	public YJBResult addContact(YjbContact yjbContact){
		return contactService.addContact(yjbContact);
	}
	
	//删除联系人
	@RequestMapping("/contact/delete")
	@ResponseBody
	public YJBResult deleteContact(Long[] ids){
		return contactService.deleteContact(ids);
	}
	

}
