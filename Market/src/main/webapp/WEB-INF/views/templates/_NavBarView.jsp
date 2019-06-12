<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html><html lang="es"> <meta charset="UTF-8">

<link rel="stylesheet" href="bootstrap/css/compiled-4.8.1.min.css"><style></style>

<!-- BARRA LAYOUT -->
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="margin-bottom: 15px;">
	<a class="navbar-brand" href="/Market">Electro S&amp;A</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="/Market">Home<span class="sr-only">(current)</span></a></li>			
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
			/** Muestra el menú del usuario de compras solo si se está logueado como usuarios
			**/
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
			<%
			}
		%>		
				<%
			/** Muestra el menú del usuario de compras solo si se está logueado como usuarios
			**/
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
					<%
			}
		%>	
				
			<%
			/** Muestra el menú del usuario de compras solo si se está logueado como usuarios
			**/
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
			<%
			}
		%>	
		</ul>
	</div>
	<%
			/** muestra el usuario logueado y la opción de desloguear y registrar antidua. Si se arregla lo otro
			Se cambian los enlaces
			**/
		if ((session.getAttribute("User") == null) || (session.getAttribute("User") == "")) {				
		%>
			No estas logueado &nbsp;&nbsp;|&nbsp;&nbsp;<a href="UserLogin">Login</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="UserCreateBCK">Sing up</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		<%
		} else {
		%>
			Bienvenido 
			<%=session.getAttribute("User")%>&nbsp;&nbsp;|&nbsp;&nbsp;
			<a href='UserLogout'>Log out</a>&nbsp;&nbsp;|&nbsp;&nbsp;

		<%
			/** Muestra el tipo de usuario
			**/
		if ((session.getAttribute("Role").equals("2"))) {				
		%>
			Usuario&nbsp;&nbsp;|&nbsp;&nbsp;
		<%
		}
		if (session.getAttribute("Role").equals("1")){
		%>
			Admin&nbsp;&nbsp;|&nbsp;&nbsp;
		<%
		}
		%>

		<%
		}
		%>
		<!-- Mostrar boton de usuario Implementación futura
		<button type="button" class="btn btn-sm" data-toggle="modal"
			data-target="#" title="Mi Cuenta">
			<img src="content/Icons/glyph/svg/si-glyph-person-people.svg"
				height="20" width="20" />
		</button> -->
		<!-- CARRITO -->
		<button type="button" class="btn btn-sm" data-toggle="modal" data-target="#miCarrito" title="Mi compra">
			<img src="content/Icons/glyph/svg/si-glyph-basket.svg" height="20" width="20" />
		</button>
		<button type="button" class="btn btn-sm" data-toggle="modal" data-target="#documentacion" title="Documentación">
			<img src="content/Icons/glyph/svg/si-glyph-document.svg" height="20" width="20" />
		</button>
</nav>		
				<!-- Modal Implementación futura Mostrará el login con HTML5
			<div class="modal fade" id="miLogin" tabindex="-1" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">				
						<div class="modal-body mb-0 p-0" style="background-color:#AFEEEE;">	
							<div class="embed-responsive embed-responsive-4by3 z-depth-1-half">	
							  	
								<iframe class="embed-responsive-item" src="AddUser"></iframe>
							</div>
						</div>
						<div class="modal-footer justify-content-center" style="background-color:#EEE8AA;">
							<button type="button" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar</button>							
						</div>
					</div>
				</div>
			</div>-->
			<div class="modal fade" id="miCarrito" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">				
						<div class="modal-body" style="background-color:#EEE8AA;">
							<a href="AddUser">Test2</a>
						</div>
						<div class="modal-footer justify-content-center" style="background-color:#E6E6FA;">
							 <button type="button" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="documentacion" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">				
						<div class="modal-body" style="background-color:#EEE8AA;">
							<a href="content/doc/TW_Practica.pdf">Documentación de la Práctica</a></br>
							<a href="content/doc/TW_PEC_SDR.pdf">SDR (Documento de requisitos)</a></br>
							<a href="content/doc/TW_PEC_Manual.pdf">Manual de usuario</a>
						</div>
						<div class="modal-footer justify-content-center" style="background-color:#E6E6FA;">
							 <button type="button" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar</button>
						</div>
					</div>
				</div>
			</div>
