<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página Príncipal</title>
</head>
<body>
	<h1>Bem vindo!</h1><br />
	<a href='<c:url value="/hello/showform" />'>Formulário</a><br />
	<a href='<c:url value="/estudante/showForm" />'>Cadastro de Estudante</a>
</body>
</html>