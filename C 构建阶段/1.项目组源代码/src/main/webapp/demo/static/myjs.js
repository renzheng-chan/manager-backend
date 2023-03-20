$(document).ready(function(){
    var message = getUrlParam("message");
    if(message != null)
        alert(message);
})
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r != null) {
        return decodeURI(r[2]);
    }
    return null;
}