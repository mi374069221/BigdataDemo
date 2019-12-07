package com.qm.controller;

import com.qm.service.WeatherWindDireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WeatherWindDireController {
    @Autowired
    private WeatherWindDireService weatherWindDireService;

    @RequestMapping(value = "/weatherWind", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getWeatherWindDireByDate(String nowTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(nowTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //System.out.println("当前传入时间："+date);
        String weatherWindDire = weatherWindDireService.getWeatherWindDire(date);
        //System.out.println(weatherWindDire);
        return weatherWindDire;
    }
}
