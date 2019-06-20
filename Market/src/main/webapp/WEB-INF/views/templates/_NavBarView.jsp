<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html><html lang="es"><meta charset="UTF-8">

<link rel="stylesheet" href="bootstrap/css/compiled-4.8.1.min.css"><style></style>
<!-- BARRA LAYOUT -->
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="margin-bottom: 15px;">
	<a class="navbar-brand" href="/web/">Electro S&amp;A</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"	data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="/web/">Home<span class="sr-only">(current)</span></a></li>			
			<li class="nav-item"><a class="nav-link" href="Producto">Productos</a></li>
			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Servicios </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Venta</a> 
					<a class="dropdown-item" href="#">Financiación</a> 
					<a class="dropdown-item" href="#">Servicio PostVenta</a>
					<a class="dropdown-item" href="#">Reparto a Domicilio</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="mailto:areaclientes@electromarket.es?Subject=Solicitud%20de%20contacto"><b>Contactar con nosotros</b></a>
				</div></li>
		<%
			/** Muestra el menú del usuario de compras solo si se está logueado como usuarios	**/
			if ((session.getAttribute("User") != null) && (session.getAttribute("Role").equals("1"))) {				
		%>	
			<li class="nav-item dropdown" style="float: right;"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Gestion </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Alta de productos</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Alta de inventario</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#"><b>Anulación de ventas</b></a>
				</div></li>
		<% } %>		
		<%
			/** Muestra el menú del usuario de compras solo si se está logueado como usuarios	**/
			if ((session.getAttribute("User") != null) && (session.getAttribute("Role").equals("1"))) {				
		%>			
			<li class="nav-item dropdown" style="float: right;"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Administracion </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Compras</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="User">Lista Usuarios</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Añadir ofertas</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Crear productos</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#"><b>¿Salir?</b></a>
				</div></li>
		<% } %>	
				
			<%	/** Muestra el menú del usuario de compras solo si se está logueado como usuarios **/
			if ((session.getAttribute("User") != null) && (session.getAttribute("User") != "")) { 
			%>	
			<li class="nav-item dropdown" style="float: right;"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Mis compras </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Carrito</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Compras anteriores</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#"><b>Promociones</b></a>
				</div></li>
			<% } %>	
		</ul>
	</div>
	<%	/** muestra el estado de la sesión (usuario logueado y el tipo). **/
		if ((session.getAttribute("User") == null) || (session.getAttribute("User") == "")) { %>
			<b>Sesión no iniciada</b> &nbsp;
		<% } else if (session.getAttribute("Role").equals("2")){ %>
			<b>Usuario:&nbsp;</b> <%=session.getAttribute("User")%>&nbsp;&nbsp;
		<% } else if (session.getAttribute("Role").equals("1")){ %>
			<b>Admin:&nbsp;</b> <%=session.getAttribute("User")%>&nbsp;&nbsp;
		<% } %>
		    
		<!-- Botón Usuario -->
		<a class="btn btn-sm" data-toggle="modal" data-target="#miLogin" title="Mi Cuenta/Nuevo Usuario">
			<img src="content/Icons/glyph/svg/si-glyph-person-people.svg" height="20" width="20" />
		</a> 
		<!-- Botón Carrito -->
		<a type="button" class="btn btn-sm" data-toggle="modal" data-target="#miCarrito" title="Mi compra">
			<img src="content/Icons/glyph/svg/si-glyph-basket.svg" height="20" width="20" />
		</a>
		<!-- Botón Documentación -->
		<a class="btn btn-sm" data-toggle="modal" data-target="#documentacion" title="Documentación">
			<img src="content/Icons/glyph/svg/si-glyph-document.svg" height="20" width="20" />
		</a>
</nav>		
			<!-- Modal login -->
			<div class="modal fade" id="miLogin" tabindex="-1" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">				
						<div class="modal-body mb-0 p-0"  style="background-color:#AFEEEE;">									
							<% if((session.getAttribute("User") == null) || (session.getAttribute("User") == "")){ %>
								<div class="embed-responsive embed-responsive-4by3">					  	
									<object type="text/html" width="auto" height="auto" class="embed-responsive-item" data="AddUser"></object> 							
								</div>
								<div class="modal-footer justify-content-center" style="background-color:#EEE8AA;">
									<button type="button" onclick="location.reload()" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar Ventana</button>
								</div>
							<% } else { %>
								<div class="modal-body justify-content-center">
									<h3><b>Sesión de Usuario:</b></h3><br>
									 <%=session.getAttribute("User")%><br>
								</div>
								<div class="modal-footer justify-content-center" style="background-color:#EEE8AA;">
									<button type="button" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar Ventana</button>
									<a href="UserLogout" class="btn btn-outline-primary btn-rounded btn-md ml-4"><b>Cerrar Sesión</b></a>
								</div>
							<%	} %>								
						</div>
					</div>
				</div>
			</div>
			<!-- Modal Carrito -->
			<div class="modal fade" id="miCarrito" role="dialog">
				<div class="modal-dialog modal-md">
					<div class="modal-content">	
						<a>Mi carroooo me lo robarón...</a>
						<button type="button" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar</button>
					</div>
				</div>
			</div>
			<!-- Modal Documentación -->	
			<div class="modal fade" id="documentacion" role="dialog">
				<div class="modal-dialog modal-md">
					<div class="modal-content">				
						<div class="modal-body" style="background-color:#F0FFFF;">
							<a href="content/doc/TW_Practica.pdf">Documentación de la Práctica</a><br>
							<a href="content/doc/TW_PEC_SDR.pdf">SDR (Documento de requisitos)</a><br>
							<a href="content/doc/TW_PEC_Manual.pdf">Manual de usuario</a><br>
							<a href="content/doc/TW_PEC_JavaDoc.html">Documentación JavaDoc</a>
						</div>
						<div class="modal-footer justify-content-center" style="background-color:#E6E6FA;">
							 <button type="button" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar</button>
						</div>
					</div>
				</div>
			</div>

