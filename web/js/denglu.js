/**
 * Created by ttc on 18-1-3.
 */
function dl1()
{
    var a=document.getElementById("dl1");
        a.style.borderBottom="2px #577F49 solid";
        a.style.color="#577F49";
    document.getElementById("dl2").style.borderBottom="0px #577F49 solid";
    document.getElementById("dl2").style.color="black";
    //2.点dl1时，变为绿色 有下划线也是绿色 dl2仍为黑色不变
    // document.getElementById("dl3").style.borderBottom="0px #577F49 solid";
    // document.getElementById("dl3").style.color="black";
    document.getElementById("pz07").style.display="block";//dl1里pz07出现

}
function dl2()
{
    var a=document.getElementById("dl2");
    a.style.borderBottom="2px #577F49 solid";
    a.style.color="#577F49";
    document.getElementById("dl1").style.borderBottom="0px #577F49 solid";
    document.getElementById("dl1").style.color="black";
    // document.getElementById("dl3").style.borderBottom="0px #577F49 solid";
    // document.getElementById("dl3").style.color="black";
    document.getElementById("tj03").innerHTML="3.体检考评";//把dl1里面的tj03改了
    document.getElementById("zf04").innerHTML="4.政治审查";
    document.getElementById("zb06").innerHTML="6.批准入伍";
    document.getElementById("pz07").style.display="none"; //dl2里pz07消失

}
// function dl3()
// {
//     var a=document.getElementById("dl3");
//     a.style.borderBottom="2px #577F49 solid";
//     a.style.color="#577F49";
//     document.getElementById("dl1").style.borderBottom="0px #577F49 solid";
//     document.getElementById("dl1").style.color="black";
//     document.getElementById("dl2").style.borderBottom="0px #577F49 solid";
//     document.getElementById("dl2").style.color="black";
//
// }
function dl4() { //(3)

    document.getElementById("png1").style.display="block";
}

function dl5() {
    document.getElementById("png1").style.display="none";
}
function dl6() {
    document.getElementById("png2").style.display="block";
}
function dl7() {
    document.getElementById("png2").style.display="none";
}
function dl8() {
    document.getElementById("png3").style.display="block";
}
function dl9() {
    document.getElementById("png3").style.display="none";
}
function dl20() {
    document.getElementById("png4").style.display="block";
}
function dl21() {
    document.getElementById("png4").style.display="none";
}
function dl22() {
    document.getElementById("png5").style.display="block";
}
function dl23() {
    document.getElementById("png5").style.display="none";
}
function dl24() {
    document.getElementById("png6").style.display="block";
}
function dl25() {
    document.getElementById("png6").style.display="none";
}
function dl26() {
    document.getElementById("png7").style.display="block";
}
function dl27() {
    document.getElementById("png7").style.display="none";
}