package com.qm.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qm.mapper.AllDataMapper;
import com.qm.pojo.AllData;
import com.qm.pojo.AllDataExample;
import com.qm.pojo.WeatherWindDireBean;
import com.qm.service.WeatherWindDireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class WeatherWindDireServiceImpl implements WeatherWindDireService {
    @Autowired
    private AllDataMapper mapper;
    @Override
    public String getWeatherWindDire(Date nowTime) {
        AllDataExample example =new AllDataExample();
        AllDataExample.Criteria criteria = example.createCriteria();
        criteria.andDatatimeEqualTo(nowTime);


        List<AllData> allData = mapper.selectByExample(example);

        String[] arr = new String[2];
        for (AllData data : allData) {
            arr[0]=data.getWeather();
            arr[1]=data.getWinddirection().toString();
        }
        WeatherWindDireBean weatherWindDireBean = new WeatherWindDireBean();

            weatherWindDireBean.setNowWeather(arr[0]);
            weatherWindDireBean.setNowWindDire(arr[1]);

        ObjectMapper om = new ObjectMapper();
        String beanJson= null;
        try {
            beanJson = om.writeValueAsString(weatherWindDireBean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return beanJson;
    }
}
