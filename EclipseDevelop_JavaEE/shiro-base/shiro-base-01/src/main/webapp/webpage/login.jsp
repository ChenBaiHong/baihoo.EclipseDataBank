<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/webpage/include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/html/jquery-easyui/themes/default/easyui.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/html/jquery-easyui/themes/icon.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/html/jquery-easyui/login.css"/>" />
<script type="text/javascript"
	src="<c:url value="/html/jquery-easyui/jquery.min.js"/>" ></script>
<script type="text/javascript"
	src="<c:url value="/html/jquery-easyui/jquery.easyui.min.js"/>" ></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<h2>baiHoo 作品页</h2>
			<p></p>
			<div style="margin: 20px 0;"></div>
			<div class="easyui-panel" title="用户登陆"
				style="width: 100%; max-width: 400px; padding: 30px 60px;">
				<form id="loginForm" class="easyui-form" method="post"
					data-options="novalidate:true">
					<div style="margin-bottom: 20px">
						<input class="easyui-textbox tb" id="username" name="username" style="width: 100%"
							data-options="label:'用户名',required:true,prompt:'请输入用户名',iconCls:'icon-man'">
					</div>
					<div style="margin-bottom: 20px">
						<input class="easyui-passwordbox tb" id="password" name="password"
							style="width: 100%"
							data-options="label:'密码',required:true,prompt:'请输入密码',iconCls:'icon-lock'">
					</div>
				</form>
				<div style="text-align: center; padding: 5px 0">
					<a href="javascript:void(0)" class="easyui-linkbutton"
						onclick="submitForm()" style="width: 80px">提交</a> <a
						href="javascript:void(0)" class="easyui-linkbutton"
						onclick="clearForm()" style="width: 80px">重置</a>
				</div>
			</div>
		</div>
	</div>
	<script>
		function submitForm() {
			$('#loginForm').form('submit', {
				onSubmit : function() {
					if($(this).form('enableValidation').form('validate')){
					    var actionurl="loginController.do?login";//提交路径
					    var checkurl="loginController.do?checkuser";//验证路径
						//创建表单对象
					    var formData = new Object();
					    var data=$(":input").each(function() {
					    	//去空处理，与去未定义处理
					    	if(this.name!=null && this.name.trim()!="" && this.name!=undefined){
							      formData[this.name] =$("#"+this.name ).val();
					    	}
					    });
					    alert(formData);
						$.ajax({
						      async : false,//是否异步提交，false
						      cache : false,//是否缓存，false
						      type : 'POST',//请求方法，post
						      url : checkurl,// 请求的action路径
						      data : formData,//请求携带的数据
						      error : function() {// 请求失败处理函数
						    	  
						      },
						      success : function(data) {
						    	  
						      }
						})
					}else{
						return false;
					}
				}
			});
		}
		function clearForm() {
			$('#loginForm').form('clear');
		}
	</script>
</body>
</html>