package com.yjb.service;

import java.util.List;

import com.yjb.pojo.LayUITableResult;
import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbContactGroup;
import com.yjb.pojo.YjbContactGroupArgs;

public interface ContactGroupService {
	
	//查询所有群组
	public List<YjbContactGroup> getContactGroupsList(YjbContactGroup yjbContactGroup);

	//根据groId查询群组
	public YjbContactGroup getContactGroupByGroId(Integer groId);
	
	//新增群组
	public YJBResult addConatctGroup(YjbContactGroup yjbContactGroup); 
	
	//修改群组信息
	public YJBResult modifyConatctGroup(YjbContactGroup yjbContactGroup); 

	//删除群组
	public YJBResult deleteConatctGroup(Integer groId); 

}
