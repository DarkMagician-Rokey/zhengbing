/**
 * Created by ttc on 17-12-28.
 */
//主页
function home() {
    document.getElementById("").onclick=function () {
        location.href="/page/Home.jsp";
    }
}
//登记页
function dengji() {
    document.getElementById("").onclick=function () {
        location.href="/page/dengji.jsp";
    }
}
// 兵役管理页面
function guanli() {
    document.getElementById("").onclick=function () {
        location.href="/page/.jsp";
    }
}
//国防知识页
function zhishi() {
    document.getElementById("").onclick=function () {
        location.href="/page/";
    }
}
//军旅生活
function junlv() {
    document.getElementById("").onclick=function () {
        location.href="/page/";
    }
}
//退役生活
function tuiyi() {
    document.getElementById("").onclick=function () {
        location.href="/page/";
    }
}
//国防省市
function shengshi() {
    var sheng=document.getElementById("");
        sheng.onchange=function () {
        if(sheng.value==""){
            var arr=[];
            var shi=document.getElementById("").innerHTML;
            for (var i=0;i<arr.length;i++){
                shi="";
                shi+="<option value="+arr[i]+">"+arr[i]+"</option>";
            }
        }
    }
}