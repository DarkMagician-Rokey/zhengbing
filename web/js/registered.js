/**
 * Created by ttc on 17-12-29.
 */
//照片上传
window.onload = function () {
    document.getElementById("imges").onclick = function () {
        document.getElementById("file").click();
        return false;
    }
    document.getElementById("file").onchange = function () {
        var f = document.getElementById("form");
        var fd = new FormData(f);

        var xhr = new XMLHttpRequest();

        xhr.open("post", "/ServletZhaobian");
        xhr.send(fd);

        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4) {
                if (xhr.status == 200 || xhr.status == 304) {
                    var s = xhr.responseText;
                    document.getElementById("imges").src = s;
                    document.getElementById("zhaopian").value = s;
                }
            }
        }
    }
}

//手机号验证
function Phonenumber1() {
    document.getElementById("Phonenumbertest").innerHTML = "请输入11位手机号码，仅支持大陆地区手机号";
}
function Phonenumber2() {
    var Phonenumber = document.getElementById("Phonenumber").value;
    var zhi = "";

    if (Phonenumber == "") {
        zhi = "手机号不能为空";
    } else if (!(/^1\d{10}$/.test(Phonenumber))) {
        zhi = "手机号长度为11位数字";
    } else if (!(/^1[34578]\d{9}$/.test(Phonenumber))) {
        zhi = "手机号格式不正确";
    } else {
        var xhr = new XMLHttpRequest();
        xhr.open("post", "/Servletceshi");
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xhr.send("newPhonenumber=" + Phonenumber);

        xhr.onreadystatechange = function () {
            if (xhr.readyState == 0) {
            }
            if (xhr.readyState == 1) {
            }
            if (xhr.readyState == 2) {
            }
            if (xhr.readyState == 3) {
                alert("正在验证手机号是否存在请稍候")
            }

            if (xhr.readyState == 4) {
                if (xhr.status == 200 || xhr.status == 304) {
                    var html = '<span class="error">' + xhr.responseText + '</span>';
                    document.getElementById("Phonenumbertest").innerHTML = html;
                }
            }
        }
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("Phonenumbertest").innerHTML = html;
}

//免费获取
function mianfei(){
    var Phonenumber=document.getElementById("Phonenumber").value;

    if(Phonenumber=="")
    {
        document.getElementById("mianfeitest").innerHTML="请输入手机号";
    }else
    {
        alert("数据已发送到你的手机,请注意接收");
    }
}

//密码验证
function Passwordtest() {
    document.getElementById("Passwordyan").innerHTML = "密码由6-30位的英文字母、数字和特殊字符组成，请使用强度较高的密码";
}
function Passwordtest2() {
    var Password = document.getElementById("Password").value;
    var zhi;

    if (Password == "") {
        zhi = "密码不能为空";
    } else if (!(/^[0-9A-Za-z]{6,30}$/.test(Password))) {
        zhi = "密码长度应在6-30个字符之间";
    } else {
        zhi = "";
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("Passwordyan").innerHTML = html;
}
function Passwordtest3() {
    var arr = ["", "低", "中", "高"];
    var v=["","red","blue","green"];
    var txt=document.getElementById("Password").value;
    var s = 0;
    if (/[a-zA-Z]/.test(txt)) {
        s++;
    }
    if (/[0-9]/.test(txt)) {
        s++;
    }
    if (/[^0-9a-zA-Z]/.test(txt)) {
        s++;
    }
    if (txt.length < 6) {
        s = 0;
    }
    document.getElementById("strength").innerHTML ="密码强度: "+arr[s];
    document.getElementById("strength").style.color=v[s];
    if(s==0)
    {
        document.getElementById("strength").innerHTML="";
    }


}

function PasswordDemo() {
    document.getElementById("Passwordque").innerHTML = "再填写一遍密码";
}
function PasswordDemo2() {
    var password1 = document.getElementById("Password").value;
    var password2 = document.getElementById("Password2").value;
    var zhi;

    if (password1 != password2) {
        zhi = "两次填写的密码不一致";
    } else {
        zhi = "";
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("Passwordque").innerHTML = html;
}

//姓名验证
function xinming() {
    document.getElementById("yanxingming").innerHTML = "按本人有效身份证件填写";
}
function xinming2() {
    var name = document.getElementById("name").value;
    var zhi;
    if (name == "") {
        zhi = "姓名不能为空";
    } else if (!(/^[\u4e00-\u9fa5]{2,}$/.test(name))) {
        zhi = "姓名格式有误";
    }
    else {
        zhi = "";
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("yanxingming").innerHTML = html;
}

//证件号码验证
function LicenseNumber1() {
    document.getElementById("LicenseNumbertest").innerHTML = "请认真核对您的证件号码，证件号码一经提交不能修改";
}
function LicenseNumber2() {
    var l = /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
    var licensenumber = document.getElementById("LicenseNumber").value;
    var zhi = "";
    if (licensenumber == "") {
        zhi = "身份证号不能为空";
    } else if (!(l.test(licensenumber))) {
        zhi = "身份证号码格式有误";
    } else {
        var xhr = new XMLHttpRequest();
        xhr.open("post", "/Servletcheshi2");
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xhr.send("newLicenseNumber=" + licensenumber);

        xhr.onreadystatechange = function () {
            if (xhr.readyState == 0) {
            }
            if (xhr.readyState == 1) {
            }
            if (xhr.readyState == 2) {
            }
            if (xhr.readyState == 3) {
                alert("正在验证证件号码是否存在请稍候")
            }
            if (xhr.readyState == 4) {
                if (xhr.status == 200 || xhr.status == 304) {
                    var html = '<span class="error">' + xhr.responseText + '</span>';
                    document.getElementById("LicenseNumbertest").innerHTML = html;
                }
            }
        }
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("LicenseNumbertest").innerHTML = html;
}

//邮箱验证
function Mailboxtest1() {
    document.getElementById("yanMailbox").innerHTML = "请设定一个安全邮箱，忘记密码时可通过此邮箱找回密码";
}
function Mailboxtest2() {
    var l = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
    var mailbox = document.getElementById("Mailbox").value;
    var zhi = "";
    if (mailbox == "") {
        zhi = "邮箱不能为空";
    } else if (!(l.test(mailbox))) {
        zhi = "邮箱格式有误";
    } else {
        var xhr = new XMLHttpRequest();
        xhr.open("post", "/Servletcheshi3");
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xhr.send("newMailbox=" + mailbox);

        xhr.onreadystatechange = function () {
            if (xhr.readyState == 0) {
            }
            if (xhr.readyState == 1) {
            }
            if (xhr.readyState == 2) {
            }
            if (xhr.readyState == 3) {
                alert("正在验证邮箱是否存在请稍候")
            }
            if (xhr.readyState == 4) {
                if (xhr.status == 200 || xhr.status == 304) {
                    var html = '<span class="error">' + xhr.responseText + '</span>';
                    document.getElementById("yanMailbox").innerHTML = html;
                }
            }
        }
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("yanMailbox").innerHTML = html;
}

//同意条款
function checkbox() {
    var checked = document.getElementById("checkbox1").checked;
    var x = document.getElementsByClassName("gaizhu");

    var i = 0;

    if (checked) {
        for (i = 0; i < x.length; i++) {
            x[i].removeAttribute("disabled");
        }
        document.getElementById("Phonenumber").removeAttribute("disabled");
    } else {
        for (i = 0; i < x.length; i++) {
            x[i].disabled = "disabled";
        }
        document.getElementById("Phonenumber").disabled = "disabled";
    }
}

//问题重复
function func2() {
    var v1 = document.getElementById("UserSecurityQuestion1").value;
    var v2 = document.getElementById("UserSecurityQuestion2").value;


    if (v1 == v2) {
        document.getElementById("demo2").innerHTML = "问题重复";

    } else {
        document.getElementById("demo2").innerHTML = "";
    }
}
function func3() {
    var v1 = document.getElementById("UserSecurityQuestion1").value;
    var v2 = document.getElementById("UserSecurityQuestion2").value;
    var v3 = document.getElementById("UserSecurityQuestion3").value;

    if (v3 == v2 || v1 == v3) {
        document.getElementById("demo3").innerHTML = "问题重复";

    } else {
        document.getElementById("demo3").innerHTML = "";
    }
}

//阻止提交
function login() {

    var Phonenumber = document.getElementById("Phonenumber").value;
    var Password = document.getElementById("Password").value;
    var password2 = document.getElementById("Password2").value;
    var name = document.getElementById("name").value;
    var licensenumber = document.getElementById("LicenseNumber").value;
    var l = /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
    var t = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
    var mailbox = document.getElementById("Mailbox").value;
    var checked = document.getElementById("checkbox1").checked;
    var v1 = document.getElementById("UserSecurityQuestion1").value;
    var v2 = document.getElementById("UserSecurityQuestion2").value;
    var v3 = document.getElementById("UserSecurityQuestion3").value;
    var yan=document.getElementById("yan").value;
    var error=document.getElementsByClassName("error");

    if (Phonenumber == "") {
        alert("手机号不能为空");
        return false;
    } else if (!(/^1\d{10}$/.test(Phonenumber))) {
        alert("手机号长度为11位数字");
        return false;
    } else if (!(/^1[34578]\d{9}$/.test(Phonenumber))) {
        alert("手机号格式不正确");
        return false;
    } else if(yan=="") {
        alert("请输入校验码")
        return false;
    } else if (Password == "") {
        alert("密码不能为空");
        return false;
    } else if (!(/^[0-9A-Za-z]{6,30}$/.test(Password))) {
        alert("密码长度应在6-30个字符之间");
        return false;
    } else if (Password != password2) {
        alert("两次填写的密码不一致");
        return false;
    } else if (name == "") {
        alert("姓名不能为空");
        return false;
    } else if (!(/^[\u4e00-\u9fa5]{2,}$/.test(name))) {
        alert("姓名格式有误");
        return false;
    } else if (licensenumber == "") {
        alert("请输入身份证号");
        return false;
    } else if (!(l.test(licensenumber))) {
        alert("身份证号码格式有误");
        return false;
    } else if (mailbox == "") {
        alert("邮箱不能为空");
        return false;
    } else if (!(t.test(mailbox))) {
        alert("邮箱格式有误");
        return false;
    } else if (v1 == v2 || v1 == v3 || v2 == v3) {
        alert("问题不能重复");
        return false;
    } else if (!checked) {
        alert("请同意条款");
        return false;
    }

    for (var i=0;i<error.length;i++)
    {
        if(error[i].innerHTML!="" && error[i].innerHTML!="√")
        {
            alert(error[i].innerHTML);
            return false;
        }
    }

    document.getElementById("form1").submit();
}