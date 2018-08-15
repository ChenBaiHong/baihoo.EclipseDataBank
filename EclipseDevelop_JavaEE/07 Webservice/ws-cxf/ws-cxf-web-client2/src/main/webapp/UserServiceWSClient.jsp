<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String addr = request.getRemoteAddr();
	Integer port = request.getLocalPort();
	String contextPath = request.getContextPath();
	String url = "http://"+addr+":"+port+contextPath;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<c:url value="/plug-in/jquery3.2.1.min.js"/>"></script>
	<script type="text/javascript">

		function addInvoke() {
			//獲取用戶的基本數據
			var $idNo = document.getElementById("idNo");
			var idNo = ($idNo != null && $idNo != undefined) ? $idNo.value : '';
			var $name = document.getElementById("name");
			var name = ($name != null && $name != undefined) ? $name.value : '';
			var $address = document.getElementById("address");
			var address = ($address != null && $address != undefined) ? $address.value
					: '';
			var $Email = document.getElementById("email");
			var Email = ($Email != null && $Email != undefined) ? $Email.value
					: '';

			//创建ajax对象
			var xmlhttp;
			//判断浏览器是否支持ActiveX控件
			if (window.XMLHttpRequest) {
				// code for IE7+, Firefox, Chrome, Opera, Safari
				xmlhttp = new XMLHttpRequest();
			} else {
				// code for IE6, IE5
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			//打开连接，参数1、请求方式，2、url地址，3、是否同步，true异步，false同步
			xmlhttp
					.open(
							"POST",
							"http://localhost:8080/ws-cxf-web-server/service/userWs?wsdl",
							true);
			//指定发送的数据类型
			xmlhttp.setRequestHeader("Content-type", "text/xml;charset=UTF-8");
			//组装消息体
			var orgData = '<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope">';
			orgData += '	<soap:Body>';
			orgData += '		<ns2:setUser xmlns:ns2="http://server.cxf.web.baihoo.com/">';
			orgData += '			<arg0>';
			orgData += '				<address>' + address + '</address>';
			orgData += '				<email>' + Email + '</email>';
			orgData += '				<id>' + idNo + '</id>';
			orgData += '				<name>' + name + '</name>';
			orgData += '			</arg0>';
			orgData += '		</ns2:setUser>';
			orgData += '	</soap:Body>';
			orgData += '</soap:Envelope>';
			//设置回调函数
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					//以文本形式
					var result = xmlhttp.responseText;
					//以xml文档对象
					var obj = xmlhttp.responseXML;
					//解析文档
					var returns = obj.getElementsByTagName("return");
					alert(returns);
				}
			}
			//发送消息体
			xmlhttp.send(orgData);
		}

		
		$(function(){
			var url = '<%=url%>';
			$("#add").click(function(){
				//獲取用戶的基本數據
				var idNo = $("#idNo").val();
				var name = $("#name").val();
				var address = $("#address").val();
				var Email = $("#email").val();
				//组装消息体
				var orgData = "method=setUser&";
				orgData +="id="+idNo+"&";
				orgData +="name="+name+"&";
				orgData +="address="+address+"&";
				orgData +="email="+Email;
				//用两个不同的類型的SOAP協議发布应用，建议：发布服务的时候使用SOAP1.2，客户端调用的时候使用SOAP1.1
				/* 
				$.ajax({
					url:'http://localhost:8080/ws-cxf-web-client2'+'/'+'UserService.servlet?'+orgData,
					type:"POST",
					dataType:'json',//返回值的数据类型
					cache:false,//禁止缓存
					async:false,//异步开启
					//contentType:'application/json;charset=UTF-8',//指定发送的数据类型
					success:function(responseText){
						alert("添加成功");
					},
					error:function(){
						alert('system error');
					}
				});
				 */
				url='http://localhost:8080/ws-cxf-web-client2'+'/'+'UserService.servlet?'+orgData;
				 
				var args = "";
				
				$.post(url,args,function(data){
					alert("添加成功");
				});
			});
			$("#select").click(function(){
				/* 
				var data='<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope">';
					  data+='	<soap:Body>';
				      data+='		<ns2:findByAll xmlns:ns2="http://server.cxf.web.baihoo.com/" />';
				      data+='	</soap:Body>';
				      data+='</soap:Envelope>';
				      
				 $.ajax({
					url:'http://localhost:8080/ws-cxf-web-server/service/userWs',
					type:'post',
					dataType:'xml',//返回值的数据类型
					contentType:'text/xml;charset=UTF-8',//指定发送的数据类型
					data:data,//发送的消息体
					success:function(responseText){
						$("#tdiv").empty();
						var jueryObj = $(responseText);
						var returns = jueryObj.find("return");
						var result = '';
						returns.each(function(){
							var  name = $(this).find('name').text();
							var  id = $(this).find('id').text();
							var address = $(this).find('address').text();
							var email = $(this).find('email').text();
							result = result + id + "    " + name + "     "+email + "		"+address+"<br>";
						});
						$("#tdiv").append(result);
					},
					error:function(){
						alert('system error');
					}
				 });    
				  */
				url='http://localhost:8080/ws-cxf-web-client2'+'/'+'UserService.servlet';
				var args = "method=findAll";
				$.post(url,args,function(data){
					$("#tdiv").empty();
					var daObj = eval("("+data+")");
					//alert(data);
					var result="";
					for(var i = 0 ; i<daObj.length;i++){
						var user = daObj[i];
						result = result + user.id + "    " + user.name + "     "+user.email + "		"+user.address+"<br>";
					}
					$("#tdiv").append(result);
					console.info(data);
				});
			});
		})
	</script>
</head>
<body>
	編號：<input type="text" id="idNo"> <br>
	姓名：<input type="text" id="name"> <br>
	地址：<input type="text" id="address"> <br>
	Email：<input type="text" id="email"> <br>
	<input type="button" id="add" value="添加" >
	<input type="button" id="select" value="查询">
	<div id="tdiv" style="border: 1px solid ;width: 400px;height: 400px;"></div>
</body>
</html>