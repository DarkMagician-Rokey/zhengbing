/**
 * Created by ttc on 18-1-3.
 */
var code ; //在全局定义验证码
//产生验证码
window.onload = function () {
    code = "";
    var codeLength = 4;//验证码的长度
    var checkCode = document.getElementById("code");
    var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
        'S','T','U','V','W','X','Y','Z');//随机数
    for(var i = 0; i < codeLength; i++) {//循环操作
        var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）
        code += random[index];//根据索引取得随机数加到code上
    }
    checkCode.innerHTML = code;//把code值赋给验证码
}

function createCode(){
    code = "";
    var codeLength = 4;//验证码的长度
    var checkCode = document.getElementById("code");
    var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
        'S','T','U','V','W','X','Y','Z');//随机数
    for(var i = 0; i < codeLength; i++) {//循环操作
        var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）
        code += random[index];//根据索引取得随机数加到code上
    }
    checkCode.innerHTML = code;//把code值赋给验证码
}
//用户名
function password1() {
    document.getElementById("password1").innerHTML = "请输入注册时填写的用户名";

    document.getElementById("userpassword").innerHTML="";
}
function password2() {
    var t = document.getElementById("password").value;
    var zhi = "";
    if (t == "") {
        zhi = "用户名不能为空";
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("password1").innerHTML = html;
}
//验证码
function yanzhengma1() {
    document.getElementById("span3").innerHTML = "请输入验证码(若为数学运算的请输入计算结果)";

    document.getElementById("captchBlock").style.display="block";
}
function yanzhengma2() {
    var inputCode = document.getElementById("yanzhengma").value.toUpperCase();
    var zhi = "";
    if(inputCode.length <= 0) { //若输入的验证码长度为0
        zhi="请输入验证码！"; //则弹出请输入验证码
    }
    else if(inputCode != code ) { //若输入的验证码与产生的验证码不一致时
        zhi="验证码输入错误！@_@"; //则弹出验证码输入错误
        createCode();//刷新验证码
        document.getElementById("yanzhengma").value = "";//清空文本框
    }
    else { //输入正确时
        zhi="√"; //弹出^-^
        document.getElementById("captchBlock").style.display="none";
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("span3").innerHTML = html;
}
//阻止提交
function login() {
    var n = document.getElementById("password").value;
    var y = document.getElementById("yanzhengma").value;

    if(n=="")
    {
        document.getElementById("password1").innerHTML='<span class="error">证件号码不能为空</span>';
        return false;
    } else if(y=="")
    {
        document.getElementById("span3").innerHTML='<span class="error">验证码不能为空</span>';
        return false;
    }
    document.getElementById("form1").submit();
}

function functt() {
    document.getElementById("captchBlock").style.display="none";
}