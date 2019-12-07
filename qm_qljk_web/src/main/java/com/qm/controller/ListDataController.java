package com.qm.controller;

import com.qm.service.ListDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ListDataController {
    @Autowired
    private ListDataService listDataService;

    @RequestMapping(value = "/listData", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getListDataByDate(String startDate,String endDate) {
        /*SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String start = "2019-11-22 17:14:33";
        String end = "2019-11-22 17:14:49";
        try {
            startDate = format.parse(start);
            endDate = format.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
         /*String startDate = "2019-11-22 17:14:33";
         String endDate = "2019-11-22 17:14:49";*/
        String listDataByDate = listDataService.getListDataByDate(startDate, endDate);
        /*System.out.println("开始时间："+startDate+",结束时间："+endDate);
        System.out.println("获取list数据");
        System.out.println(listDataByDate);*/
        return listDataByDate;

    }
}
