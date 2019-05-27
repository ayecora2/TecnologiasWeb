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
                <img src="resources/1.jpg" alt="New York" width="400" height="300">
                <p><strong>New York</strong></p>
                <p>We built New York</p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="thumbnail">
                <img src="content/Images/3.jpg" alt="San Francisco" width="400" height="300">
                <p><strong>San Francisco</strong></p>
                <p>Yes, San Fran is ours</p>
                </div>
            </div>
			<div class="col-md-3">
                <div class="thumbnail">
                <img src="content/Images/3.jpg" alt="San Francisco" width="400" height="300">
                <p><strong>San Francisco</strong></p>
                <p>Yes, San Fran is ours</p>
                </div>
            </div>
            <div class="col-md-3">
				<div class="thumbnail">
				<img src="content/Images/4.jpg" alt="Paris" width="400" height="300">
				<p><strong>Paris</strong></p>
				<p>Yes, we built Paris</p>
				</div>
			</div>
			<div class="col-md-3">
				<div class="thumbnail">
				<img src="content/Images/5.jpg" alt="New York" width="400" height="300">
				<p><strong>New York</strong></p>
				<p>We built New York</p>
				</div>
			</div>
			<div class="col-md-3">
				<div class="thumbnail">
				<img src="content/Images/6.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>San Francisco</strong></p>
				<p>Yes, San Fran is ours</p>
				</div>
			</div>
			<div class="col-md-3">
                <div class="thumbnail">
                <img src="content/Images/3.jpg" alt="San Francisco" width="400" height="300">
                <p><strong>San Francisco</strong></p>
                <p>Yes, San Fran is ours</p>
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