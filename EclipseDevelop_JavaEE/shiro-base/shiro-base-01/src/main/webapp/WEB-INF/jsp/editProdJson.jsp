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
		<form class="form-horizontal" role="form" action="" method="post" >
			
			<input type="hidden" name="id">
			
			<div class="form-group">
				<label class="sr-only" for="name">商品名称</label> <input type="text"
					class="form-control" id="name" name="name" 
					placeholder="请输入名称">
			</div>

			<div class="form-group">
				<label for="price" class="sr-only">商品价格</label>
					<!-- 数字类型，最大9999 最小值0 ，精确位数2位 -->
					<fieldset>
					<input type="number" class="form-control" id="price" name="price"
						placeholder="请输入商品价格" step="0.01" min="0" max="9999" ><span class="validity"></span>
					</fieldset>
			</div>
			<div class="form-group">
				<label for="price" class="sr-only">上传商品图片</label>
				<fieldset>
					<img alt="" src="" width="100" id="picture">
				</fieldset>
				<fieldset>
					<input type="file" class="form-control" id="pictureFile"
						name="pictureFile">
				</fieldset>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="button" class="btn btn-default" id="button1" onclick="getProdByRequestJson();">请求的json响应json</button>
					<button type="button" class="btn btn-default" id="button2" onclick="getProdByResponseJson();">key/value相應Json</button>
					<button type="button" class="btn btn-default" id="button2" onclick="veiwProductJson();">RESTful方式相應Json</button>
					
					<button type="reset" class="btn btn-default" id="button2">重置</button>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript">

		// 請求json響應json,請求商品信息，商品信息用json格式，輸出商品信息
		function getProdByRequestJson(){
			// 异步
			$.ajax({
				url:"${ctx}/prodJson/getProdByRequestJson.do",
				type:"post",
				contentType:"application/json;charset=utf-8",
				//請求json數據，使用json表示商品信息
				data:'{"id":"1","name":"大豆"}',
				async: true,
				success:function(data){
					alert(data)
				}
			});
			alert("異步執行！！！")
		}
		
		//通过key/value的形式响应json数据
		function getProdByResponseJson(){
			//同步
			$.ajax({
				url:"${ctx}/prodJson/getProdByResponseJson.do",
				type:"post",
				//請求key/value的數據形式
				data:"id=1&name=大豆",
				async: false,
				success:function(data){
					alert(data)
				}
			});
			alert("同步執行！！！")
		}
		
		function veiwProductJson(){
			//同步
			$.ajax({
				url:"${ctx}/prodJson/veiwProductJson/1",
				type:"post",
				data:"",
				async: false,
				success:function(data){
					alert(data)
				}
			});
			alert("同步執行！！！")
		}
	</script>
</body>
</html>