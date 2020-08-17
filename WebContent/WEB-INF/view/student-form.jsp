<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		student First name: <form:input path="firstName" placeholder="enter name"/>
		<br><br>
		student Last name: <form:input path="secondName" placeholder="enter name"/>
		<br><br>
		<!--  student country name: 
		<form:select path="country">
			<form:option value="Brazil">Brazil</form:option>
			<form:option value="India">India</form:option>
			<form:option value="Canada">Canada</form:option>
			<form:option value="Br">Britain</form:option>
		</form:select>-->
		
		student country name: 
		<form:select path="country">
			<form:options items="${student.countryOptions}"/> 
		</form:select>
		<br><br>
		
		<br><br>
		<!--  java <form:radiobutton path="languageKnown" value="java"/>
		c++ <form:radiobutton path="languageKnown" value="c++"/>-->
		<form:radiobuttons path="languageKnown" items="${student.languageOptions}"/>
		
		Windows<form:checkbox path="operatingSystem" value="windows"/>
		Linux<form:checkbox path="operatingSystem" value="linux"/>
		MacOS<form:checkbox path="operatingSystem" value="macos"/>
		<input type="submit">
		
		
		
	
	</form:form>
</body>
</html>