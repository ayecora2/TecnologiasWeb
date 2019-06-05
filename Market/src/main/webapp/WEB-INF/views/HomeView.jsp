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
		<h4>Nuestros Productos Destacados</h4>
		<br>
            <div class="row text-center container-fluid">
            <c:forEach var="produc" items="${listProductosPuntuados}" varStatus="tagStatus">
			    <div class="col-md-3">
                <div class="thumbnail">
                
						
                <p><strong>${produc.getNombre()}</strong></p>
               <a href="javascript:alert('Sin enlace colega');"><img title="${produc.getNombre()}" src="content/Images/Productos/${produc.getImagen()}"
               		 alt="Imagen del producto" width="200" height="150"></a>
                <p>"${produc.getDescripcion()}"</p> 
                <p>¡Oferta ${produc.getPrecio()} &#8364;!</p>
                <p>${produc.getPuntuacion()} &#9733;</p>
                
                </div>
            </div>
			</c:forEach>
            </div><br>
        </div>
	<jsp:include page="templates/_Footer.jsp" />

	<!-- MODAL CARRITO -->

	<div class="container">
		<!-- Modal -->
		<div class="modal fade" id="myModalCarrito" role="dialog">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Su compra</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>
					<div class="modal-body">
						<p>Esta podría ser la lista de su compra.</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>