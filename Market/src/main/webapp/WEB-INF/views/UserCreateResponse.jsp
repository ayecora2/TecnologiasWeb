<%@page import="Market_DA.UserDA"%>
<%@page import="Market_DO.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<?xml version "1.0"?>
<!-- File: claimresponseserverpage.jsp -->
<jsp:useBean id="userBean" class="Market_DO.User" scope="request" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtm111/DTD/xhtm111.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
<head>
	<title>Respuesta Crear Usuario</title>
	
<script src="bootstrap/js/jquery-3.3.1.slim.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
</head>
<body>

	<jsp:include page="templates/_NavBarView.jsp" />
	<p>gracias</p>
	<jsp:getProperty name="userBean" property="nombre"/>
	<jsp:setProperty name="userBean" property="userType_Id" value= "2"/>
	<%
		String respuesta = UserDA.addUsuarios(userBean);
		System.out.printf(respuesta);
	%>

</body>
</html>