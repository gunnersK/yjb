package com.yjb.service.impl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yjb.mapper.YjbContactMapper;
import com.yjb.mapper.YjbSendSmsMapper;
import com.yjb.mapper.YjbSmsRecordMapper;
import com.yjb.pojo.LayUITableResult;
import com.yjb.pojo.YJBResult;
import com.yjb.pojo.YjbSendSms;
import com.yjb.pojo.YjbSmsRecord;
import com.yjb.pojo.YjbSmsRecordCtcInfo;
import com.yjb.service.SendSmsService;
import com.yjb.mapper.YjbSmsSendRecRecordMapper;

import cmpp.testLogin;
import com.yjb.pojo.YjbSmsRecordInfoArgs;
@Service
public class SendSmsServiceImpl implements SendSmsService {
	
	@Autowired
	private YjbSendSmsMapper yjbSendSmsMapper;
	
	@Autowired
	private YjbSmsSendRecRecordMapper yjbSmsSendRecRecordMapper;
	
	@Autowired
	private YjbSmsRecordMapper yjbSmsRecordMapper;
	
	@Autowired
	private YjbContactMapper yjbContactMapper;

	
	
	@Override
	public YJBResult sendSms(YjbSendSms yjbSendSms) {
		/**实现群发
		 * 群发:就是号码不同，内容相同
		 * 可以把号码封装到一个数值，遍历切割一个个号码出来
		 * 再一个个发送 
		 */
		String sendContent = yjbSendSms.getSendContent();
		Long phoneNumber = yjbSendSms.getSendTo();
		//yjbSendSms.setSendTime(new Date());
		//yjbSendSms.setSendStatus(sendStatus);
		//yjbSendSmsMapper.insert(yjbSendSms);
		System.out.println("sendContent==============================================="+sendContent);
		System.out.println("phoneNumber==============================================="+phoneNumber);
		try{
			testLogin.connectISMG();
			testLogin.sendShortMsg(sendContent, phoneNumber.toString());
			
			//插入信息表
			yjbSendSms.setSendContent(sendContent);
			yjbSendSms.setSendStatus((byte)1);
			yjbSendSms.setSendTime(new Date());
			yjbSendSms.setSendTo(phoneNumber);
			
			yjbSendSmsMapper.insertSelective(yjbSendSms);
			
			Integer selectLastId = yjbSendSmsMapper.getSelectLastId();
			//System.out.println("selectLastId***************************"+selectLastId);
			String	smsId = selectLastId.toString();
			System.out.println("smsId***************************"+smsId);
			//插入记录表
			YjbSmsRecord record = new YjbSmsRecord();
			record.setSmsId(smsId);
			//record.setSmsId(yjbSendSms.getSendSmsId());
			record.setSmsContent(sendContent);
			record.setSmsStatus((byte)1);
			Integer selectCtcId = yjbContactMapper.selectCtcId(phoneNumber);//maybe have nullpointerException
			System.out.println("selectCtcId-----------------------------------------"+selectCtcId);
			if(selectCtcId!= null){
				record.setSmsCtc((long)selectCtcId);
			}else{
				record.setSmsCtc(phoneNumber);
			}			
			//record.setSmsCtc(phoneNumber); //这个插入的是联系人id,改成插入电话，不严谨，但是一样，本质也是要差id出来
			record.setSmsTime(new Date());
			yjbSmsRecordMapper.insert(record);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return YJBResult.ok();
	}

	/*public LayUITableResult getRecord(YjbSmsRecord YjbSmsRecord) {
		
		return null;
	}*/

	@Override
	public LayUITableResult getRecord(YjbSmsRecordInfoArgs yjbSmsRecordInfoArgs) {
		
		PageHelper.startPage(yjbSmsRecordInfoArgs.getPage(),yjbSmsRecordInfoArgs.getLimit());
		List<YjbSmsRecordCtcInfo> list = yjbSmsSendRecRecordMapper.selectRecord(yjbSmsRecordInfoArgs);
		//获取分页信息
		PageInfo<YjbSmsRecordCtcInfo> pageInfo = new PageInfo<>(list);
		//获取总记录数
		long total = pageInfo.getTotal();
		LayUITableResult result = new LayUITableResult();
		result.setData(list);
		result.setCount(total);
		result.setCode("0");	
		return result;	
	}

	@Override
	public YJBResult deleteByRecordId(int[] ids) {
		
		for(int i = 0 ;i < ids.length;i++){
			long id = ids[i];
			yjbSmsRecordMapper.deleteByPrimaryKey(id);
		}
		return YJBResult.ok();
	}
	

	
	@Override
	public YJBResult sendMoreSms(Long[] ctcId,String sendContent) {
		for(int i = 0;i < ctcId.length;i++){
			try {
				String ctcPhone = yjbContactMapper.selectByPrimaryKey(ctcId[i]).getCtcPhone();
				testLogin.connectISMG();
				testLogin.sendShortMsg(sendContent, ctcPhone);
				YjbSendSms yjbSendSms = new YjbSendSms();
				yjbSendSms.setSendContent(sendContent);
				yjbSendSms.setSendStatus((byte)1);
				yjbSendSms.setSendTime(new Date());
				
				//改成传id
				
				yjbSendSms.setSendTo(Long.parseLong(ctcPhone)); //电话是long类型
				
				yjbSendSmsMapper.insertSelective(yjbSendSms);
				
				Integer selectLastId = yjbSendSmsMapper.getSelectLastId();
				//System.out.println("selectLastId***************************"+selectLastId);
				String	smsId = selectLastId.toString();
				System.out.println("smsId***************************"+smsId);
				//插入记录表
				YjbSmsRecord record = new YjbSmsRecord();
				record.setSmsId(smsId);
				//record.setSmsId(yjbSendSms.getSendSmsId());
				record.setSmsContent(sendContent);
				record.setSmsStatus((byte)1);
				//获取联系人id
				//Integer selectCtcId = yjbContactMapper.selectCtcId(ctcId[i]);
				
				record.setSmsCtc(ctcId[i]);
				//record.setSmsCtc(phoneNumber); //这个插入的是联系人id,改成插入电话，不严谨，但是一样，本质也是要差id出来
				record.setSmsTime(new Date());
				yjbSmsRecordMapper.insert(record);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return YJBResult.ok();
	}

}
