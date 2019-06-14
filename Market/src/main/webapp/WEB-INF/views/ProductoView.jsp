<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<!DOCTYPE html>
<jsp:useBean id="productoBean" class="Market_DO.Producto" scope="request"/>
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
            <h4>${productoBean.getNombre()}</h4><br>
            <div class="row text-center container-fluid">
            ${productoBean.getId()}<br>
            ${productoBean.getCategoria_Id()}<br>
${productoBean.getTienda_Id()}<br>
${productoBean.getMarca_Id()}<br>
${productoBean.getNombre()}<br>
${productoBean.getModelo()}<br>
${productoBean.getImagen()}<br>
${productoBean.getDescripcion()}<br>
${productoBean.getCantidad()}<br>
${productoBean.getPrecio()}<br>
${productoBean.getPuntuacion()}<br>
 
            </div><br>
        </div>
		
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
<footer>
	<jsp:include page="templates/_footerProductos.jsp" />
</footer>
</html>
