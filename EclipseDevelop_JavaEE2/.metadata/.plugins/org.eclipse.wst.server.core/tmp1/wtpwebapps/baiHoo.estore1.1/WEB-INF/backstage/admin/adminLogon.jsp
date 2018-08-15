<%--
  Created by IntelliJ IDEA.
  User: cbh12
  Date: 9/25/2016
  Time: 11:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backgroundPlug/css/component.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backgroundPlug/css/demo.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backgroundPlug/css/normalize.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backgroundPlug/css/platform-1.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backgroundPlug/css/easyform.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backgroundPlug/css/tab.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/backgroundPlug/js/adminLogon/jquery-2.1.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backgroundPlug/js/adminLogon/html5.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backgroundPlug/js/adminLogon/easyform.js"></script>
    <script type="text/javascript">
        $(function() {
            var timer=setInterval(intervalTime,5000);
            $("#submit").click(function(){
                var user = $("#uid").val();
                var pwd = $("#psw1").val();
                if (user.length == 0 || pwd.length == 0) {
                    clearInterval(timer);
                    timer=setInterval(intervalTime,5000);
                    $(".hint1").text("用户名和密码不能为空").show(500);
                    return false;
                }else if (user.length != 0 && pwd.length != 0){
                    var judge=false;
                    var url="${pageContext.request.contextPath}/AdminServlet.servlet";
                    var args={"logonName":user,"logonPwd":pwd,"method":"ajaxValidate","time":new Date()};
                    $.post(url,args,function(data){
                        /*var object = eval("("+data+")");*/
                        var variable = data.logonMessage;
                        if(variable=="logonFailed"){
                            clearInterval(timer);
                            timer=setInterval(intervalTime,5000);
                            $(".hint1").text("用户名或密码错误！").show(500);
                            judge= false;
                        }else if(variable=="logonSuccess"){
                            judge= true;
                            var formNode = document.getElementById("reg-form");
                            var jumpHref = formNode.getAttribute("action");
                            window.location.href=jumpHref;
                        }else{
                            judge= false;
                        }
                    },"JSON");
                    return judge;
                }
            });
            function intervalTime() {
               $(".prompt").hide(500);
            }
	    	var wH = parseInt(document.body.clientHeight);
	    	var dH = parseInt($(".form-div").height());
	    	$(".form-div").css({"top":(((wH-dH)/2)+"px")});
	    	$(window).resize(function(){
	    		var wH = parseInt(document.body.clientHeight);
	    		var dH = parseInt($(".form-div").height());
		    	$(".form-div").css({"top":(((wH-dH)/2)+"px")});
	    	})
	    	
	    	$(".goRegister").click(function(){
	    		$(".float2").stop().animate({"left":"0px"},360);
        		$(".float1").stop().animate({"left":"-100%"},360);
	    	})
	    	$(".goback").click(function(){
	    		$(".float1").stop().animate({"left":"0px"},360);
        		$(".float2").stop().animate({"left":"100%"},360);
	    	})
        });
    </script>
    <style type="text/css">
    	.form-div{
    		overflow:hidden;
    	}
	    .form-div .buttons {
	    	margin:0px; padding: 0px; float:none;display:block;width:inherit; text-align:center;
	    	font-weight:bold; font-size:14px;
	    }
	     .form-div .buttons  input[type="button"] , input[type="submit"] , input[type="reset"]{
	     	margin:0px; padding: 7 15;
	     }
	    .form-div .btn1{
	    	margin-top:20px;
	    }
	    .form-div .prompt{
		    text-align: center;
		    padding: 5 0 5 0;
		    font-size: 15px;
		    display:none;
		}
		.form-div .reg-form{
			height:inherit;
		}
		.form-div .divFloat{
			float:left;
			width:100%;
			position:absolute;
		} 
		.form-div .float1{
			left:0px;
		}
		.form-div .float2{
			left:100%;
		}
		.divHeadImg {
		    width: 100%;
		    height: 74px;
		    background-color: rgba(0, 0, 0, 0.1);
		}

		.divHeadImg .titleImg {
		    height: 258px;
		}
		.divHeadImg .titleText {
		    margin: 0px;
		    font-family: -webkit-pictograph;
		    padding: 25px 0;
		    font-size: 3.5em;
		}

    </style>
</head>
<body>
<div class="container demo-3"style="z-index: 1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas" style="z-index: 0;position: fixed;left: 0px;"></canvas>
            <div class="divHeadImg">
            	<img src="${pageContext.request.contextPath}/foregroundPlug/images/logo2.png" class="titleImg" alt=" " style=""/>
				<h1 class="titleText" style="left:25px;">BaiHoo</h1>
            </div>
            <div class="form-div"  style="z-index: 99;position:relative;height: 315px;">
			    <form id="reg-form" class="reg-form" action="${pageContext.request.contextPath}/AdminServlet.servlet?method=logonSuccess" method="post">
			        <div class="divFloat float1">
				        <table>
				            <tr>
				                <td>登录名</td>
				                <td><input name="logonName" type="text" id="uid"
				                /></td>
				            </tr>
				            <tr>
				                <td>密　码</td>
				                <td><input name="logonPwd" type="password" id="psw1"
				                /></td>
				            </tr>
				        </table>
				        <div id="prompt" class="prompt hint1" style="">用户名和密码不能为空</div>
				        <div style="margin-left:100px">
				            <input type="checkbox" name="deadline" value="${60*60*24*7}">&nbsp;自动登录一个星期
				        </div>
				        <div class="buttons btn1" style="">
				            <input value="登陆" type="submit" style="" id="submit" class="submit">
				            <input value="我没有有账号，我要注册" type="button"  id="goRegister" class="goRegister" style="" />
				        </div>
			        </div>
			        <div class="divFloat float2">
				        <table>
				            <tr>
				                <td>登录名</td>
				                <td><input name="logonName" type="text" id="uid1"
				                /></td>
				            </tr>
				            <tr>
				                <td>密　码</td>
				                <td><input name="logonPwd" type="password" id="psw2"
				                /></td>
				            </tr>
				            <tr>
				                <td>重复密码</td>
				                <td><input name="logonPwd" type="password" id="psw3"
				                /></td>
				            </tr>
				        </table>
				        <div id="prompt" class="prompt hint2" style="">用户名和密码不能为空</div>
				        <div style="margin-left:100px">
				            <input type="checkbox" name="deadline" value="${60*60*24*7}">&nbsp;自动登录一个星期
				        </div>
				        <div class="buttons btn2" style="">
				            <input value="注册并登陆" type="button" style="" id="subReg" class="submit subReg">
				            <input value="返 回" type="button"  id="goback" class="goback" style="" />
				        </div>
			        </div>
			        <br class="clear">
			    </form>
			</div>
        </div>
    </div>
</div>
<!-- /container -->
<script src="${pageContext.request.contextPath}/backgroundPlug/js/adminLogon/TweenLite.min.js"></script>
<script src="${pageContext.request.contextPath}/backgroundPlug/js/adminLogon/EasePack.min.js"></script>
<script src="${pageContext.request.contextPath}/backgroundPlug/js/adminLogon/rAF.js"></script>
<script src="${pageContext.request.contextPath}/backgroundPlug/js/adminLogon/demo-3.js"></script>
</body>
</html>