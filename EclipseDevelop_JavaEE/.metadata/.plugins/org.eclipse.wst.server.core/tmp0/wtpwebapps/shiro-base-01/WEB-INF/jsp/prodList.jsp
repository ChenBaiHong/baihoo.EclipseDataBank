<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>商品列表頁面</title>
<!-- 包含所需的頭文件 -->
<%@ include file="/WEB-INF/include/include.jsp" %>
</head>
<body>
	<div class="container">
		<div class="row">
		
			<c:if test="${scope.session.usercode !=null }">
				<a role="menuitem" tabindex="-1" href="${ctx }/login/userLogout.do">退出</a>
			</c:if>
			<c:if test="${scope.session.usercode !=null }">
				<a role="menuitem" tabindex="-1" href="${ctx }/login/targetLogin.do">登陆</a>
			</c:if>
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
							<th>商品描述</th>
							<th>功能操作</th>
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
								<td><fmt:formatDate value="${prod.shelfTime}" pattern="yyyy-MM-dd HH-mm-ss"/></td>
								<td>${prod.description}</td>
								<td>
									<div class="dropdown">
										<button type="button" class="btn dropdown-toggle" id="dropdownMenu1"
											data-toggle="dropdown">
											 功能選項<span class="caret"></span>
										</button>
										<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
											<li role="presentation"><a role="menuitem" tabindex="-1" href="#">查看</a>
											</li>
											<li role="presentation"><a role="menuitem" tabindex="-1" href="${ctx }/prod/editProd.do?id=${prod.id}">修改</a>
											</li>
											<li role="presentation"><a role="menuitem" tabindex="-1" href="#">刪除</a>
											</li>
										</ul>
									</div>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
