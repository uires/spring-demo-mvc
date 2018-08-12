<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmação</title>
</head>
<body>
	nome : ${estudante.nome}<br />
	idade : ${estudante.idade}<br />
	país : ${estudante.country}<br />
	sexo : ${estudante.sexo}<br />
	matérias :
	<c:forEach var="item" items="${estudante.materia}">
		${item}<br />
	</c:forEach>
	
</body>
</html>