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
		</div><br />
		<div>
			<label>Sexo: </label>
			Feminino<form:radiobutton path="sexo" value="F" />
			Masculino<form:radiobutton path="sexo" value="M" />
		</div><br />
		<div>
			<label>Idade</label>
			<form:input path="idade" />
		</div><br />
		<div>
			<label>Matérias</label>
			Geografia<form:checkbox path="materia" value="Geografia" /><br />
			Inglês<form:checkbox path="materia" value="Inglês" /><br />
			História<form:checkbox path="materia" value="História" /><br />
			Matemática<form:checkbox path="materia" value="Matemática" /><br />
		</div><br />
		<div>
			<label>País</label>
			<form:select path="country">
				<c:forEach varStatus="index" items="${estudante.listaPaises}" var="iten">
					<form:option value="${iten}"/>
				</c:forEach>
			</form:select>
		</div><br />
		<button type="submit" >Cadastrar</button>
	</form:form>
	
</body>
</html>