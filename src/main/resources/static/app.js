var ws;
var counter = 0;

function createToken() {
    var name = document.getElementById("name").value;
    sessionStorage.setItem('user', name);
    var pass = document.getElementById("password").value;
    var token;
    $.getJSON("/authenticate", {"clientName" : name,"passwordTxt":pass}, function(data) {
        if (data != null) {
            token = data["token"];
            sessionStorage.setItem('token', token);
            console.log(token);

        }
    });
    setTimeout(loadPage,2000);


}
function verifyToken(){
    var token = sessionStorage.getItem('token');
    var secure = null;
    document.getElementById("body").innerHTML = "";
    $.getJSON("/secured/app", {"authorization" : token}, function(data) {
        if (data != null) {
            secure = data["secured"];

            if(secure == "true"){
                $("#body").append("verified");

            }else{
                $("#body").append("not verified");
            }

        }
    });
}
function show(){
    document.getElementById("body").innerHTML = "";
    $("#body").append(sessionStorage.getItem('token'));

}

function loadPage(){
    location.href = "/result";
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    // $( "#connect" ).click(function() { connect(); });
    $( "#verify" ).click(function() { verifyToken(); });
    $( "#send" ).click(function() { createToken(); });
    $( "#show" ).click(function() { show(); });


});