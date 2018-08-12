<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Estudante</title>
</head>
<body>
	<h3>Cadastrato de Estudante</h3>
	<form:form action="processForm" modelAttribute="estudante">
		<div>
			<label>Nome</label>
			<form:input path="nome" />
		</div>
		<div>
			<label>Idade</label>
			<form:input path="idade" />
		</div>
		<div>
			<label>País</label>
			<form:select path="country" itemLabel="Brasil" value="BRA">
				<form:option value="ALE" label="Alemanha"/>
				<form:option value="FRA" label="França"/>
				<form:option value="ANG" label="Angola"/>
			</form:select>
		</div>
		<button type="submit" >Cadastrar</button>
	</form:form>
	
</body>
</html>