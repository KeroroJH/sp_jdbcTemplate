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
    <div>
		<table width="500" border="1">
			<tr>
				<td>번호</td>
				<td>작성자</td>
				<td>제목</td>
				<td>조회수</td>
				<td>날짜</td>
			<tr>
			<c:forEach items="${boardlist}" var="dto">
			<tr>
				<td>${dto.no}</td>
				<td>${dto.writer}</td>
				<td><a href="/view.do?no=${dto.no}">${dto.title}</a></td>
				<td>${dto.viewcnt}</td>
				<td>${dto.regdate}</td>
			<tr>
			</c:forEach>
		</table>
		<p><a href="/writeForm.do">글작성</a></p>
		
    </div> 
</body>
</html>