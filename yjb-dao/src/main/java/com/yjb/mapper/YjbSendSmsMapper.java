package com.yjb.mapper;

import com.yjb.pojo.YjbSendSms;
import com.yjb.pojo.YjbSendSmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjbSendSmsMapper {
    int countByExample(YjbSendSmsExample example);

    int deleteByExample(YjbSendSmsExample example);

    int deleteByPrimaryKey(String sendSmsId);

    int insert(YjbSendSms record);

    int insertSelective(YjbSendSms record);

    List<YjbSendSms> selectByExampleWithBLOBs(YjbSendSmsExample example);

    List<YjbSendSms> selectByExample(YjbSendSmsExample example);

    YjbSendSms selectByPrimaryKey(String sendSmsId);

    int updateByExampleSelective(@Param("record") YjbSendSms record, @Param("example") YjbSendSmsExample example);

    int updateByExampleWithBLOBs(@Param("record") YjbSendSms record, @Param("example") YjbSendSmsExample example);

    int updateByExample(@Param("record") YjbSendSms record, @Param("example") YjbSendSmsExample example);

    int updateByPrimaryKeySelective(YjbSendSms record);

    int updateByPrimaryKeyWithBLOBs(YjbSendSms record);

    int updateByPrimaryKey(YjbSendSms record);
    
    //获取上一个插入的id
    int getSelectLastId();
    
}