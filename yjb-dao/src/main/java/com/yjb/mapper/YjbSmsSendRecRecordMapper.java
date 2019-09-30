package com.yjb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yjb.pojo.YjbSmsRecordCtcInfo;
import com.yjb.pojo.YjbSmsRecordInfoArgs;



public interface YjbSmsSendRecRecordMapper {
	
	//查询记录表，查询收发信息情况
	List<YjbSmsRecordCtcInfo> selectRecord(@Param("yjbSmsRecordInfoArgs")YjbSmsRecordInfoArgs yjbSmsRecordInfoArgs);
}
