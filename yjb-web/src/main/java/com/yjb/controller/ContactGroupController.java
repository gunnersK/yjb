package com.yjb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbContactGroup;
import com.yjb.service.ContactGroupService;

@Controller
public class ContactGroupController {
	
	@Autowired
	private ContactGroupService contactGroupService;
	
	//查询所有群组
	@RequestMapping("/group/list")
	@ResponseBody
	public List<YjbContactGroup> getContactGroupsList(YjbContactGroup yjbContactGroup){
		System.out.println(yjbContactGroup.toString());
		return contactGroupService.getContactGroupsList(yjbContactGroup);
	}
	
	//根据groId查询群组
	@RequestMapping("/group/getGroupById")
	@ResponseBody
	public YjbContactGroup getContactGroupByGroId(Integer groId){
		return contactGroupService.getContactGroupByGroId(groId);
	}
	
	//新增群组
	@RequestMapping("/group/save")
	@ResponseBody
	public YJBResult addConatctGroup(YjbContactGroup yjbContactGroup){
		return contactGroupService.addConatctGroup(yjbContactGroup);
	}
	
	//修改群组信息
	@RequestMapping("/group/modify")
	@ResponseBody
	public YJBResult modifyConatctGroup(YjbContactGroup yjbContactGroup){
		return contactGroupService.modifyConatctGroup(yjbContactGroup);
	}

	//删除群组
	@RequestMapping("/group/delete")
	@ResponseBody
	public YJBResult deleteConatctGroup(Integer groId){
		return contactGroupService.deleteConatctGroup(groId);
	}
	

}
