<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		Customer First name: <form:input path="firstName" placeholder="enter firstname"/>
		<br><br>
		Customer Last name: <form:input path="lastName" placeholder="enter lastname"/>
		<form:errors path="lastName"  cssClass = "error"></form:errors>
		
		<br><br>
		Customer frepasses: <form:input path="freepasses" placeholder="enter pass"/>
		<form:errors path="freepasses"  cssClass = "error"></form:errors>
		
		
		<br><br>
		Customer postal code: <form:input path="postalCode" placeholder="enter postal code"/>
		<form:errors path="postalCode"  cssClass = "error"></form:errors>
		
		<input type="submit"/>
	
	</form:form>

</body>
</html>