<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/mocom/resources/index.css">
</head>
<body>
	<form action="loginchk" method="post">
		<div id="root">
			<div class="container">

				<div class="left_panel">
					<img src="/mocom/resources/images/ldg.jpg">
				</div>
				<div class="right_panel">
					<div class="right_panel_main">
						<h3>로그인</h3>
						<h5>ID</h5>
						<div>
							<div>
								<input type="text" name="id">
							</div>
						</div>
						<div>
							<h5>PW</h5>
						</div>
						<div>
							<input type="text" name="pw">
						</div>
						<div>
							<input type="submit" value="로그인">
						</div>
					</div>
				</div>

			</div>
		</div>
	</form>
</body>
</html>