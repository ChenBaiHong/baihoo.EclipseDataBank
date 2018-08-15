<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- jstl 特殊字段格式化標簽，如常見的日格式轉換 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%-- 
	使用Maven构建Java Web项目时，关于jsp中引入js、css文件路径问题
	首先，确保jsp引入了jstl：
							<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

　　其次是具体的引用写法了，使用<c:url>标签：<link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">
 --%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<c:set var="ctx" value="<%=basePath%>" />
<%-- 
<c:set var="ctx" value="${pageContext.request.contextPath}" />
 --%>