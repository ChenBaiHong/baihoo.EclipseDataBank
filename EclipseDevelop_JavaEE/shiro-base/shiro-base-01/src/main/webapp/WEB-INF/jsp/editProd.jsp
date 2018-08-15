<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>編輯商品頁面</title>
<!-- 包含所需的頭文件 -->
<%@ include file="/WEB-INF/include/include.jsp"%>
</head>
<body>
	<div class="container">
		<c:if test="${scope.session.usercode !=null }">
			<a role="menuitem" tabindex="-1" href="${ctx }/login/userLogout.do">退出</a>
		</c:if>
		<c:if test="${scope.session.usercode !=null }">
			<a role="menuitem" tabindex="-1" href="${ctx }/login/targetLogin.do">登陆</a>
		</c:if>
		<!-- 
		 上传文件form表单不要忘记设置
	 		enctype="multipart/form-data"
	 	 -->	
		<form class="form-horizontal" role="form" action="${ctx }/prod/editProdSubmit.do" method="post" enctype="multipart/form-data">
			<%-- 
			<input type="hidden" name="id" value="${product.id}">
			 --%>
			<div class="form-group">
				<label class="sr-only" for="name">商品名称</label> <input type="text"
					class="form-control" id="name" name="name" value="${product.name }"
					placeholder="请输入名称">
			</div>

			<div class="form-group">
				<label for="price" class="sr-only">商品价格</label>
					<!-- 数字类型，最大9999 最小值0 ，精确位数2位 -->
					<fieldset>
					<input type="number" class="form-control" id="price" name="price" value="${product.price }"
						placeholder="请输入商品价格" step="0.01" min="0" max="9999" ><span class="validity"></span>
					</fieldset>
			</div>
			<div class="form-group">
				<label for="price" class="sr-only">上传商品图片</label>
				<c:if test="${product.picPath !=null}">
					<fieldset>
						<img alt="" src="/springPic/${ product.picPath}" width="100">
					</fieldset>
				</c:if>
					<fieldset>
						<input type="file" class="form-control" id="pictureFile" name="pictureFile">	
					</fieldset>
			</div>
            <div class="form-group">
                <label for="shelfTime" class="sr-only">商品上架日期</label>
                <div class="input-group date form_datetime col-md-5" data-date="1979-09-16 00:00" data-date-format="yyyy-mm-dd HH:ii" data-link-field="shelfTime">
                    <input class="form-control" size="16" height="25px" type="text"  name="shelfTime" value="<fmt:formatDate value="${product.shelfTime }" pattern="yyyy-MM-dd HH:mm"/>">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
					<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
				<input type="hidden" id="shelfTime"  value=""/><br/>
            </div>
			<div class="form-group">
				<label for="name">产品品牌</label> 
				<select class="form-control" name="bId">
					<option> --选择品牌--</option>
					<c:forEach items="${branList}" var="brand">
						<!-- 第一种方式，获取类下的类的数据比对 -->
						<c:if test="${brand.id == product.bhBrandCustom.id}" >
							<option value="${brand.id }" selected="selected">${brand.name}</option>
						</c:if>
						<c:if test="${brand.id != product.bhBrandCustom.id}" >
							<option value="${brand.id }">${brand.name}</option>
						</c:if>
					</c:forEach>
				</select>
			</div>
			<%-- 
			<div class="form-group">
				<label for="name">商品类别</label> 
				<select class="form-control" name="cId">
					<option> --选择类别--</option>
					<c:forEach items="${cateList}" var="cate">
						<!-- 第二种方式，获取类的数据比对 -->
						<c:if test="${cate.id == product.cId}">
							<option value="${cate.id }" selected="selected">${cate.name}</option>
						</c:if>
						<c:if test="${cate.id != product.cId}">
							<option value="${cate.id }">${cate.name}</option>
						</c:if>
					</c:forEach>
				</select>
			</div>
			 --%>
			 
			<div class="form-group">
				<label for="name">商品类别</label> 
				<select class="form-control" name="cId">
					<option> --选择类别--</option>
					<!-- 
						单独将商品类型的方法提取出来，讲方法返回值填充request，再页面回显 
						通过后天传递map形式的参数
					-->
					<c:forEach items="${pcMap}" var="cate">
						<!-- 第二种方式，获取类的数据比对 -->
						<c:if test="${cate.key == product.cId}">
							<option value="${cate.key }" selected="selected">${cate.value}</option>
						</c:if>
						<c:if test="${cate.key != product.cId}">
							<option value="${cate.key }">${cate.value}</option>
						</c:if>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="description">产品描述</label>
				<textarea class="form-control" rows="3" name="description">${product.description}</textarea>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">提交</button>
				</div>
			</div>
		</form>
		<c:forEach items="${errors}" var="error">
			<button type="button" class="btn btn-default btn-sm">
				<span class="glyphicon glyphicon-exclamation-sign"></span>
				${error.defaultMessage }
			</button>
		</c:forEach>
	</div>
	<script type="text/javascript">
    $('.form_datetime').datetimepicker({
        language:  'zh-CN',  //日期
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2,
        forceParse: 0
    });
	</script>
</body>
</html>