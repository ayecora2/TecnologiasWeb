<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<?xml version "1.0"?>
<!-- File: claimresponseserverpage.jsp -->
<jsp:useBean id="userBean" class="Market_DO.User" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtm111/DTD/xhtm111.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
<head>
	<title>Respuesta</title>
</head>
<body>
	<p>gracias </p>
	<jsp:getProperty name="userBean" property="nombre"/>
	
</body>
</html>