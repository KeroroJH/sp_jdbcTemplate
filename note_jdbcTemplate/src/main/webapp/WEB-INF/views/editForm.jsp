<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/edit.do" method="post">
	<table width="500" border="1">
		<tr>
			<td>작성자</td>
			<td><input type="text" name="writer" value="${boardview.writer}"/></td>
		<tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="${boardview.title}"/></td>
		<tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" rows="10" cols="50">${boardview.content}</textarea></td>
		<tr>
	</table>
	<input type="hidden" name="no" value="${boardview.no}">
	<input type="submit" value="수정">
</form>
<p><a href="/list.do">글목록</a></p>
</body>
</html>
