package com.qm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GjController {


    @RequestMapping(value = "/gjData", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void saveGjData(String[] GjData){
        for (int i = 0; i <GjData.length ; i++) {

            System.out.println(GjData[i]);
        }

    }
}
