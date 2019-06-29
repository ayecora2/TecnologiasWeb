<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<jsp:useBean id="productoBean" class="Market_DO.Producto" scope="request"/>
<html title="Electro Market">
    <head>
    	<meta charset="UTF-8">
        <script src="bootstrap/js/jquery-1.10.2.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/Myjs.js"></script>
        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css"> 
        <link rel="stylesheet" href="bootstrap/css/fichas.css" type="text/css" />
        <title>Ficha Producto</title>
    </head><style></style>
    <body>  
 		<jsp:include page="templates/_NavBarView.jsp" />
	      <div id="containerProductos" class="container-fluid text-center bg-grey">      
	            <h2><ins><b>${productoBean.getNombre()}</b></ins></h2><br>
	            <div class="d-flex justify-content-between"><br>
	            	<div class="text-left">
		            	<fieldset class="border p-2" style="background-color: DarkCyan;">
							<legend  class="w-auto"><b>Ficha del Producto</b></legend>				
								<UL style="background-color: PapayaWhip;">
									<li><b>Referencia</b> ${productoBean.getId()} </li>
									<li><b>Categoría</b> ${productoBean.getCategoria_Id()}</li>
									<li><b>Disponible en tienda</b> ${productoBean.getTienda_Id()}</li>
									<li><b>Marca</b> ${productoBean.getMarca_Id()}</li>
									<li><b>Nombre Producto</b> ${productoBean.getNombre()}</li>
									<li><b>Modelo</b> ${productoBean.getModelo()}</li>
									<li><b>Descripción</b> ${productoBean.getDescripcion()}</li>
									<li><b>Cantidad disponible</b> ${productoBean.getCantidad()}</li>
									<li><b>Precio</b> ${productoBean.getPrecio()} &#8364;</li>
									<li><b>Puntuación</b> ${productoBean.getPuntuacion()} &#9733;</li>
								</UL>
						</fieldset><br>
					</div>
					<img width="300" height="300" src="content/Images/Productos/${productoBean.getImagen()}" alt="Portada del producto"><br> 
				</div><br>
          </div>
 	</body>          
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

<footer>
	<jsp:include page="templates/_footerProductos.jsp" />
</footer>
</html>
