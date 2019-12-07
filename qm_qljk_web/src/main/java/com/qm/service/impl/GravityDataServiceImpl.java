package com.qm.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qm.mapper.AllDataMapper;
import com.qm.pojo.AllData;
import com.qm.pojo.AllDataExample;
import com.qm.pojo.GravityToPageBean;
import com.qm.service.GravityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GravityDataServiceImpl implements GravityDataService {
    @Autowired
    private AllDataMapper mapper;

    @Override
    public String getGravityByDate(Date startTime) {
        AllDataExample example = new AllDataExample();
        //构建自定义查询条件
        AllDataExample.Criteria criteria = example.createCriteria();
        //1、得到大于等于startTime的所有数据
        //criteria.andDatatimeGreaterThanOrEqualTo(startTime);
        //2、得到等于startTime的数据
        criteria.andDatatimeEqualTo(startTime);
        //1、得到大于等于startTime的所有数据
/*        example.setOrderByClause("dataTime ASC");
        List<AllData> lists = mapper.selectByExample(example);

        String[] gravityData = new String[lists.size()];
        int i = 0;
        for (AllData allData : lists) {
            gravityData[i] = allData.getGravity();
            i++;
        }*/
//
        //2、得到等于startTime的数据
        List<AllData> allData = mapper.selectByExample(example);
        String[] gravityData = new String[1];
        for (AllData data : allData) {
           gravityData[0] = data.getGravity();
        }
        //将数据转换为beanJson格式
        GravityToPageBean bean = new GravityToPageBean();
        bean.setValues(gravityData);
        ObjectMapper om = new ObjectMapper();
        String beanJson= null;
        try {
            beanJson = om.writeValueAsString(bean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return beanJson;
    }


/*       List list =new ArrayList();
        for (int i = 0; i <allData.size() ; i++) {
           list.add(allData.get(i).getGravity());
        }

        GravityToPageBean bean = new GravityToPageBean();
        bean.setValues(list);
        ObjectMapper om = new ObjectMapper();
        String beanJson= null;
        try {
            beanJson = om.writeValueAsString(bean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return beanJson;
    }*/


}
