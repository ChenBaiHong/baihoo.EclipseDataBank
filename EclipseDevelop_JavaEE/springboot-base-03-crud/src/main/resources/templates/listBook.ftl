<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>书籍列表页</title>
<#include "include/include.ftl">
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
				<form action="/crud/bhBook/searchQuery" style="" method="post">
					<table class="table">
						<caption>商品响应式表格布局</caption>
						<thead>
							<tr>
								<th colspan="1" align="left">
									<button type="button" class="btn btn-default">
										<a href="/crud/bhBook/addedBook">添加书籍</a>
									</button>
								</th>
							</tr>
							<tr>
								<#-- 
									${book.author}，这里book可能为null，author也可能为null。这时候 就要使用方法一了，${(book.author)!} 或 ${(book.author)?if_exists}。
								 -->
								<td colspan="1">
									作者：<input type="text" name="author" value="${(book.author)?if_exists}">
								</td>
								<td colspan="1">
									書名：<input type="text" name="bookName" value="${(book.bookName)?if_exists}">
								</td>
								<td colspan="1" align="left">
									<button type="submit" class="btn btn-default">
										查詢
									</button>
								</td>
								<td colspan="2" align="left">
									<button type="reset" class="btn btn-default">
										重置
									</button>
								</td>
							</tr>
							<tr>
								<th>作者</th>
								<th>书名</th>
								<th>发布日期</th>
								<th>售价</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<#list listBook as book>
							<tr>
								<td>${(book.author)!""}</td>
								<td>${book.bookName}</td>
								<!-- 日期轉換格式化，是String類型 -->
								<td>${book.pubDate?string('yyyy-MM-dd')}</td>
								<td>${(book.sellPrice)!""}</td> <!-- 输出book.sellPrice的值：${book.sellPrice!""}。如果book.sellPrice为null，就不会报错，什么也没输出。（重点） -->
								<td>
									<div class="dropdown">
										<button type="button" class="btn dropdown-toggle"
											id="dropdownMenu1" data-toggle="dropdown">
											功能選項<span class="caret"></span>
										</button>
										<ul class="dropdown-menu" role="menu"
											aria-labelledby="dropdownMenu1">
											<li role="presentation"><a role="menuitem" tabindex="-1"
												href="/crud/bhBook/editBook/${book.id}">修改</a></li>
											<li role="presentation"><a role="menuitem" tabindex="-1"
												href="#">刪除</a></li>
										</ul>
									</div>
								</td>
							</tr>
							</#list>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="4" align="center">----书籍列表-----</td>
							</tr>
						</tfoot>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>