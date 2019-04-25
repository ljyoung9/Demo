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
		</tr>
		<c:forEach var = "board" items="${boardList}">
			<tr>
				<td>${board.id}</td>
				<td>${board.subject}</td>
				<td>${board.content}</td>

			</tr>
		</c:forEach>
	</table>
</body>

</html>