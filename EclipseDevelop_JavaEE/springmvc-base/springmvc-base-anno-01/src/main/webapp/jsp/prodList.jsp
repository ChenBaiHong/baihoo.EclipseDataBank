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
<html>
<head>
<title>訂單項頁面</title>
<link rel="stylesheet"
	href="<c:url value="/html/bootstrap/css/bootstrap.min.css"/>" />
<link rel="stylesheet"
	href="<c:url value="/html/bootstrap/css/bootstrap-responsive.min.css"/>" />
<script src="<c:url value="/html/jQuery/jquery3.2.1.min.js"/>"></script>
<script src="<c:url value="/html/bootstrap/js/bootstrap.min.js"/>"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<!-- 
			中型设备台式电脑（≥992px）.col-md-*
			大型设备台式电脑（≥1200px） .col-lg-*
		 -->
			<div class=" col-md-12 col-lg-12 "></div>
			<!-- bootstrap
				table-responsive響應式表格佈局 
				table-hover	>悬停表格布局
				table-bordered	边框表格布局
				-->
			<div class="table-responsive table-hover table-bordered">
				<table class="table">
					<caption>商品响应式表格布局</caption>
					<thead>
						<tr>
							<th>商品名稱</th>
							<th>商品價格</th>
							<th>上市時間</th>
							<th>操作功能</th>
						</tr>
					</thead>
					<tbody>
						<%-- 
						items 要用${*}獲取集合值
						 --%>
						<c:forEach items="${prodList}" var="prod">
							<tr>
								<td>${prod.name}</td>
								<td>${prod.price}</td>
								<%-- <jsp:useBean id="date" class="java.util.Date" /> --%>
								<td><fmt:formatDate value="${prod.createTime}" pattern="yyyy-MM-dd HH-mm-ss"/></td>
								<td><a href="${pageContext.request.contextPath}/prod/editProd.do?id=${prod.id}">修改</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
