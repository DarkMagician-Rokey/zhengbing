/**
 * Created by ttc on 17-12-27.
 */
//主图
function img() {
    document.getElementById("jumu").onclick=function () {
        location.href="/page/login.jsp";
    }
}
//编辑个人资料
function edit() {
    var email=document.getElementById("email").innerHTML;
    if(email!="游客，点击登陆"){
        var ed=document.getElementById("ed");
            ed.innerHTML=",编辑个人资料";
        ed.onclick=function () {
            location.href="/servlet/ServletEdit";
        }
    }

}
//点击游客
function login() {
    location.href="/page/login.jsp";
}

//兵役登记
function bingyi() {
    location.href="/servlet/ServletDengji";
}

//应征报名
function baoming() {
    location.href="/servlet/ServletBaoming";
}


