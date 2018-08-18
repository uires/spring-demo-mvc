<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
	<form:form method="POST" modelAttribute="customer" action="processForm">
		First Name:<form:input path="firstName"/><br /><br/> 
		
		Last Name:<form:input path="lastName"/>
		<form:errors path="lastName"/><br/><br/>
		
		<button type="submit">Cadastrar</button>
	</form:form>
</body>
</html>