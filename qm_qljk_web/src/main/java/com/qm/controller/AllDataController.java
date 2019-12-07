package com.qm.controller;

import com.qm.pojo.AllData;
import com.qm.service.AllDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AllDataController {
    @Autowired
    private AllDataService allDataService;

    @RequestMapping(value = "/allData", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getAllDataByDate(Date StartTime) {

        //System.out.println("实时数据获取中...");
        //System.out.println("当前传入时间:"+StartTime);
        /*SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2019-11-18 10:58:49";
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        //System.out.println("当前传入时间："+StartTime);
        String allDataByDate = allDataService.getAllDataByDate(StartTime);
        //System.out.println(allDataByDate);
        return allDataByDate;

    }

}
