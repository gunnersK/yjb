package com.yjb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjb.mapper.YjbContactGroupMapper;
import com.yjb.pojo.LayUITableResult;
import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbContact;
import com.yjb.pojo.YjbContactGroup;
import com.yjb.pojo.YjbContactGroupArgs;
import com.yjb.pojo.YjbContactGroupExample;
import com.yjb.pojo.YjbContactGroupExample.Criteria;
import com.yjb.service.ContactGroupService;

@Service
public class ContactGroupServiceImpl implements ContactGroupService {
	
	@Autowired
	private YjbContactGroupMapper yjbContactGroupMapper;

	//查询所有群组
	@Override
	public List<YjbContactGroup> getContactGroupsList(YjbContactGroup yjbContactGroup) {
		YjbContactGroupExample example = new YjbContactGroupExample();
		Criteria criteria = example.createCriteria();
		return yjbContactGroupMapper.selectByExample(example);
	}
	
	//根据groId查询群组
	@Override
	public YjbContactGroup getContactGroupByGroId(Integer groId) {
		return yjbContactGroupMapper.selectByPrimaryKey(groId);
	}

	//新增群组
	@Override
	public YJBResult addConatctGroup(YjbContactGroup yjbContactGroup) {
		yjbContactGroupMapper.insert(yjbContactGroup);
		return YJBResult.ok();
	}

	//修改群组信息
	@Override
	public YJBResult modifyConatctGroup(YjbContactGroup yjbContactGroup) {
		yjbContactGroupMapper.updateByPrimaryKeySelective(yjbContactGroup);	
		return YJBResult.ok();
	}

	//删除群组
	@Override
	public YJBResult deleteConatctGroup(Integer groId) {
		yjbContactGroupMapper.deleteByPrimaryKey(groId);
		return YJBResult.ok();
	}

}
