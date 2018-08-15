<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	
  </head>
  
  <body>
  	<%
  		//生成一个令牌
  		String token=UUID.randomUUID().toString();
  	
  		session.setAttribute("token", token);
  	%>
  
  	<form action="${pageContext.request.contextPath}/regist.servlet" method="get">
  		<input type="hidden" name="token" value="<%=token%>">
  		username:<input type="text" name="username"><br>
  		password:<input type="password" name="password"><br>
  		<input type="submit" value="注册">
  	</form>
  </body>
</html>
