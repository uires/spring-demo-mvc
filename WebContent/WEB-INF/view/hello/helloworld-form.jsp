<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Form</title>
</head>
<body>
	<form action="processForm" method="GET">
		<input type="text" name="nome"/>
		<button type="submit">Enviar</button>
	</form>
	<hr />
	<form action="processFormTwo" method="GET">
		<input type="text" name="nome"/>
		<button type="submit">Enviar</button>
	</form>
	
	<form action="processFormTree" method="GET">
		<input type="text" name="nome"/>
		<input type="text" name="idade"/>
		<button type="submit">Enviar</button>
	</form>

</body>
</html>
