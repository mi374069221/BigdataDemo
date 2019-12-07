package com.qm.mapper;

import com.qm.pojo.AllData;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.qm.pojo.AllDataExample;
import org.apache.ibatis.annotations.Param;

public interface AllDataMapper {
    int countByExample(AllDataExample example);

    int deleteByExample(AllDataExample example);

    int insert(AllData record);

    int insertSelective(AllData record);

    List<AllData> selectByExample(AllDataExample example);

    int updateByExampleSelective(@Param("record") AllData record, @Param("example") AllDataExample example);

    int updateByExample(@Param("record") AllData record, @Param("example") AllDataExample example);

    LinkedHashMap<String,String> selectTemperAndSpeed (@Param("startDate") String startDate, @Param("endDate") String endDate);

}