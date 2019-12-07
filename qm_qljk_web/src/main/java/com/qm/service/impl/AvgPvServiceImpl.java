package com.qm.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qm.mapper.TAvgpvNumMapper;
import com.qm.pojo.AvgToPageBean;
import com.qm.pojo.TAvgpvNum;
import com.qm.pojo.TAvgpvNumExample;
import com.qm.service.AvgPvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvgPvServiceImpl implements AvgPvService{

    @Autowired
    private TAvgpvNumMapper mapper;
    @Override
    public String getAvgPvNumByDate(String startDate, String endDate) {
        TAvgpvNumExample example = new TAvgpvNumExample();
        TAvgpvNumExample.Criteria criteria = example.createCriteria();
        criteria.andDatestrBetween(startDate,endDate);
        //按照时间排序
        example.setOrderByClause("dateStr ASC");


        List<TAvgpvNum> lists = mapper.selectByExample(example);
        //转化数据格式为json，保持与前端需求数据一致
        // 数组大小
        int size = 7;

        String[] dates = new String[size];
        double[] datas = new double[size];

        int i = 0;
        for (TAvgpvNum tAvgpvNum : lists) {
            dates[i]=tAvgpvNum.getDatestr();
            datas[i]=tAvgpvNum.getAvgpvnum().doubleValue();
            i++;
        }

        AvgToPageBean bean = new AvgToPageBean();
        bean.setDates(dates);
        bean.setData(datas);
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
