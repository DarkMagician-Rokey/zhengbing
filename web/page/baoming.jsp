<%--
  Created by IntelliJ IDEA.
  User: ttc
  Date: 18-1-4
  Time: 上午11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>应征报名——全国征兵网</title>
    <link rel="stylesheet" href="../css/yzbm.css">
    <script src="../js/baoming.js"></script>
</head>
<body>
<div class="zhengti">
    <div class="tupian">
        <img src="../images/banner.jpg" alt="">
    </div>
    <div class="xinxilan">
         <span class="neirong">
             <a href="../page/Home.jsp" class="s1">首页|</a>
             <a href="../page/dengji.jsp">兵役登记|</a>
             <a href="../page/baoming.jsp">应征报名</a>
             <a href="../html/gfzs.html">国防知识|</a>
             <a href="../html/jlsh.html">军旅生活</a>
             <a href="../html/tyfc.html">退役风采|</a>
         </span>
        <div class="bingyidengji">
            <a href="../page/Home.jsp">首页>></a>
            应征报名
        </div>
        <div class="xiahuaxian1">
            <hr>
        </div>
        <div class="shuxian"></div>
        <div class="bingyifa">
            <div class="bingyifagui"><strong>|&nbsp;&nbsp;兵役法规</strong></div>
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
        <div class="you01">
            <div class="yzbm"><strong>应征报名</strong></div>
            <div class="wenzi">
                <span class="nanbing"><strong>应征报名（男兵）招收对象：</strong></span>高中（含中专、职高、技校）毕业及以上文化程度的青年(含高校在校生)，
                年满<br> 17至22周岁；大专及以上文化程度的高校毕业生，年满17至24周岁；初中毕业文化程度青年，
                年满18至20周岁。<br>
                <span class="nvbing"><strong>应征报名(女兵)征集对象：</strong></span>普通高中应届毕业生(含高校新生)、普通全日制高校 在校生及应届毕业生，
                年满<br>17至22周岁。
            </div>
            <div class="xian5">
                <hr>
            </div>
            <div class="yzbmts">
                <span class="ts"><strong>应征报名提示：</strong></span>男兵报名前须完成
                <span class="bydj01">兵役登记</span>
            </div>
            <div class="yznb" onclick="man()">应征报名(男兵)</div>
            <div class="yznvb" onclick="woman()">应征报名(女兵)</div>
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
