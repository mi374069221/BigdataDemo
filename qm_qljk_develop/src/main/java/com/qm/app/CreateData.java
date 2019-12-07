package com.qm.app;

import com.qm.utils.CreateDataUtils;

/**
 * @description: 创造数据
 * @author: coder mi
 * @create: 2019-10-30 17:50
 **/
public class CreateData {

    public static void main(String[] args) {
       //CreateDataUtils.createData("G:\\myData\\QMJK.txt", 30, false);
        CreateDataUtils.createData(args[0], Integer.parseInt(args[1]), Boolean.parseBoolean(args[2]));
    }
}
