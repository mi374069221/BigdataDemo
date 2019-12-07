<%--
  Created by IntelliJ IDEA.
  User: 大米
  Date: 2019/12/3
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>监控告警</title>
    <link rel="stylesheet" href="../../css/test/style.css" />
    <script type="text/javascript" src="../../js/test/jquery-1.8.0.min.js"></script>
</head>

<body>
<header>
    报警监控统计
    <span id=localtime style=" font-size:14px; position: absolute; right: 30px; top:-20px; "></span>
</header>
<div id="content">

    <div class="content_center">

        <div class="center_bot">
            <table class="panel-table"bordercolor="#0d48e0" border="1">
                <thead bgcolor="#0e4ae0" align="center" >
                <tr height="40">
                    <th colspan="6"><img src="../../img/test/icon04.png" /> 监控列表</th>
                </tr>
                </thead>
                <tbody>
                <tr class="aaa" align="center">
                    <td v-for="item in factoryHeader" style="color: #00fcff; font-size: 18px; padding: 5px 0;">{{ item.categories }}</td>
                </tr>
                <tr v-for="y in factory.slice(0,6)" class="aaa" style="font-size: 16px;" align="center" >
                    <td>{{ y.company }}</td>
                    <td>{{ y.dtuCnt }}</td>
                    <td>{{ y.plcCnt }}</td>
                    <td>{{ y.alarm }}</td>
                    <td width="250">
                        <button class="b1 click_pop">报警记录</button>
                        <button class="b2 click_pop2">历史数据</button>
                        <button class="b3 click_pop3">组态应用</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="content_right">
        <div class="report">
            <div class="report1">
                <p>告警信息</p>
                <small>{{alarm.alarm}}条</small>
            </div>
            <div class="report2">
                <p>故障信息</p>
                <small>{{alarm.fault}} 条</small>
            </div>
        </div>
        <div class="news_report">
            <div class="title"><img src="../../img/test/icon05.png" /> 报警记录</div>
            <div class="news_list">
                <ul>
                    <li v-for="item in almMsg.slice(0,3)" class="li02">
                        {{ item.msg }}
                    </li>
                </ul>
            </div>
        </div>

    </div>
</div>
<!--遮罩层-->
<div class="bgPop"></div>
<!--弹出框-->
<div class="pop">
    <div class="pop-top">
        报警记录
        <span class="pop-close">Ｘ</span>
    </div>
    <div class="pop-content">
        <table class="panel-table" bordercolor="#deefff" border="1">
            <thead bgcolor="#971212" align="center" >
            <tr height="38">
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
            </tr>
            </thead>
            <tbody>
            <tr class="aaa" style="font-size: 16px;" align="center" >
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr class="aaa" style="font-size: 16px;" align="center" >
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr class="aaa" style="font-size: 16px;" align="center" >
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>

            <tr class="aaa" style="font-size: 16px;" align="center" >
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="pop-foot">
        <input type="button" value="确定" class="pop-cancel pop-close">
    </div>
</div>
<script>
    $(document).ready(function () {
        $('.pop-close').click(function () {
            $('.bgPop,.pop').hide();
        });
        $('.click_pop').click(function () {
            $('.bgPop,.pop').show();
        });
    })

</script>
<!--遮罩层-->
<div class="bgPop2"></div>
<!--弹出框-->
<div class="pop2">
    <div class="pop-top">
        历史记录
        <span class="pop-close">Ｘ</span>
    </div>
    <div class="pop-content">
        <table class="panel-table" bordercolor="#deefff" border="1">
            <thead bgcolor="#10aaa5" align="center" >
            <tr height="38">
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
                <th>字段</th>
            </tr>
            </thead>
            <tbody>
            <tr class="aaa" style="font-size: 16px;" align="center" >
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr class="aaa" style="font-size: 16px;" align="center" >
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr class="aaa" style="font-size: 16px;" align="center" >
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>

            <tr class="aaa" style="font-size: 16px;" align="center" >
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="pop-foot">
        <input type="button" value="确定" class="pop-cancel pop-close">
    </div>
</div>
<script>
    $(document).ready(function () {
        $('.pop-close').click(function () {
            $('.bgPop2,.pop2').hide();
        });
        $('.click_pop2').click(function () {
            $('.bgPop2,.pop2').show();
        });
    })

</script>
<!--遮罩层-->
<div class="bgPop3"></div>
<!--弹出框-->
<div class="pop3">
    <div class="pop-top">
        组态应用
        <span class="pop-close">Ｘ</span>
    </div>
    <div class="pop-content">
        组态应用
    </div>
    <div class="pop-foot">
        <input type="button" value="确定" class="pop-cancel pop-close">
    </div>
</div>
<script>
    $(document).ready(function () {
        $('.pop-close').click(function () {
            $('.bgPop3,.pop3').hide();
        });
        $('.click_pop3').click(function () {
            $('.bgPop3,.pop3').show();
        });
    })

</script>
<script type="text/javascript" src="../../js/test/jquery.min.js"></script>
<script type="text/javascript" src="../../js/test/echarts.min.js"></script>
<script type="text/javascript" src="../../js/test/china.js"></script>
<script type="text/javascript" src="../../js/test/vue.min.js"></script>
<script type="text/javascript" src="../../js/test/map.js"></script>
<script type="text/javascript" src="../../js/test/times.js"></script>
<script type="text/javascript" src="../../js/test/DTU.js"></script>
<script type="text/javascript" src="../../js/test/PLC.js"></script>
<script type="text/javascript" src="../../js/test/online.js"></script>
<script type="text/javascript" src="../../js/test/industry.js"></script>
<script type="text/javascript" src="../../js/test/data.js"></script>
<script type="text/javascript" src="../../js/test/index.js"></script>

</body>
</html>
