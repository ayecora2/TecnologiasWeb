<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html title="Electro Market">
    <head>
        <title>Electro Market</title>
        <script src="bootstrap/js/jquery-1.10.2.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/Myjs.js"></script>
        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css">	
    </head><style></style>
    <body>  
		<jsp:include page="templates/_NavBarView.jsp" />
        <div id="containerProductos" class="container-fluid text-center bg-grey">
            <h4>Inventario</h4><br>
            <div class="row text-center container-fluid">
            <c:forEach var="produc" items="${listProductos}" varStatus="tagStatus">
			    <div class="col-md-3">
                <div class="thumbnail">
                <a href="javascript:alert('Sin enlace colega');">
                <img id="imagenID" title="${produc.getNombre()}" src="content/Images/Productos/${produc.getImagen()}" alt="Imagen del Producto" width="200" height="150">
                </a>
                <p><strong>${produc.getDescripcion()}</strong></p> 
                <p>${produc.getPrecio()} &#8364;</p>
                </div>
            </div>
			</c:forEach>
            </div><br>
        </div>
	
	<jsp:include page="templates/_footerProductos.jsp" /> 
		
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
				  <p>Pulse Aceptar para procesar su compra o Cancelar para anularla.</p>
					</div>
				<div class="modal-footer">
				  <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
				  <button type="button" class="btn btn-default" data-dismiss="modal">Aceptar</button>
				</div>
			  </div>
			</div>
		  </div>
		</div>
</body>
</html>
