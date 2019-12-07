package com.qm.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qm.mapper.AllDataMapper;
import com.qm.pojo.ListDataBean;
import com.qm.service.ListDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ListDataServiceImpl implements ListDataService{

    @Autowired
    private AllDataMapper mapper;


    @Override
    public String getListDataByDate(String startDate,String endDate) {

        LinkedHashMap<String,String> listData = mapper.selectTemperAndSpeed(startDate, endDate);

        ListDataBean listDataBean =new ListDataBean();
        List<String> list = new ArrayList<>();
        if(listData==null){
            listDataBean.setMaxTemperature("暂无数据");
            listDataBean.setMinTemperature("暂无数据");
            listDataBean.setMaxWindSpeed("暂无数据");
            listDataBean.setMinWindSpeed("暂无数据");
        }else {

            for (String key : listData.keySet()) {
                list.add(listData.get(key)) ;
            }

            String maxTemper = list.get(0);
            String minTemper = list.get(1);
            String maxWindspeed = list.get(2);
            String minWindspeed = list.get(3);

            listDataBean.setMaxTemperature(maxTemper);
            listDataBean.setMinTemperature(minTemper);
            listDataBean.setMaxWindSpeed(maxWindspeed);
            listDataBean.setMinWindSpeed(minWindspeed);
        }



        ObjectMapper om = new ObjectMapper();
        String beanJson= null;
        try {
            beanJson = om.writeValueAsString(listDataBean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return beanJson;

    }
}
