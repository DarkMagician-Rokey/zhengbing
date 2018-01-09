<%--
  Created by IntelliJ IDEA.
  User: ttc
  Date: 17-12-28
  Time: 上午11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>兵役登记——全国征兵网</title>
    <link rel="stylesheet" href="../css/bydj.css">
    <script src="../js/dengji.js"></script>
</head>
<body>
<div class="zhengti">
    <div class="tupian">
        <img src="../images/banner.jpg" alt="巨幕">
    </div>
    <div class="xinxilan">
         <span class="neirong">
             <a href="../page/Home.jsp" class="s1">首页|</a>
             <a href="#">兵役登记|</a>
             <a href="../page/baoming.jsp">应征报名</a>
             <a href="../">国防知识|</a>
             <a href="../html/jlsh.html">军旅生活</a>
             <a href="../html/tyfc.html">退役风采|</a>
         </span>
        <div class="bingyidengji">
            <a href="shouye.html">首页>></a>
            兵役登记
        </div>
        <div class="xiahuaxian1">
            <hr>
        </div>
        <div class="shuxian2"></div>
        <div class="shuxian">
            <div class="bingyifagui"><strong>|&nbsp;&nbsp;政策法规</strong></div>
            <div class="xiahuaxian2">
                <hr>
            </div>
        </div>
        <div class="wenjian">
            <c:forEach var="faguis" items="${fagui}">
            <a href="${faguis.imageLink}">${faguis.materialName}</a> <br><br>
            </c:forEach>
        </div>

        <div class="xian4">
            <hr>
        </div>
        <div class="you03">
            <div class="bydj02"><strong>兵役登记</strong></div>
            <div class="wenzi">
                当年12月31日前年满18岁的男性公民，
                应当按照法律规定履行兵役登记义务。
                当年12月31日以前年满17岁未满 <br>18岁的男性高中(含中专、职高、技校)毕业生，
                本人自愿应征的，也可进行登记报名。
            </div>
            <div class="yijing">已经进行过兵役登记，有参军意向的可直接参加网上应征报名。</div>
            <div class="sjjd">
                <span class="mndj"><strong>每年兵役登记时间：</strong></span>
                <span class="sjjd1">1月1日 至 6月30日。</span> <br> <br>
                <span class="yzbmsj"> <strong>应征报名时间：</strong></span>
                <span class="sjjd2"> 2月1日 至 8月5日</span>
            </div>

            <div class="xian5">
                <hr>
            </div>
            <div class="jxbydj" onclick="login()">进行兵役登记</div>
        </div>
    </div>
    <div class="zbdw">
        &nbsp;&nbsp;&nbsp;
        主办单位：国防征兵部办公室 教育部高校学生司
        承办单位：全国高等学校学生信息咨询与就业指导中心
        全国学生资助管理中心 技术支持：学信网 <br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        服务热线：010-8219199588
        客服邮箱：123456@com.cn 帮助中心 京ICP备09057757
    </div>

</div>
</body>
</html>
