package com.yjb.mapper;

import com.yjb.pojo.YjbContactGroup;
import com.yjb.pojo.YjbContactGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjbContactGroupMapper {
    int countByExample(YjbContactGroupExample example);

    int deleteByExample(YjbContactGroupExample example);

    int deleteByPrimaryKey(Integer groId);

    int insert(YjbContactGroup record);

    int insertSelective(YjbContactGroup record);

    List<YjbContactGroup> selectByExample(YjbContactGroupExample example);

    YjbContactGroup selectByPrimaryKey(Integer groId);

    int updateByExampleSelective(@Param("record") YjbContactGroup record, @Param("example") YjbContactGroupExample example);

    int updateByExample(@Param("record") YjbContactGroup record, @Param("example") YjbContactGroupExample example);

    int updateByPrimaryKeySelective(YjbContactGroup record);

    int updateByPrimaryKey(YjbContactGroup record);
}