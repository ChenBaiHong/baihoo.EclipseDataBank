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
				<form action="/crud/bhBook/addedBookSubmit" method="post">
					<input type="hidden" name="id" />
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
									<input type="text" name="author">
								</td>
							</tr>
							<tr>
								<td>
									書名：
								</td>
								<td>
									<input type="text" name="bookName">
								</td>
							</tr>
							<tr>
								<td>
									發佈日期：
								</td>
								<td>
									<input type="text" name="pubDate" class="datetimepicker" readonly="true">
								</td>
							</tr>
							<tr>
								<td>
									售價：
								</td>
								<td>
									<input type="number" min="0" max="9999" step="0.01" name="sellPrice">
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