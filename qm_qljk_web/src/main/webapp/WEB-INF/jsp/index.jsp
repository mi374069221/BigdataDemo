<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- BEGIN META -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="description" content="">
    <meta name="author" content="Olive Enterprise">
    <!-- END META -->
    <script src="/js/jquery-1.11.3.min.js"></script>
    <script src="/js/echarts.min.js"></script>
    <script src="/js/china.js"></script>

    <!-- BEGIN SHORTCUT ICON -->
    <link rel="shortcut icon" href="/img/favicon.ico">
    <!-- END SHORTCUT ICON -->
    <title>桥梁监控平台 - QLJK®championsoft数据平台</title>
    <!-- BEGIN STYLESHEET-->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- BOOTSTRAP CSS -->
    <link href="/css/bootstrap-reset.css" rel="stylesheet">
    <!-- BOOTSTRAP CSS -->
    <link href="/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
    <!-- FONT AWESOME ICON CSS -->
    <link href="/css/style.css" rel="stylesheet">
    <!-- THEME BASIC CSS -->
    <link href="/css/style-responsive.css" rel="stylesheet">
    <!-- THEME RESPONSIVE CSS -->
    <link href="/assets/morris.js-0.4.3/morris.css" rel="stylesheet">
    <!-- MORRIS CHART CSS -->
    <!--dashboard calendar-->
    <link href="/css/clndr.css" rel="stylesheet">
    <!-- CALENDER CSS -->

    <%--top--%>
    <link rel="stylesheet" href="/css/style_t.css">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js">
    </script>
    <script src="js/respond.min.js">
    </script>
    <![endif]-->
    <!-- END STYLESHEET-->

</head>
<body>
<!-- BEGIN SECTION -->
<section id="container">
    <!-- BEGIN HEADER -->
    <header class="header white-bg">
        <!-- SIDEBAR TOGGLE BUTTON -->
        <div class="sidebar-toggle-box">
            <div data-placement="right" class="fa fa-bars tooltips"></div>
        </div>
        <!-- SIDEBAR TOGGLE BUTTON  END-->
        <a href="index.html" class="logo"> CHAMPIONSOFT <span> QLJK </span><span>
					桥梁监控平台 </span>
        </a>
        <!-- START HEADER  NAV -->

        <nav class="nav notify-row" id="top_menu">

            <ul class="nav top-menu">
                <!-- START NOTIFY TASK BAR -->


                <!-- START NOTIFY INBOX BAR -->

                <li id="header_inbox_bar" class="dropdown"><a
                        data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
                        class="fa fa-envelope-o"> </i> <span class="badge bg-important">
								5 </span>
                </a>
                    <ul class="dropdown-menu extended inbox">
                        <li class="notify-arrow notify-arrow-blue"></li>
                        <li>
                            <p class="blue">You have 5 new messages</p>
                        </li>
                        <li><a href="#"> <span class="photo"> <img
                                alt="avatar" src="./img/logo-white.png">
								</span> <span class="subject"> <span class="from">
											Chintan Pandya </span> <span class="time"> Just now </span>
								</span> <span class="message"> Hello, this is an example msg. </span>
                        </a></li>
                        <li><a href="#"> <span class="photo"> <img
                                alt="avatar" src="./img/logo-white.png">
								</span> <span class="subject"> <span class="from"> Parth
											Jani </span> <span class="time"> 10 mins </span>
								</span> <span class="message"> Hi, Bro how are you ? </span>
                        </a></li>
                        <li><a href="#"> <span class="photo"> <img
                                alt="avatar" src="./img/logo-white.png">
								</span> <span class="subject"> <span class="from"> Jay
											Bardolia </span> <span class="time"> 3 hrs </span>
								</span> <span class="message"> This is awesome dashboard. </span>
                        </a></li>
                        <li><a href="#"> <span class="photo"> <img
                                alt="avatar" src="./img/logo-white.png">
								</span> <span class="subject"> <span class="from"> CoderMI
											BLACK </span> <span class="time"> Just now </span>
								</span> <span class="message"> Hello, this is metrolab </span>
                        </a></li>
                        <li><a href="#"> See all messages </a></li>
                    </ul>
                </li>
                <!-- END NOTIFY INBOX BAR -->

                <!-- START NOTIFY NOTIFICATION BAR -->

                <li id="header_notification_bar" class="dropdown"><a
                        data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
                        class="fa fa-bell-o"> </i> <span class="badge bg-warning">
								7 </span>
                </a>
                    <ul class="dropdown-menu extended notification">
                        <li class="notify-arrow notify-arrow-blue"></li>
                        <li>
                            <p class="blue">You have 7 new notifications</p>
                        </li>
                        <li><a href="#"> <span class="label label-danger">
										<i class="fa fa-bolt"> </i>
								</span> Server #3 overloaded. <span class="small italic"> 34
										mins </span>
                        </a></li>
                        <li><a href="#"> <span class="label label-warning">
										<i class="fa fa-bell"> </i>
								</span> Server #10 not respoding. <span class="small italic"> 1
										Hours </span>
                        </a></li>
                        <li><a href="#"> <span class="label label-danger">
										<i class="fa fa-bolt"> </i>
								</span> Database overloaded 24%. <span class="small italic"> 4
										hrs </span>
                        </a></li>
                        <li><a href="#"> <span class="label label-success">
										<i class="fa fa-plus"> </i>
								</span> New user registered. <span class="small italic"> Just
										now </span>
                        </a></li>
                        <li><a href="#"> <span class="label label-primary">
										<i class="fa fa-bullhorn"> </i>
								</span> Application error. <span class="small italic"> 10 mins </span>
                        </a></li>
                        <li><a href="#"> See all notifications </a></li>
                    </ul>
                </li>
                <!-- END NOTIFY NOTIFICATION BAR -->

            </ul>


        </nav>
        <!-- END HEADER NAV -->

        <!-- START USER LOGIN DROPDOWN  -->

        <div class="top-nav ">
            <ul class="nav pull-right top-menu">
                <li><input type="text" class="form-control search"
                           placeholder="Search"></li>
                <li class="dropdown"><a data-toggle="dropdown"
                                        class="dropdown-toggle" href="#"> <img alt=""
                                                                               src="img/dami.png"> <span
                        class="username">
								CoderMi </span> <b class="caret"> </b>
                </a>
                    <ul class="dropdown-menu extended logout">
                        <li class="log-arrow-up"></li>
                        <li><a href="#"> <i class=" fa fa-suitcase"> </i>
                            Profile
                        </a></li>
                        <li><a href="#"> <i class="fa fa-cog"> </i> Settings
                        </a></li>
                        <li><a href="#"> <i class="fa fa-bell-o"> </i>
                            Notification
                        </a></li>
                        <li><a href="login.html"> <i class="fa fa-key"> </i> Log
                            Out
                        </a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <!-- END USER LOGIN DROPDOWN  -->
    </header>
    <!-- END HEADER -->
    <!-- BEGIN SIDEBAR -->
    <aside>
        <div id="sidebar" class="nav-collapse">
            <ul class="sidebar-menu" id="nav-accordion">
                <li><a href="index.html" class="active"> <i
                        class="fa fa-dashboard"> </i> <span> 监控首页 </span>
                </a></li>

                <li class="sub-menu"><a href="javascript:;"> <i
                        class="fa fa-book"> </i> <span> 可视化系统 </span>
                </a>
                    <ul class="sub">
                        <li><a href="flow-trend.html"> 实时温度 </a></li>
                        <li><a href="flow-contract.html"> 实时风速 </a></li>
                        <li><a href="flow-online.html"> 实时重力 </a></li>
                        <li><a href="flow-detail.html"> 实时震动频率 </a></li>
                    </ul>
                </li>

                <li class="sub-menu"><a href="test.html"> <i class="fa fa-th"> 监控告警</i></a>


                </li>


                <li class="sub-menu"><a href="javascript:;"> <i
                        class="fa fa-book"> </i> <span> 监控分析 </span>
                </a>
                    <ul class="sub">
                        <li><a href="flow-trend.html"> 温度分析 </a></li>
                        <li><a href="flow-contract.html"> 风速分析 </a></li>
                        <li><a href="flow-contract.html"> 重力分析 </a></li>
                        <li><a href="flow-contract.html"> 水位分析 </a></li>
                        <li><a href="flow-online.html"> 自震频率 </a></li>
                        <li><a href="flow-detail.html"> 桥墩位移度 </a></li>
                        <li><a href="flow-detail.html"> 桥墩沉降度 </a></li>
                        <li><a href="flow-detail.html"> 桥墩倾斜移度 </a></li>
                    </ul>
                </li>


            </ul>
        </div>
    </aside>
    <!-- END SIDEBAR -->


    <!-- BEGIN MAIN CONTENT -->
    <section id="main-content">
        <!-- BEGIN WRAPPER  -->
        <section class="wrapper">

            <!-- 流量概况表 开始 -->
            <div class="row">
                <div class="col-lg-12 col-sm-12">

                            <!-- 里程框大盒子 -->
                            <div class="lichenggaikuang">
                                <!-- 顶部总体概况小盒子 -->
                                <div class="top">
                                    <div class="top-left clearfix">
                                    <a href="#">
                                        <!-- 总体概况的左边的小图片我截的图名字是info_0.png！！！！！！！！！！！！！ -->
                                        <img src="./img/info_0.png" alt="">
                                        <span>今日概况</span>
                                    </a>
                                    </div>

                                    <div class="top-right">
                                        <div class="time">
                                                   <p id="time_top" style="font-size: 20px">00:00:00</p>
                                                   <p id="date_top"></p>
                                        </div>
                                        <div class="weather">
                                            <img id="weatherImg" src="./img/weather/duoyun.png" alt="">
                                            <div class="weather-right">
                                                <p id="weather" style="font-size: 20px"></p>
                                                <p>广州市黄埔区</p>
                                            </div>
                                        </div>
                                    </div>

                                </div>


                                <%--<div id="trendtable" style="width: 90%;">
                                    <table id='pv_table' class="table table-bordered" margin=auto>
                                        <thead style='font-weight: bold'>
                                        <tr>
                                            <td>序列</td>
                                            <td>告警级别</td>
                                            <td>告警源</td>
                                            <td>告警原因</td>
                                            <td>告警值</td>
                                            <td>允许范围</td>
                                            <td>告警时间</td>
                                            <td>处理情况</td>
                                            <td>备注</td>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>严重</td>
                                            <td>温度传感器</td>
                                            <td>温度>24℃</td>
                                            <td>25℃</td>
                                            <td>-20℃——24℃</td>
                                            <td>2019/09/12 12:11:43</td>
                                            <td>
                                                <input name="gjcl" type="radio" checked="checked"/>未处理
                                                <input name="gjcl" type="radio" />已处理
                                            </td>
                                            <td>急需处理</td>
                                        </tr>
                                        <tr>
                                            <td>1</td>
                                            <td>严重</td>
                                            <td>温度传感器</td>
                                            <td>温度>24℃</td>
                                            <td>25℃</td>
                                            <td>-20℃——24℃</td>
                                            <td>2019/09/12 12:11:43</td>
                                            <td>
                                                <input name="gjcl1" type="radio" checked="checked"/>未处理
                                                <input name="gjcl1" type="radio" />已处理
                                            </td>
                                            <td>急需处理</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>--%>


                                <!-- 下部分三块大盒子 -->
                                <div class="bottom">
                                    <ul>
                                        <li>
                                            <!-- 第一个盒子 -->
                                            <div class="box-color">
                                                <!-- 盒子左边 -->
                                                <div class="left-1">
                                                    <img class="clearfix" src="./img/info_2.png" alt="">
                                                    <p>最高温度(C)</p>
                                                    <span id="highTemper"></span>
                                                </div>
                                                <!-- 盒子右边 -->
                                                <div class="right-1">
                                                    <img src="./img/info_3.png" alt="">
                                                    <p>最低温度(C)</p>
                                                    <span id="lowerTemper"></span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <!-- 第二个盒子 -->
                                            <div class="box-color">
                                                <!-- 盒子左边 -->
                                                <div class="left-2">
                                                    <img class="clearfix" src="./img/info_4.png" alt="">
                                                    <p >水位</p>
                                                    <span id="waterLevel"></span>
                                                </div>
                                                <!-- 盒子右边 -->
                                                <div class="right-2">
                                                    <img src="./img/info_5.png" alt="">
                                                    <p>风向</p>
                                                    <span id="windDirection"></span>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <!-- 第三个盒子 -->
                                            <div class="box-color">
                                                <!-- 盒子左边 -->
                                                <div class="left-3">
                                                    <img class="clearfix" src="./img/info_6.png" alt="">
                                                    <p>最大风速(级)</p>
                                                    <span id="highWindSpeed"></span>
                                                </div>
                                                <!-- 盒子右边 -->
                                                <div class="right-3">
                                                    <img src="./img/info_7.png" alt="">
                                                    <p>最小风速(级)</p>
                                                    <span id="lowerWindSpeed"></span>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                </div>

                            </div>

                </div>
            </div>
            <!-- 概况表 结束-->
            <!-- 折线图 row 开始 -->
            <div class="row">
                <div class="col-lg-12 col-sm-12">
                    <section class="panel">
                        <div class="panel-body">
                            <div id="main" style="width: 100%; height: 500px;">
                            </div>
                            <script type="text/javascript">
                                // 基于准备好的dom，初始化echarts实例
                                var myChart = echarts.init(document.getElementById('main'));
                                var dataMap = {};
                                function dataFormatter(obj) {
                                    var pList = ['北明桥','天和桥','河畔桥','山水桥','长江桥','辽远桥','吉祥桥','龙江桥','上紫桥','江与桥 ','西山桥','甘露桥','青海桥','宁静桥 ','新新桥'];
                                    var temp;
                                    for (var year = 1; year <= 12; year++) {
                                        var max = 0;
                                        var sum = 0;
                                        temp = obj[year];
                                        for (var i = 0, l = temp.length; i < l; i++) {
                                            max = Math.max(max, temp[i]);
                                            sum += temp[i];
                                            obj[year][i] = {
                                                name : pList[i],
                                                value : temp[i]
                                            }
                                        }
                                        obj[year + 'max'] = Math.floor(max / 100) * 100;
                                        obj[year + 'sum'] = sum;
                                    }
                                    return obj;
                                }



                                dataMap.dataPI = dataFormatter({
                                    //max : 4000,
                                    12:[136.27,159.72,2905.73,641.42,1306.3,1915.57,1277.44,1701.5,124.94,3064.78,1583.04,2015.31,1612.24,1391.07,3973.85],
                                    11:[124.36,145.58,2562.81,554.48,1095.28,1631.08,1050.15,1302.9,114.15,2540.1,1360.56,1729.02,1363.67,1206.98,3588.28],
                                    10:[118.29,128.85,2207.34,477.59,929.6,1414.9,980.57,1154.33,113.82,2261.86,1163.08,1495.45,1182.74,1098.66,3226.64],
                                    9:[112.83,122.58,2034.59,313.58,907.95,1302.02,916.72,1088.94,111.8,2100.11,1095.96,1418.09,1158.17,1060.38,3002.65],
                                    8:[101.26,110.19,1804.72,311.97,762.1,1133.42,783.8,915.38,101.84,1816.31,986.02,1200.18,1002.11,905.77,2509.14],
                                    7:[88.8,103.35,1461.81,276.77,634.94,939.43,672.76,750.14,93.81,1545.05,925.1,1011.03,865.98,786.14,2138.9],
                                    6:[88.68,112.38,1400,262.42,589.56,882.41,625.61,684.6,90.26,1461.51,892.83,966.5,827.36,727.37,1963.51],
                                    5:[87.36,105.28,1370.43,276.3,522.8,798.43,568.69,605.79,83.45,1367.58,814.1,950.5,786.84,664.5,1778.45],
                                    4:[84.11,89.91,1064.05,215.19,420.1,615.8,488.23,504.8,81.02,1162.45,717.85,749.4,692.94,560,1480.67],
                                    3:[82.44,84.21,956.84,197.8,374.69,590.2,446.17,474.2,79.68,1110.44,685.2,783.66,664.78,535.98,1390],
                                    2:[101.26,110.19,1804.72,311.97,762.1,1133.42,783.8,915.38,101.84,1816.31,986.02,1200.18,1002.11,905.77,2509.14],
                                    1:[88.68,112.38,1400,262.42,589.56,882.41,625.61,684.6,90.26,1461.51,892.83,966.5,827.36,727.37,1963.51]

                                });

                                dataMap.dataSI = dataFormatter({
                                    //max : 26600,
                                    12:[3752.48,5928.32,13126.86,6635.26,8037.69,12152.15,5611.48,5962.41,7927.89,25203.28,16555.58,8309.38,9069.2,6390.55,24017.11],
                                    11:[3388.38,4840.23,10707.68,5234,6367.69,9976.82,4506.31,5025.15,7218.32,21753.93,14297.93,6436.62,7522.83,5122.88,21238.49],
                                    10:[2855.55,3987.84,8959.83,3993.8,5114,7906.34,3541.92,4060.72,6001.78,18566.37,11908.49,4905.22,6005.3,3919.45,18901.83],
                                    9:[2626.41,3709.78,8701.34,4242.36,4376.19,7158.84,3097.12,4319.75,6085.84,16993.34,11567.42,5318.44,3554.81,17571.98,10259.99],
                                    8:[2509.4,2892.53,7201.88,3454.49,3193.67,5544.14,2475.45,3695.58,5571.06,14471.26,10154.25,4476.42,2975.53,14647.53,8282.83],
                                    7:[2191.43,2457.08,6110.43,2755.66,2374.96,4566.83,1915.29,3365.31,4969.95,12282.89,8511.51,3695.04,2419.74,12574.03,6724.61],
                                    6:[2026.51,2135.07,5271.57,2357.04,1773.21,3869.4,1580.83,2971.68,4381.2,10524.96,7164.75,3175.92,1917.47,10478.62,5514.14],
                                    5:[1853.58,1685.93,4301.73,1919.4,1248.27,3061.62,1329.68,2487.04,3892.12,8437.99,6250.38,2770.49,1566.4,8478.69,4182.1],
                                    4:[1487.15,1337.31,3417.56,1463.38,967.49,2898.89,1098.37,2084.7,3209.02,6787.11,5096.38,2340.82,1204.33,6485.05,3310.14],
                                    3:[1249.99,1069.08,2911.69,1134.31,754.78,2609.85,943.49,1843.6,2622.45,5604.49,4090.48,2036.97,941.77,5184.98,2768.75],
                                    2:[2626.41,3709.78,8701.34,4242.36,4376.19,7158.84,3097.12,4319.75,6085.84,16993.34,11567.42,4198.93,5318.44,3554.81,17571.98],
                                    1:[2026.51,2135.07,5271.57,2357.04,1773.21,3869.4,1580.83,2971.68,4381.2,10524.96,7164.75,2245.9,3175.92,1917.47,10478.62]

                                });

                                dataMap.dataTI = dataFormatter({
                                    //max : 25000,
                                    12:[12363.18,5219.24,8483.17,3960.87,5015.89,8158.98,3679.91,4918.09,11142.86,20842.21,14180.23,4975.96,6878.74,3921.2,17370.8],
                                    11:[10600.84,4238.65,7123.77,3412.38,4209.03,6849.37,3111.12,4040.55,9833.51,17131.45,12063.82,4193.69,5850.62,3121.4,14343.14],
                                    10:[9179.19,3405.16,6068.31,2886.92,3696.65,5891.25,2756.26,3371.95,8930.85,13629.07,9918.78,3662.15,5048.49,2637.07,11768.18],
                                    9:[8375.76,2886.65,5276.04,2759.46,3212.06,5207.72,2412.26,2905.68,7872.23,11888.53,8799.31,3234.64,4346.4,2355.86,10358.64],
                                    8:[7236.15,2250.04,4600.72,2257.99,2467.41,4486.74,2025.44,2493.04,6821.11,9730.91,7613.46,2789.78,3770,1918.95,8620.24],
                                    7:[5837.55,1902.31,3895.36,1846.18,1934.35,3798.26,1687.07,2096.35,5508.48,7914.11,6281.86,2390.29,3022.83,1614.65,7187.264],
                                    6:[4854.33,1658.19,3340.54,1611.07,1542.26,3295.45,1413.83,1857.42,4776.2,6612.22,5360.1,2137.77,2551.41,1411.92,5924.74],
                                    5:[4092.27,1319.76,2805.47,1375.67,1270,2811.95,1223.64,1657.77,4097.26,5198.03,4584.22,1963.9,2206.02,1225.8,4764.7],
                                    4:[3435.95,1150.81,2439.68,1176.65,1000.79,2487.85,1075.48,1467.9,3404.19,4493.31,3890.79,1638.42,1949.91,1043.08,4112.43],
                                    3:[2982.57,997.47,2149.75,992.69,811.47,2258.17,958.88,1319.4,3038.9,3891.92,3227.99,1399.02,1765.8,972.73,3700.52],
                                    2:[7236.15,2250.04,4600.72,2257.99,2467.41,4486.74,2025.44,2493.04,6821.11,9730.91,7613.46,2789.78,3770,1918.95,8620.24],
                                    1:[4092.27,1319.76,2805.47,1375.67,1270,2811.95,1223.64,1657.77,4097.26,5198.03,4584.22,1963.9,2206.02,1225.8,4764.7]


                                });



                                option = {
                                    baseOption: {
                                        timeline: {
                                            // y: 0,
                                            axisType: 'category',
                                            // realtime: false,
                                            // loop: false,
                                            autoPlay: true,
                                            // currentIndex: 2,
                                            playInterval: 1000,
                                            // controlStyle: {
                                            //     position: 'left'
                                            // },
                                            data: [
                                                '2019-01-01','2019-02-01','2019-03-01',
                                                {
                                                    value: '2019-04-01',
                                                    tooltip: {
                                                        formatter: '{b} 幅度达到一个高度'
                                                    },
                                                    symbol: 'diamond',
                                                    symbolSize: 16
                                                },
                                                '2019-05-01', '2019-06-01','2019-07-01','2019-08-01','2019-09-01',
                                                {
                                                    value: '2019-10-01',
                                                    tooltip: {
                                                        formatter: function (params) {
                                                            return params.name + '幅度达到又一个高度';
                                                        }
                                                    },
                                                    symbol: 'diamond',
                                                    symbolSize: 18
                                                },
                                                '2019-11-01','2019-12-01'
                                            ],
                                            label: {
                                                formatter : function(s) {
                                                    return (new Date(s)).getMonth()+1+"月份";
                                                }
                                            }
                                        },
                                        title: {
                                            subtext: '数据来自结构传感器'
                                        },
                                        tooltip: {
                                        },
                                        legend: {
                                            x: 'right',
                                            data: ['桥墩沉降度', '桥墩位移度', '桥墩倾斜度'],
                                            selected: {
                                               // '幅度': false,
                                            }
                                        },
                                        calculable : true,
                                        grid: {
                                            top: 80,
                                            bottom: 100,
                                            tooltip: {
                                                trigger: 'axis',
                                                axisPointer: {
                                                    type: 'shadow',
                                                    label: {
                                                        show: true,
                                                        formatter: function (params) {
                                                            return params.value.replace('\n', '');
                                                        }
                                                    }
                                                }
                                            }
                                        },
                                        xAxis: [
                                            {
                                                'type':'category',
                                                'axisLabel':{'interval':0},
                                                'data':[
                                                    '北明桥','\n天和桥','河畔桥','\n山水桥','长江桥','\n辽远桥','吉祥桥',
                                                    '\n龙江桥','上紫桥','\n江与桥 ','西山桥','\n甘露桥','青海桥','\n宁静桥 ','新新桥'
                                                ],
                                                splitLine: {show: false}
                                            }
                                        ],
                                        yAxis: [
                                            {
                                                type: 'value',
                                                name: '幅度（cm）'
                                            }
                                        ],
                                        series: [
                                            {name: '桥墩沉降度', type: 'bar'},
                                            {name: '桥墩位移度', type: 'bar'},
                                            {name: '桥墩倾斜度', type: 'bar'},
                                            {
                                                name: '幅度占比',
                                                type: 'pie',
                                                center: ['75%', '35%'],
                                                radius: '28%',
                                                z: 100
                                            }
                                        ]
                                    },
                                    options: [
                                        {
                                            title: {text: '2019年1月全市桥梁结构数据'},
                                            series: [
                                                {data: dataMap.dataPI['1']},
                                                {data: dataMap.dataSI['1']},
                                                {data: dataMap.dataTI['1']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['1sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['1sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['1sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年2月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['2']},
                                                {data: dataMap.dataSI['2']},
                                                {data: dataMap.dataTI['2']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['2sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['2sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['2sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年3月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['3']},
                                                {data: dataMap.dataSI['3']},
                                                {data: dataMap.dataTI['3']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['3sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['3sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['3sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年4月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['4']},
                                                {data: dataMap.dataSI['4']},
                                                {data: dataMap.dataTI['4']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['4sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['4sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['4sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年5月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['5']},
                                                {data: dataMap.dataSI['5']},
                                                {data: dataMap.dataTI['5']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['5sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['5sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['5sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年6月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['6']},
                                                {data: dataMap.dataSI['6']},
                                                {data: dataMap.dataTI['6']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['6sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['6sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['6sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年7月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['7']},
                                                {data: dataMap.dataSI['7']},
                                                {data: dataMap.dataTI['7']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['7sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['7sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['7sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年8月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['8']},
                                                {data: dataMap.dataSI['8']},
                                                {data: dataMap.dataTI['8']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['8sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['8sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['8sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年9月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['9']},
                                                {data: dataMap.dataSI['9']},
                                                {data: dataMap.dataTI['9']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['9sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['9sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['9sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年10月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['10']},
                                                {data: dataMap.dataSI['10']},
                                                {data: dataMap.dataTI['10']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['10sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['10sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['10sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年11月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['11']},
                                                {data: dataMap.dataSI['11']},
                                                {data: dataMap.dataTI['11']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['11sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['11sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['11sum']}
                                                ]}
                                            ]
                                        },
                                        {
                                            title : {text: '2019年12月全市桥梁结构数据'},
                                            series : [
                                                {data: dataMap.dataPI['12']},
                                                {data: dataMap.dataSI['12']},
                                                {data: dataMap.dataTI['12']},
                                                {data: [
                                                    {name: '桥墩沉降度', value: dataMap.dataPI['12sum']},
                                                    {name: '桥墩位移度', value: dataMap.dataSI['12sum']},
                                                    {name: '桥墩倾斜度', value: dataMap.dataTI['12sum']}
                                                ]}
                                            ]
                                        }
                                    ]
                                };

                                myChart.setOption(option);

                            </script>
                        </div>
                    </section>
                </div>
            </div>


            <!-- 折线图 row 结束 -->

            <!-- BEGIN ROW  最近7天日平均温度-->
            <div class="row">
                <div class="col-lg-6 col-sm-6">
                    <section class="panel">
                        <div class="panel-body">
                            <div id="main1" style="width: 100%; height: 400px;"></div>
                            <script type="text/javascript">
                                $(document)
                                    .ready(
                                        function () {
                                            var myChart1 = echarts
                                                .init(document
                                                    .getElementById('main1'));
                                            // 显示标题，图例和空的坐标轴
                                            myChart1
                                                .setOption({
                                                    title: {
                                                        text: '最近7天日平均温度',
                                                        subtext: '数据来自温度传感器'
                                                    },
                                                    tooltip: {},
                                                    legend: {
                                                        data: ['日平均温度']
                                                    },
                                                    xAxis: {
                                                        data: []
                                                    },
                                                    yAxis: {},
                                                    series: [{
                                                        name: '日平均温度',
                                                        type: 'bar',
                                                        data: []
                                                    }]
                                                });
                                            //loading 动画
                                            myChart1.showLoading();
                                            // 异步加载数据
                                            $.get( 'http://localhost:8080/avgTemper').done(function (data) {
                                                        // 填入数据
                                                        myChart1.setOption({
                                                                xAxis: {
                                                                    data: data.dates
                                                                },
                                                                series: [{
                                                                    // 根据名字对应到相应的系列
                                                                    name: '平均温度',
                                                                    data: data.data
                                                                }]
                                                            });
                                                        //数据加载完成后再调用 hideLoading 方法隐藏加载动画
                                                        myChart1
                                                            .hideLoading();
                                                    });
                                        });
                            </script>

                        </div>
                    </section>
                </div>
                <div class="col-lg-6 col-sm-6">
                    <section class="panel">
                        <div class="panel-body">

                            <div id="main2" style="width: 600px; height: 400px;"
                                 align="center"></div>
                            <script type="text/javascript">
                                // 基于准备好的dom，初始化echarts实例
                                var myChart2 = echarts.init(document
                                    .getElementById('main2'));
                                function randomData() {
                                    now = new Date(+now + oneDay);
                                    var valueName = now.getFullYear() + '/' + (now.getMonth() + 1) + '/' + now.getDate() +
                                        ' ' + (now.getHours() >= 10 ? now.getHours() : '0' + now.getHours()) + ':' +
                                        (now.getMinutes() >= 10 ? now.getMinutes() : '0' + now.getMinutes()) +
                                        ':' + (now.getSeconds() >= 10 ? now.getSeconds() : '0' + now.getSeconds());

                                    $.get('http://localhost:8080/gravityData',{startTime:valueName}).done(function (data) {
                                        value=data.values;
                                    })

                                    return {
                                        name: now.toString(),
                                        value: [
                                            valueName,
                                            Math.round(value)
                                        ]
                                    }
                                }

                                var data = [];
                                var now = +new Date()-60*1000;
                                var oneDay = 1000;
                                var value =null;
                                for (var i = 0; i < 60; i++) {
                                    data.push(randomData());
                                }

                                var temp = 59;

                                option = {
                                    title: {
                                        text: '实时重力监测',
                                        subtext: '数据来自重力传感器'
                                    },
                                    tooltip: {
                                        trigger: 'axis',
                                        formatter: function(params) {
                                            params = params[0];
                                            var date = new Date(params.name);
                                            return date.getFullYear() + '/' + (date.getMonth() + 1) + '/' + date.getDate() + ':' + date.getHours()+":"+ date.getMinutes()+":"+ date.getSeconds()+ ':' +  params.value[1];
                                        },
                                        axisPointer: {
                                            animation: false
                                        }
                                    },
                                    xAxis: {
                                        type: 'time',
                                        splitLine: {
                                            show: false
                                        },
                                        triggerEvent: true
                                    },
                                    yAxis: {
                                        type: 'value',
                                        boundaryGap: [0, '100%'],
                                        splitLine: {
                                            show: false
                                        }
                                    },
                                    series: [{
                                        name: '实时数据',
                                        type: 'line',
                                        showSymbol: false,
                                        hoverAnimation: false,
                                        markPoint: {
                                            data: []
                                        }

                                    }]
                                };

                                setInterval(function() {

                                    data.shift();
                                    data.push(randomData());

                                    myChart2.setOption({
                                        series: [{
                                            data: data,
                                            markLine: {
                                                data: [
                                                    [{
                                                        symbol: 'none',
                                                        x: '92%',
                                                        yAxis: data[temp].value[1]
                                                    }, {
                                                        symbol: 'circle',
                                                        label: {
                                                            normal: {
                                                                position: 'start',
                                                                formatter: '实时\n{c}'
                                                            }
                                                        },
                                                        name: '实时重力',
                                                        value: data[temp].value[1],
                                                        xAxis: data[temp].value[0],
                                                        yAxis: data[temp].value[1]
                                                    }]
                                                ]
                                            }
                                        }]
                                    });
                                }, 1000);


                                myChart2.setOption(option);
                            </script>
                        </div>
                    </section>
                </div>

            </div>
            <!-- END ROW  -->


            <!-- 动态加载数据示例 开始-->
            <div class="row">
                <div class="col-lg-12 col-sm-12">
                    <section class="panel">
                        <div class="panel-body">
                            <div id="main3" style="width: 100%; height: 400px;"></div>
                            <script type="text/javascript">
                                // 基于准备好的dom，初始化echarts实例
                                var myChart3 = echarts.init(document.getElementById('main3'));

                                function randomData1(data) {
                                    now1 = new Date(+now1+ oneDay1);
                                    var valueName1 = now1.getFullYear() + '/' + (now1.getMonth() + 1) + '/' + now1.getDate() +
                                        ' ' + (now1.getHours() >= 10 ? now1.getHours() : '0' + now1.getHours()) + ':' +
                                        (now1.getMinutes() >= 10 ? now1.getMinutes() : '0' + now1.getMinutes()) +
                                        ':' + (now1.getSeconds() >= 10 ? now1.getSeconds() : '0' + now1.getSeconds());

                                    $.get('http://localhost:8080/allData',{StartTime:valueName1}).done(function (datas) {
                                        temperature=datas.temperatureValues;
                                        windSpeed = datas.windSpeedValues;
                                        windDirection=datas.windDirectionValues;
                                        frequency=datas.frequencyValues;
                                        waterLevel=datas.waterLevelValues;
                                        if(waterLevel==''){
                                            waterLevel='暂无数据'
                                        }
                                        $('#waterLevel').html('<span>' + waterLevel + '</span>');

                                        if(30>=temperature>24){
                                            JKGJ.push(['警告','温度传感器','温度超过24℃，比较危险','-20至30℃',temperature.toString(),valueName1,'未处理','192.168.2.201']);
                                        }else if(temperature>30||temperature<-20){
                                            JKGJ.push(['严重','温度传感器','温度超过30℃或者低于-20℃，非常严重','-20至30℃',temperature.toString(),valueName1,'未处理','192.168.2.201']);
                                        }
                                        if(10>windSpeed>8){
                                            JKGJ.push(['警告','风力传感器','风速超过8级，比较危险','1至10级',windSpeed.toString(),valueName1,'未处理','192.168.2.202'])
                                        }else if(windSpeed>=10){
                                            JKGJ.push(['严重','风力传感器','风速已超过10级，非常危险','1至10级',windSpeed.toString(),valueName1,'未处理','192.168.2.202'])
                                        }


                                    })

                                    data.fx.push(windDirection);
                                    data.wd.push(temperature);
                                    data.sw.push(waterLevel);
                                    data.zdpl.push(frequency);
                                    data.fs.push(windSpeed);

                                    data.x.push(valueName1);

                                    return data;

                                }

                                var data1 = {fx:[],fs:[],wd:[],sw:[],zdpl:[],x:[]};
                                var JKGJ=[];

                                var now1 = +new Date()-59*1000;
                                var oneDay1 = 1000;
                                var temperature ='';
                                var windSpeed='';
                                var windDirection='';
                                var frequency='';
                                var waterLevel='';
                                for (var i = 0; i < 60; i++) {
                                    data1 = randomData1(data1);
                                }
                                console.info(JKGJ)
                                setInterval(function() {
                                    data1.x.shift()
                                    data1.wd.shift()
                                    data1.sw.shift()
                                    data1.fs.shift()
                                    data1.zdpl.shift()
                                    data1.fx.shift()
                                    data1 = randomData1(data1);
                                    // 指定图表的配置项和数据
                                    var option1 = {
                                        title: {
                                            text: '桥梁实时指标监测',
                                            //subtext: '数据来自传感器'
                                        },
                                        tooltip: {
                                            trigger: 'axis',
                                            axisPointer: {
                                                type: 'cross',
                                                label: {
                                                    backgroundColor: '#6a7985'
                                                }
                                            }
                                        },
                                        legend: {
                                            data: ['温度', '风速', '风向', '震动频率', '水位']
                                        },
                                        toolbox: {
                                            feature: {
                                                saveAsImage: {}
                                            }
                                        },
                                        grid: {
                                            left: '3%',
                                            right: '4%',
                                            bottom: '3%',
                                            containLabel: true
                                        },
                                        xAxis: [
                                            {
                                                type : 'category',
                                                boundaryGap : true,
                                                data: data1.x,

                                            }
                                        ],
                                        yAxis: [
                                            {
                                                type: 'value'
                                            }
                                        ],
                                        series: [
                                            {
                                                name: '温度',
                                                type: 'line',
                                                stack: '总量',
                                                areaStyle: {},
                                                data: data1.wd,
                                                label: {
                                                    normal: {
                                                        formatter: function (v) {
                                                            return v.value || ""
                                                        }
                                                    }
                                                }
                                            },
                                            {
                                                name: '风速',
                                                type: 'line',
                                                stack: '总量',
                                                areaStyle: {},
                                                data: data1.fs,
                                                label: {
                                                    normal: {
                                                        formatter: function (v) {
                                                            return v.value || ""
                                                        }
                                                    }
                                                }

                                            },
                                            {
                                                name: '风向',
                                                type: 'line',
                                                stack: '总量',
                                                areaStyle: {},
                                                data: data1.fx,
                                                label: {
                                                    normal: {

                                                        formatter: function (v) {
                                                            return v.value || ""
                                                        }
                                                    }
                                                }
                                            },
                                            {
                                                name: '震动频率',
                                                type: 'line',
                                                stack: '总量',
                                                areaStyle: {normal: {}},
                                                data: data1.zdpl,
                                                label: {
                                                    normal: {
                                                        formatter: function (v) {
                                                            return v.value || ""
                                                        }
                                                    }
                                                }
                                            },
                                            {
                                                name: '水位',
                                                type: 'line',
                                                stack: '总量',
                                                label: {
                                                    normal: {
                                                        show: false,
                                                        position: 'top'
                                                    }
                                                },
                                                areaStyle: {normal: {}},
                                                data: data1.sw,
                                                label: {
                                                    normal: {
                                                        formatter: function (v) {
                                                            return v.value || ""
                                                        }
                                                    }
                                                }
                                            }
                                        ]
                                    };

                                    myChart3.setOption(option1);
                                }, 1000);


                            </script>
                        </div>
                    </section>
                </div>
            </div>
            <!-- 动态加载数据示例 结束-->

        </section>
        <!-- END WRAPPER  -->
    </section>
    <!-- END MAIN CONTENT -->
    <!-- BEGIN FOOTER -->
    <footer class="site-footer">
        <div class="text-center">
            2019 &copy; QLJK by <a href="www.championsoft.cn" target="_blank"> www.championsoft.cn
        </a> <a href="www.championsoft.cn" class="go-top"> <i
                class="fa fa-angle-up"> </i>
        </a>
        </div>
    </footer>
    <!-- END  FOOTER -->
</section>
<!-- END SECTION -->

<%--自定义js结束--%>
<!-- BASIC JQUERY 1.8.3 LIB. JS -->
<script src="js/bootstrap.min.js"></script>
<!-- BOOTSTRAP JS -->
<script src="js/jquery.dcjqaccordion.2.7.js"></script>
<!-- ACCORDIN JS -->
<script src="js/jquery.scrollTo.min.js"></script>
<!-- SCROLLTO JS -->
<script src="js/jquery.nicescroll.js"></script>
<!-- NICESCROLL JS -->
<script src="js/respond.min.js"></script>
<!-- RESPOND JS -->
<script src="js/jquery.sparkline.js"></script>
<!-- SPARKLINE JS -->
<script src="js/sparkline-chart.js"></script>
<!-- SPARKLINE CHART JS -->
<script src="js/common-scripts.js"></script>
<!-- BASIC COMMON JS -->
<script src="js/count.js"></script>
<!-- COUNT JS -->
<!--Morris-->
<script src="assets/morris.js-0.4.3/morris.min.js"></script>
<!-- MORRIS JS -->
<script src="assets/morris.js-0.4.3/raphael-min.js"></script>
<!-- MORRIS  JS -->
<script src="js/chart.js"></script>
<!-- CHART JS -->
<!--Calendar-->
<script src="js/calendar/clndr.js"></script>
<!-- CALENDER JS -->
<script src="js/calendar/evnt.calendar.init.js"></script>
<!-- CALENDER EVENT JS -->
<script src="js/calendar/moment-2.2.1.js"></script>
<!-- CALENDER MOMENT JS -->
<!-- UNDERSCORE JS -->
<script src="assets/jquery-knob/js/jquery.knob.js"></script>
<!-- JQUERY KNOB JS -->

<!-- BEGIN JS -->
<%--自定义js开始--%>
<script>
    //获取最该最低温度和风速
    function listData() {
        var startTime = new Date().getFullYear() + '-' + (new Date().getMonth() + 1) + '-' + new Date().getDate() +
            ' ' + '00:00:00';
        var endTime = new Date().getFullYear() + '-' + (new Date().getMonth() + 1) + '-' + new Date().getDate() +
            ' ' + (new Date().getHours() >= 10 ? new Date().getHours() : '0' + new Date().getHours()) + ':' +
            (new Date().getMinutes() >= 10 ? new Date().getMinutes() : '0' + new Date().getMinutes()) +
            ':' + (new Date().getSeconds() >= 10 ? new Date().getSeconds() : '0' + new Date().getSeconds());
        $.post('http://localhost:8080/listData',{startDate:startTime,endDate:endTime},function (listdata) {

                document.getElementById("highTemper").innerHTML=listdata.maxTemperature;
                document.getElementById("lowerTemper").innerHTML=listdata.minTemperature;
                document.getElementById("highWindSpeed").innerHTML=listdata.maxWindSpeed;
                document.getElementById("lowerWindSpeed").innerHTML=listdata.minWindSpeed;

        });
    }


    //获取当前时间
    function fnW(str) {
        var num;
        str >= 10 ? num = str : num = "0" + str;
        return num;
    }
    var timer = setInterval(function () {
        var date = new Date();
        var year = date.getFullYear(); //当前年份
        var month = date.getMonth(); //当前月份
        var data = date.getDate(); //天
        var hours = date.getHours(); //小时
        var minute = date.getMinutes(); //分
        var second = date.getSeconds(); //秒
        var day = date.getDay(); //获取当前星期几
        var ampm = hours < 12 ? 'am' : 'pm';
        $('#time_top').html(fnW(hours) + ":" + fnW(minute) + ":" + fnW(second));
        $('#date_top').html('<span>' + year + '/' + (month + 1) + '/' + data + ' '+'</span><span>' + ampm +' '+ '</span><span>周' + day + '</span>')

    }, 1000)

    //获取天气和风向
    function getWeatherWind() {
        var now = new Date().getFullYear() + '-' + (new Date().getMonth() + 1) + '-' + new Date().getDate() +
            ' ' + (new Date().getHours() >= 10 ? new Date().getHours() : '0' + new Date().getHours()) + ':' +
            (new Date().getMinutes() >= 10 ? new Date().getMinutes() : '0' + new Date().getMinutes()) +
            ':' + (new Date().getSeconds() >= 10 ? new Date().getSeconds() : '0' + new Date().getSeconds());

        $.post('http://localhost:8080/weatherWind',{nowTime:now},function (data) {
           var nowWeather=data.nowWeather;
           var nowWindDire=data.nowWindDire;
            if (nowWeather==null||nowWindDire==null){

                $('#weather').html('<span>'+'暂无数据'+'</span>');
               // document.getElementById('weatherImg').src='';
               $('#windDirection').html('<span>'+'暂无数据'+'</span>');
            }else {
                switch (nowWeather) {
                    case 'A':
                        $('#weather').html('<span>' + '大雨' + '</span>');
                        document.getElementById('weatherImg').src='./img/weather/dayu.png';
                        break;
                    case 'B':
                        $('#weather').html('<span>' + '中雨' + '</span>');
                        document.getElementById('weatherImg').src='./img/weather/zhongyu.png';
                        break;
                    case 'C':
                        $('#weather').html('<span>' + '小雨' + '</span>');
                        document.getElementById('weatherImg').src='./img/weather/xiaoyu.png';
                        break;
                    case 'D':
                        $('#weather').html('<span>' + '大雪' + '</span>');
                        document.getElementById('weatherImg').src='./img/weather/daxue.png';
                        break;
                    case 'E':
                        $('#weather').html('<span>' + '中雪' + '</span>');
                        document.getElementById('weatherImg').src='./img/weather/zhongxue.png';
                        break;
                    case 'F':
                        $('#weather').html('<span>' + '小雪' + '</span>');
                        document.getElementById('weatherImg').src='./img/weather/xiaoxue.png';
                        break;
                    case 'G':
                        $('#weather').html('<span>' + '阴天' + '</span>');
                        document.getElementById('weatherImg').src='./img/weather/yin.png';
                        break;
                    case 'H':
                        $('#weather').html('<span>' + '晴天' + '</span>');
                        document.getElementById('weatherImg').src='./img/weather/qing.png';
                        break;
                }

                switch (nowWindDire) {
                        case '1':
                            $('#windDirection').html('<span>' + '东' + '</span>');
                            break;
                        case '2':
                            $('#windDirection').html('<span>' + '西' + '</span>');
                            break;
                        case '3':
                            $('#windDirection').html('<span>' + '南' + '</span>');
                            break;
                        case '4':
                            $('#windDirection').html('<span>' + '北' + '</span>');
                            break;
                        case '5':
                            $('#windDirection').html('<span>' + '东南' + '</span>');
                            break;
                        case '6':
                            $('#windDirection').html('<span>' + '东北' + '</span>');
                            break;
                        case '7':
                            $('#windDirection').html('<span>' + '西南' + '</span>');
                            break;
                        case '8':
                        $('#windDirection').html('<span>' + '西北' + '</span>');
                        break;
                }
            }

        })

    }
    window.onload = function(){
        listData();
        getWeatherWind();
    };

</script>

<!-- END JS -->
</body>
</html>


