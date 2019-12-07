package com.qm.mapper;

import com.qm.pojo.AllData;
import com.qm.pojo.AllDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllDataMapper {
    int countByExample(AllDataExample example);

    int deleteByExample(AllDataExample example);

    int insert(AllData record);

    int insertSelective(AllData record);

    List<AllData> selectByExample(AllDataExample example);

    int updateByExampleSelective(@Param("record") AllData record, @Param("example") AllDataExample example);

    int updateByExample(@Param("record") AllData record, @Param("example") AllDataExample example);
}