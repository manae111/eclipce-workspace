<%@page contentType= "text/html; charset=UTF-8" %>


<html>
	<head>
		<title>数値を2つ受け取り足し算した結果を返すプログラム</title>
	</head>
	<body>
		<h2>足し算の結果</h2>
		<p>
			入力された数値：<%= request.getAttribute("num1") %>と<%= request.getAttribute("num2") %><br>
			結果：<%= request.getAttribute("sum") %>
		</p>
	</body>
</html>