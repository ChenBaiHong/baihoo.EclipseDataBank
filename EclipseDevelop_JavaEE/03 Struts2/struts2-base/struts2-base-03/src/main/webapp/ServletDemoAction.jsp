<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	
  </head>
  
  <body>
  	<%
  		session.setAttribute("sname", "svalue");
  		application.setAttribute("aname", "avalue");
  	
  	%>
  	<a href="${pageContext.request.contextPath}/demo1">访问demo1servletAction</a>
  </body>
</html>
