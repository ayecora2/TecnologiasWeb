<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>

<?xml version="l.0"?>
<!DOCTYPE html><html lang="es">

<head>
<meta charset="UTF-8">

<title>Formulario de Acceso</title>

<script src="bootstrap/js/jquery-3.3.1.slim.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
</head>
<body>

	<jsp:include page="templates/_NavBarView.jsp" />		
	<form action="UserLoginRequest" method="get">
		<label for="username">Nombre de usuario/email:</label>
		<input type="text" name="email" id="email"/>
		<br />
		<label for="new">Contraseña:</label>
		<input type="password" name="pass" id="pass"/>
		<br />
		<input type="submit" value="Submit" />
	</form>
	<jsp:include page="templates/_Footer.jsp" />

</body>
</html>