<%--
  Created by IntelliJ IDEA.
  User: ttc
  Date: 17-12-27
  Time: 下午3:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>☆ 全国征兵网</title>
    <script src="../js/Home.js"></script>
    <link rel="stylesheet" href="../css/shouye.css">
</head>
<body>
<div class="zhengti">
    <div class="tupian">
        <img src="../images/banner.jpg" alt="">
    </div>
    <div class="xinxilan">
         <span class="neirong">
             <a href="#" class="s1">首页|</a>
             <a href="../page/dengji.jsp" onclick="bingyi()">兵役登记|</a>
             <a href="../page/baoming.jsp" onclick="baoming()">应征报名</a>
             <a href="../page/guofangzhishi.jsp">国防知识|</a>
             <a href="../page/junlvshenghuo.jsp">军旅生活</a>
             <a href="../page/tuiyifengcai,jsp">退役风采|</a>
         </span>


        <%--用户名--%>

        <span class="email" id="email" onclick="login()">
             <c:out value="${name}" default="游客，点击登陆"></c:out>
         </span>

        <span class="ed" id="ed"></span>


    </div>


    <div class="ywqn">
        <img id="jumu" src="../images/3.JPG" alt="巨幕">
    </div>
    <div class="zuo">
        <div class="zcfg20"><strong>|&nbsp;政策法规</strong></div>
        <div class="xian20">
            <hr>
        </div>
        <div class="tupian20">
            <img src="../images/0_img.png"/>
        </div>
        <div class="byf20">
            《中华人民共和国兵役法》经1984年 <br>
            5月31日第六届全国人民代表大会第2 <br>
            次会议通过...
        </div>
        <div class="xiangxi20">
            <a href="">[详细]</a>
        </div>
        <div class="xian19">
            <hr>
        </div>
        <div class="tiaoli20">
            <ul>
                <c:forEach var="faguis" items="${fagui}">
                        <li>
                            <a href="${faguis.imageLink}" id="law" name="law" >
                                    ${faguis.materialName}
                            </a>
                        </li>
                        <br>
                    </c:forEach>
            </ul>
        </div>
    </div>

    <div class="zhongjian">
        <div class="zcfg19"><strong>|&nbsp;工作动态</strong></div>
        <div class="xian18">
            <hr>
        </div>
        <div class="tupian19">
            <img src="../images/siyouxian.jpg" alt="">
        </div>
        <div class="byf19">
            各地高校为大学生报名应征和退役 <br>
            后复学、升学、就业等，实施"一站 <br>
            试"服务、"一条龙"办理...
        </div>
        <div class="xiangxi19">
            <a href="">[详细]</a>
        </div>
        <div class="xian17">
            <hr>
        </div>
        <div class="tiaoli19">
            <ul>
                <li><span class="wtjl"><a href="">征兵工作"五条禁令"</a></span></li>
                <br>
                <li><span class="rwxcd"> <a href="">大学生应征入伍宣传单</a></span></li>
                <br>
                <c:forEach var="works" items="${work}">
                    <li><a href="">${works.materialName}</a></li>
                    <br>
                </c:forEach>
            </ul>
        </div>
    </div>


    <div class="xiamian">
        <div class="jctp">| 精彩图片</div>
        <div class="xian14">
            <hr>
        </div>
        <div class="tu1">
            <img src="../images/t1.png" alt="">
            <span class="t02"> <img src="../images/t2.png" alt=""></span>
            <span class="t03"> <img src="../images/t3.png" alt=""></span>
            <span class="t04"><img src="../images/t4.png" alt=""></span>
            <span class="t05"><img src="../images/t5.png" alt=""></span>
        </div>
    </div>
</div>
</body>
</html>
