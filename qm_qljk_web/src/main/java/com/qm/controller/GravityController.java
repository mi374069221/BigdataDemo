package com.qm.controller;

import com.qm.service.GravityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class GravityController {
    @Autowired
    private GravityDataService allDataService;


    @RequestMapping(value="/gravityData",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getGraviityData(Date startTime){
/*        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
        String startTime = sdf.format(new Date());
        return allDataService.getAllDataByDate(startTime);*/
       // System.out.println("获取实时重力...");
        //System.out.println(startTime);
        String allDataByDate = allDataService.getGravityByDate(startTime);
        //system.out.println(allDataByDate);

        return allDataByDate;

    }
}
