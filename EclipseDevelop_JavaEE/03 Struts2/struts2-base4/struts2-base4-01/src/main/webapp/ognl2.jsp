<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>演示:使用ognl来获取valueStack数据</title>

</head>

<body>
	1.获取栈顶的map
	<br>
	<s:property value="username" />

	<hr>
	2.获取栈顶非map集合数据
	<br>
	<s:property value="[1].top" />

	<hr>
	3.获取OgnlContext中数据
	<br>
	<%
		request.setAttribute("rname", "rvalue");
		session.setAttribute("sname", "svalue");
		application.setAttribute("aname", "avalue");
	%>
	
	<s:property value="#request.rname"/><br>
	<s:property value="#session.sname"/><br>
	<s:property value="#application.aname"/><br>
	
	<s:property value="#attr.sname"/><br>
	<s:property value="#parameters.username[0]"/>

	<s:debug />
</body>
</html>
