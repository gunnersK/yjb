package com.yjb.mapper;

import com.yjb.pojo.YjbReceSms;
import com.yjb.pojo.YjbReceSmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjbReceSmsMapper {
    int countByExample(YjbReceSmsExample example);

    int deleteByExample(YjbReceSmsExample example);

    int deleteByPrimaryKey(String receSmsId);

    int insert(YjbReceSms record);

    int insertSelective(YjbReceSms record);

    List<YjbReceSms> selectByExampleWithBLOBs(YjbReceSmsExample example);

    List<YjbReceSms> selectByExample(YjbReceSmsExample example);

    YjbReceSms selectByPrimaryKey(String receSmsId);

    int updateByExampleSelective(@Param("record") YjbReceSms record, @Param("example") YjbReceSmsExample example);

    int updateByExampleWithBLOBs(@Param("record") YjbReceSms record, @Param("example") YjbReceSmsExample example);

    int updateByExample(@Param("record") YjbReceSms record, @Param("example") YjbReceSmsExample example);

    int updateByPrimaryKeySelective(YjbReceSms record);

    int updateByPrimaryKeyWithBLOBs(YjbReceSms record);

    int updateByPrimaryKey(YjbReceSms record);
}