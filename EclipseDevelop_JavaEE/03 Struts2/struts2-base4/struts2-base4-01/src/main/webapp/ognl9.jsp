<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>演示:$用法</title>

</head>


<body>
	<%
		request.setAttribute("username", "张三");
	%>

	在国际化文件中使用:<br>
	<s:i18n name="com.baihoo.resource.my">
		<s:text name="username"/>
	</s:i18n>
</body>
</html>
