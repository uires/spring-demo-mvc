<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style>
	.error-input{
		color: red;
	}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First Name:<form:input path="firstName" /><br /><br/> 
		
		Last Name(*):<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error-input"/><br/><br/>
		
		C�digo Autoriza��o:<form:input path="codigoAutorizacao"/>
		<form:errors path="codigoAutorizacao" cssClass="error-input"/><br /><br />
		
		C�digo do Curso:<form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error-input"/><br />
		
		
		<button type="submit">Cadastrar</button>
	</form:form>
</body>
</html>