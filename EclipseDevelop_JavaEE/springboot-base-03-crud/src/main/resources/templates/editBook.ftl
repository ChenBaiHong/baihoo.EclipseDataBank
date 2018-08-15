<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加書籍</title>
<#include "include/include.ftl">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="table-responsive">
				<form action="/crud/bhBook/editBookSubmit" method="post">
					<input type="hidden" name="id" value="${book.id}"/>
					<table>
						<thead>
							<tr>
								<td colspan="2" align="center">-------------------添加書籍--------------START</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									作者：
								</td>
								<td>
									<input type="text" name="author" value="${book.author}"/>
								</td>
							</tr>
							<tr>
								<td>
									書名：
								</td>
								<td>
									<input type="text" name="bookName" value="${book.bookName}"/>
								</td>
							</tr>
							<tr>
								<td>
									發佈日期：
								</td>
								<td>
									<input type="text" name="pubDate" class="datetimepicker" readonly="true" value="${book.pubDate?string("yyyy-MM-dd HH:mm")}"/>
								</td>
							</tr>
							<tr>
								<td>
									售價：
								</td>
								<td>
									<input type="number" min="0" max="9999" step="0.01" name="sellPrice" value="${book.sellPrice!""}"/>
									<!-- 输出book.sellPrice的值：${book.sellPrice!""}。如果book.sellPrice为null，就不会报错，什么也没输出。（重点） -->
								</td>
							</tr>
							<tr>
								<td colspan="2" algin="center">
									<div class="col-sm-offset-2 col-sm-10">
										<button type="submit" class="btn btn-default">提交</button>
									</div>
								</td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="2" align="center">-------------------添加書籍--------------END</td>
							</tr>
						</tfoot>
					</table>
				</form>
			<div>
		</div>
	</div>
	<script type="text/javascript">
		$('.datetimepicker').datetimepicker({
			language: 'zh-CN',
		    format: 'yyyy-mm-dd hh:ii'
		});
	</script>
</body>
</html>