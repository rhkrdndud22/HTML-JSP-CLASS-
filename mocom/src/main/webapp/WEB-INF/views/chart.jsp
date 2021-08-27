<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/mocom/resources/index.css">
<script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<style>
svg {
	width: 200px;
	height: 200px;
	border: 3px solid black
	margin-left: 20px;
}

.bar {
	fill: blue;
}
</style>
</head>
<body>
	<form action="loginchk" method="post">
		<div id="root">
			<div class="container">

				<div class="left_panel" style="padding: 10px 30px 30px 90px;">
					<h1>데이터에 따른 그래프 표시</h1>
					<svg id="myGraph"></svg>
					<button type="button" id="testBtn">업데이트버튼</button>
					<script src="/mocom/resources/d3/sample01.js"></script>
				</div>
				<div class="right_panel">piechart</div>

			</div>
		</div>
	</form>
</body>
</html>