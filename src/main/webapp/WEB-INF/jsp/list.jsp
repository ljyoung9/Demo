<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cos</title>
</head>

<body>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성일</th>
			<th>작성일</th>
			<th>작성일</th>
			<th>작성일</th>
		</tr>
		<c:forEach var = "prodcuct" items="${productList}">
			<tr>
				<td>${prodcuct.product_id}</td>
				<td>${prodcuct.product_name}</td>
				<td>${prodcuct.product_price}</td>
				<td>${prodcuct.product_category}</td>
				<td>${prodcuct.product_img}</td>
				<td>${prodcuct.category_id}</td>
				<td>${prodcuct.category_name}</td>


			</tr>
		</c:forEach>
	</table>
</body>

</html>