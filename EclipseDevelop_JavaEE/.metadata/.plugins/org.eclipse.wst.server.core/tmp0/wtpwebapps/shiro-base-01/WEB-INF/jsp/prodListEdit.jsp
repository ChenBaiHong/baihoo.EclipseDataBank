<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>商品列表修改頁面</title>
<!-- 包含所需的頭文件 -->
<%@ include file="/WEB-INF/include/include.jsp" %>
</head>
<body>
	<div class="container">
	
		<div class="row">
			当前用户：${usercode }
			<c:if test="${usercode!=null }">
				<a href="${ctx }/login/userLogout.do">退出</a>
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
			<form class="form-horizontal" role="form" name="prodsForm" action="${ctx }/prod/prodList.do" method="post">
				<table>
					<tr>
						<td><input type="submit" value="查询" /></td>
						<td><input type="button" value="批量删除提交"
							onclick="deleteProds()" /></td>
						<td><input type="button" value="批量修改提交"
							onclick="updateProds()" /></td>
					</tr>
				</table>
				<div class="table-responsive table-hover table-bordered">
				<table class="table">
					<caption>商品响应式表格布局</caption>
					<thead>
						<tr>
							<th>选择</th>
							<th>商品名稱</th>
							<th>商品價格</th>
							<th>上市時間</th>
							<th>功能操作</th>
						</tr>
					</thead>
					<tbody>
						<%-- 
						items 要用${*}獲取集合值
						 --%>
						<c:forEach items="${prodList}" var="prod" varStatus="p">
							<tr>
								<td><input type="checkbox" 
									name="prod_id" value="${prod.id }"/></td>
								<td><input type="text" 
									name="prodList[${p.index }].name"	value="${prod.name}" /></td>
								<td><input type="number" min="0" max="9999" step="0.01" 
									name="prodList[${p.index }].price" value="${prod.price}" /></td>
								<%-- <jsp:useBean id="date" class="java.util.Date" /> --%>
								<td><input type="text" value="<fmt:formatDate value="${prod.shelfTime}" pattern="yyyy-MM-dd HH:mm"/>" 
									name="prodList[${p.index }].shelfTime" class="datetimepicker"></td>
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
			</form>
		</div>
	</div>
	
	<script type="text/javascript">
	$('.datetimepicker').datetimepicker({
		language: 'zh-CN',
	    format: 'yyyy-mm-dd hh:ii'
	});
	//修改商品提交
	function updateProds(){

		//将form的action指向删除商品的地址
		document.prodsForm.action="${ctx }/prod/prodListEditSubmit.do";
		
		//进行form提交
		document.prodsForm.submit();
		
	}
	function deleteProds(){
		document.prodsForm.action="${ctx }/prod/prodListDeleteSubmit.do";
		document.prodsForm.submit();
	}
	</script>
</body>
</html>
