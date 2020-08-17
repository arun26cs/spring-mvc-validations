<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
student is successful: "${student.firstName} ${student.secondName} is from ${student.country} and codes ${student.languageKnown}"

<ul>
	<c:forEach var="opsys" items="${student.operatingSystem}">
		<li>${opsys}</li>
	</c:forEach>
</ul>
</body>
</html>