<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html title="Electro Market">
<head>
<title>Documentación</title>
<script src="bootstrap/js/jquery-3.3.1.slim.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
<jsp:useBean id="loginBean" class="Market_DO.Login" scope="request"/>

</head>
<body>
	<jsp:include page="templates/_NavBarView.jsp" />

 <a href="doc/TW_PEC_SDR.pdf">SDR (Documento de requisitos)</a>
               		 

</body>
<footer>
	<jsp:include page="templates/_Footer.jsp" />
</footer>

</html>