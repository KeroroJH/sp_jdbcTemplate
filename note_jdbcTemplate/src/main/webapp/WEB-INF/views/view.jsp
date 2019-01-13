<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
		<table width="500" border="1">
			<tr>
				<td>번호</td><td>${boardview.no}</td>
			</tr>
			<tr>	
				<td>작성자</td><td>${boardview.writer}</td>
			</tr>
			<tr>	
				<td>제목</td><td>${boardview.title}</a></td>
			</tr>
			<tr>
				<td>조회수</td><td>${boardview.viewcnt}</td>
			</tr>
			<tr>	
				<td>날짜</td><td>${boardview.regdate}</td>
			</tr>
		</table>
		<p>${boardview.content}</p>
		<p><a href="/editForm.do?no=${boardview.no}">글수정</a></p>
		<p><a href="/list.do">글목록</a></p>

</body>
</html>