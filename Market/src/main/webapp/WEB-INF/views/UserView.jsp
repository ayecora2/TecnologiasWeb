<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html title="Electro JP">
    <head>
        <title>Electro Market</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">	
        <spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
    </head>
    <body>
       
		<jsp:include page="templates/_NavBarView.jsp" /> 

        <div id="containerProductos" class="container-fluid text-center bg-grey">
            <h4>Inventario</h4><br>
            <div class="row text-center container-fluid">
            <div class="col-md-3">
                <div class="thumbnail">
                <img src="content/Images/Productos/Batidoras.jpg" alt="Batidoras" width="400" height="300">
                <p><strong>Batidorass</strong></p>
                <p>Nuestra gama de batidoras</p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="thumbnail">
                <img src="content/Images/Productos/Freidoras.jpg" alt="Freidoras" width="400" height="300">
                <p><strong>Freidoras</strong></p>
                <p>Nuestra gama de Freidoras</p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="thumbnail">
                <img src="content/Images/Productos/Microondas.jpg" alt="Microondas" width="400" height="300">
                <p><strong>Microondas</strong></p>
                <p>Nuestra gama de Microondas</p>
                </div>
            </div>
			<div class="col-md-3">
                <div class="thumbnail">
                <img src="content/Images/Productos/Exprimidoras" alt="Exprimidoras" width="400" height="300">
                <p><strong>Exprimidoras</strong></p>
                <p>Nuestra gama de Exprimidoras</p>
                </div>
            </div>
            <div class="col-md-3">
				<div class="thumbnail">
				<img src="content/Images/Productos/Electrodomesticos%de%cocina.jpg" alt="Electrodomesticos de cocina" width="400" height="300">
				<p><strong>Electrodomésticos de cocina</strong></p>
				<p>Nuestra gama de cocina</p>
				</div>
			</div>
			<div class="col-md-3">
				<div class="thumbnail">
				<img src="content/Images/Productos/Tostadora%20y%20máquina%20de%20coser.jpg" alt="Tostadora y máquina de coser" width="400" height="300">
				<p><strong>Tostadora y máquina de coserk</strong></p>
				<p>Nuestro dúo mágico</p>
				</div>
			</div>
			<div class="col-md-3">
				<div class="thumbnail">
				<img src="content/Images/Productos/CommandAndConquer.jpg" alt="Command & Conquer" width="400" height="300">
				<p><strong>Command And Conquer</strong></p>
				<p>Nuestros Juegos</p>
				</div>
			</div>
			<div class="col-md-3">
                <div class="thumbnail">
                <img src="ontent/Images/Productos/diablo2.jpg" alt="Diablo II" width="400" height="300">
				<p><strong>Diablo II</strong></p>
				<p>Nuestros Juegos</p>
                </div>
            </div>
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