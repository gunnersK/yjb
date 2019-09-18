package com.yjb.mapper;

import com.yjb.pojo.YjbSmsRecord;
import com.yjb.pojo.YjbSmsRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjbSmsRecordMapper {
    int countByExample(YjbSmsRecordExample example);

    int deleteByExample(YjbSmsRecordExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(YjbSmsRecord record);

    int insertSelective(YjbSmsRecord record);

    List<YjbSmsRecord> selectByExample(YjbSmsRecordExample example);

    YjbSmsRecord selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") YjbSmsRecord record, @Param("example") YjbSmsRecordExample example);

    int updateByExample(@Param("record") YjbSmsRecord record, @Param("example") YjbSmsRecordExample example);

    int updateByPrimaryKeySelective(YjbSmsRecord record);

    int updateByPrimaryKey(YjbSmsRecord record);
}