package com.yjb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yjb.mapper.YjbContactMapper;
import com.yjb.pojo.LayUITableResult;
import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbContact;
import com.yjb.pojo.YjbContactArgs;
import com.yjb.pojo.YjbContactExample;
import com.yjb.pojo.YjbContactExample.Criteria;
import com.yjb.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private YjbContactMapper yjbContactMapper;

	//查询联系人
	@Override
	public LayUITableResult getContactsList(YjbContactArgs yjbContactArgs) {
	    String ctcName = yjbContactArgs.getCtcName();
	    Integer ctcGroup = yjbContactArgs.getCtcGroup();
	    
		//设置分页信息
		PageHelper.startPage(yjbContactArgs.getPage(), yjbContactArgs.getLimit());
		
		//从数据库查询
		YjbContactExample example = new YjbContactExample();
		Criteria criteria = example.createCriteria();
		
		//判断是否有群组或姓名的查询条件
		if(ctcName != null){
			criteria.andCtcNameEqualTo(ctcName);
		}
		if(ctcGroup != null){
			criteria.andCtcGroupEqualTo(ctcGroup);
		}
		List<YjbContact> list = yjbContactMapper.selectByExample(example);
		
		//取分页信息
		PageInfo<YjbContact> info = new PageInfo<>(list);
		//获取总记录数
		long total = info.getTotal();
		
		LayUITableResult result = new LayUITableResult();
		result.setData(list);
		result.setCount(total);
		result.setCode("0");
		
		return result;
	}

	//新增联系人
	@Override
	public YJBResult addConatct(YjbContact yjbContact) {
		yjbContactMapper.insert(yjbContact);
		return YJBResult.ok();
	}
}
