package com.qm.controller;

import com.qm.service.AvgPvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AvgNumController {
    @Autowired
    private AvgPvService avgPvService;

    @RequestMapping(value="/avgTemper",produces="application/json;charset=UTF-8")
    @ResponseBody
    public  String getBarChart1(){
        //System.out.println("获取平均温度...");
        String avgPvNumByDate = avgPvService.getAvgPvNumByDate("20190919", "20190925");
        //System.out.println(avgPvNumByDate);
        return avgPvNumByDate;
    }

}
