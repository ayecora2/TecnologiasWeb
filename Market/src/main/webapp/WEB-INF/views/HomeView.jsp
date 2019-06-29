<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html title="Electro Market">

	<head>
		<title>Electro Market</title>
		<script src="bootstrap/js/jquery-3.3.1.slim.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
		<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
		<jsp:useBean id="loginBean" class="Market_DO.Login" scope="request"/>
	</head>
	
	<body>
		<jsp:include page="templates/_NavBarView.jsp" />
	
		<div id="containerProductos" class="container-fluid text-center bg-grey">
			<h4>Nuestros Productos Destacados</h4><br>	
	            <div class="row text-center container-fluid">
	        	    <c:forEach var="produc" items="${listProductosPuntuados}" varStatus="tagStatus">
					    <div class="col-md-3">
	                		<div class="thumbnail">					
				                <p><strong>${produc.getNombre()}</strong></p>
				                <a href="productoRequest?id=${produc.getId()}&categoria_Id=${produc.getCategoria_Id()}&tienda_Id=${produc.getTienda_Id()}&marca_Id=${produc.getMarca_Id()}&nombre=${produc.getNombre()}&modelo=${produc.getModelo()}&imagen=${produc.getImagen()}&descripcion=${produc.getDescripcion()}&cantidad=${produc.getCantidad()}&precio=${produc.getPrecio()}&puntos=${produc.getPuntuacion()}">
				                <img title="${produc.getNombre()}" src="content/Images/Productos/${produc.getImagen()}" alt="Imagen del producto" width="200" height="150"></a>
				                <p>"${produc.getDescripcion()}"</p>
				                <p><b>Oferta</b> ${produc.getPrecio()} &#8364;</p>
				                <p>${produc.getPuntuacion()} &#9733;</p>
	                		</div>
	            		</div>
					</c:forEach>
	            </div><br>
	      </div>
	</body>
	
	<footer><jsp:include page="templates/_Footer.jsp" /></footer>
</html>