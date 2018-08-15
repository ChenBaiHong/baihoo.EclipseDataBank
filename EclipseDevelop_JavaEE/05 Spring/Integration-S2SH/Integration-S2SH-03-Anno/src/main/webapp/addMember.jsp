<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center; ">
<h1>添加成员</h1>
<s:form action="me_addMember" namespace="/" method="post" theme="simple">

	成员名称:<s:textfield name="meName"/><br/>
	成员年纪:<s:textfield name="meAge"/><br/>
	成员编号:<s:textfield name="meNo"/><br/>
	成员描述:<s:textarea name="meDesc"/><br/>
	<s:submit value="添加成员"/>
</s:form>
</body>
</html>