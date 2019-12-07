package com.qm.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qm.mapper.AllDataMapper;
import com.qm.pojo.AllData;
import com.qm.pojo.AllDataExample;
import com.qm.pojo.AllDataToPageBean;
import com.qm.service.AllDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AllDataSderviceImpl  implements AllDataService{
    @Autowired
    private AllDataMapper mapper;
    @Override
    public String getAllDataByDate(Date StartTime) {
        AllDataExample example = new AllDataExample();
        AllDataExample.Criteria criteria = example.createCriteria();
        criteria.andDatatimeEqualTo(StartTime);

        //得到等于example的数据
        List<AllData> allData = mapper.selectByExample(example);
        String[] TemperatureArr =  new String[allData.size()];
        String[] WindspeedArr =  new String[allData.size()];
        String[] WinddirectionArr =  new String[allData.size()];
        String[] frequencyArr =  new String[allData.size()];
        String[] waterLevelArr =  new String[allData.size()];

        int i =0;
        for (AllData data : allData) {
            TemperatureArr[i]=data.getTemperature();
            WindspeedArr[i]=data.getWindspeed();
            WinddirectionArr[i]=data.getWinddirection().toString();
            frequencyArr[i]=data.getFrequency();
            waterLevelArr[i]=data.getWaterlevel();
            i++;
        }
        AllDataToPageBean bean = new AllDataToPageBean();
        bean.setTemperatureValues(TemperatureArr);
        bean.setWindSpeedValues(WindspeedArr);
        bean.setWindDirectionValues(WinddirectionArr);
        bean.setFrequencyValues(frequencyArr);
        bean.setWaterLevelValues(waterLevelArr);

        ObjectMapper om = new ObjectMapper();
        String beanJson= null;
        try {
            beanJson = om.writeValueAsString(bean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return beanJson;
    }
}
