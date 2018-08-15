<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	
  </head>
  
  <body>
  	<s:fielderror/>
  	<s:actionerror/>
  	<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
  		<input type="file" name="upload"><br>
  		<input type="file" name="upload"><br>
  		<input type="file" name="upload"><br>
  		<input type="submit" value="上传">
  	</form>
  </body>
</html>
