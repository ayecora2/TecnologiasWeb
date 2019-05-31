<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html title="Electro Market">
<head>
<title>Electro Market</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
</head>
<body>

	<jsp:include page="templates/_NavBarView.jsp" />

	<div id="containerProductos"
		class="container-fluid text-center bg-grey">
		<h4>Nuestros Productos Destacados</h4>
		<br>
		<div class="row text-center container-fluid">
			<div class="col-md-3">
				<div class="thumbnail">
					<img src="content/Images/Productos/Freidoras.jpg" alt="Freidoras" width="200"
						height="200">
					<p>
						<strong>Freidoras</strong>
					</p>
				</div>
			</div>
			<div class="col-md-3">
				<div class="thumbnail">
					<img src="content/Images/Productos/Exprimidoras.jpg" alt="Exprimidoras" width="200" height="200">
					<p>
						<strong>Exprimidoras</strong>
					</p>
				</div>
			</div>
			<div class="col-md-3">
				<div class="thumbnail">
					<img src="content/Images/Productos/Microondas.jpg" alt="Microondas" width="200" height="200">
					<p>
						<strong>Microondas</strong>
					</p>
				</div>
			</div>
			<div class="col-md-3">
				<div class="thumbnail">
					<img src="content/Images/Productos/Batidoras.jpg" alt="Batidoras" width="200" height="200">
					<p>
						<strong>Batidoras</strong>
					</p>
				</div>
			</div>
		</div>
		<br>
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
						<p>This is a large modal.</p>
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