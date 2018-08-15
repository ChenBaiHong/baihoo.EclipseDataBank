<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用戶轉賬</title>
<#include "include/include.ftl">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="table-responsive">
				<form action="/trans/bhAccount/transferAccount" method="post">
					<table>
						<thead>
							<tr>
								<th colspan="2" align="center">
									baiHoo科技銀行
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									轉賬賬戶：
								</td>
								<td>
									<input type="text" name="fromAccount" value="${fromAccount?if_exists}">
								</td>
							</tr>
							<tr>
								<td>
									收款賬戶：
								</td>
								<td>
									<input type="text" name="toAccount" value="${toAccount?if_exists}">
								</td>
							</tr>
							<tr>
								<td>
									轉賬金額：
								</td>
								<td>
									<input type="number" max="20000" min="100" step="0.001" name="money" value="${money?if_exists}">
								</td>
							</tr>
							<tr>
								<td colspan="2" align="left">
									<div class="col-sm-offset-2 col-sm-10">
										<button type="submit" class="btn btn-default">提交</button>
									</div>
								</td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="2" align="center">
									<#-- 
										freemarker 中if..else 的使用
										freemarker 中if_exists標簽 去空判斷
									 -->
									<if_exists  error>
										<font style="color: red">${error?if_exists}</font><br>
									</if_exists >
									天行健，君子儅以自强不息
								</td>
							</tr>
						</tfoot>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>