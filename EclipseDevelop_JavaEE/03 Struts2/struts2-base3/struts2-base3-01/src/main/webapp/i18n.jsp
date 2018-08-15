<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>

</head>

<body>
	<%--
  	<s:i18n name="com.baihoo..action.package">
  		<s:text name="nameerror"/>
  	</s:i18n>
  	
  	--%>

	<%--<s:text name="name" />
	
	


--%>
	<s:i18n name="com.baihoo..action.I18nDemo1Action">
		<s:text name="msg">
			<s:param>张三</s:param>
		</s:text>
	</s:i18n>
</body>
</html>
