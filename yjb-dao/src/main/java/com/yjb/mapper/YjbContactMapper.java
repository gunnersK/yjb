package com.yjb.mapper;

import com.yjb.pojo.YjbContact;
import com.yjb.pojo.YjbContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjbContactMapper {
    int countByExample(YjbContactExample example);

    int deleteByExample(YjbContactExample example);

    int deleteByPrimaryKey(Long ctcId);

    int insert(YjbContact record);

    int insertSelective(YjbContact record);

    List<YjbContact> selectByExample(YjbContactExample example);

    YjbContact selectByPrimaryKey(Long ctcId);

    int updateByExampleSelective(@Param("record") YjbContact record, @Param("example") YjbContactExample example);

    int updateByExample(@Param("record") YjbContact record, @Param("example") YjbContactExample example);

    int updateByPrimaryKeySelective(YjbContact record);

    int updateByPrimaryKey(YjbContact record);
    
    Integer selectCtcId(Long tel);
}