<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html title="Electro Market">
    <head>
        <title>Electro Market</title>
        <script src="bootstrap/js/jquery-3.3.1.slim.min.js" ></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">	
        <spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
    </head>
    <body>      
		<jsp:include page="templates/_NavBarView.jsp" /> 

   
            <h4>Lista de todos los usuarios</h4><br>
            <table class="table table-striped table-responsive-md btn-table">
            	<thead>
				  <tr>
				    <th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-id-badge.svg" height="20" width="20" /></th>
				    <th>Nombre</th>
				    <th>Apellido</th>
				    <th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-mail.svg" height="20" width="20" />Email</th>
				    <th><img class="fas mr-2 blue-text" aria-hidden="true" src="content/Icons/glyph/svg/si-glyph-phone-number.svg" height="20" width="20" />Telefono</th>
				  </tr>
				</thead>
            <c:forEach var="user" items="${listUsuarios}" varStatus="tagStatus">				
				  <tr>
				    <th scope="row">${user.getId()}</th>
				    <td>${user.getNombre()}</td>
				    <td>${user.getApellido()}</td>
				    <td>${user.getEmail()}</td>
				    <td>${user.getTelefono()}</td>
				  </tr>                 	
			</c:forEach>
			</table> 
    </body>
    <footer>
   		<jsp:include page="templates/_Footer.jsp" /> 
    </footer>
</html>