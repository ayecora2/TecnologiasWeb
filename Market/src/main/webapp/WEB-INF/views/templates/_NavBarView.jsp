<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html><html lang="es"> <meta charset="UTF-8">

<link rel="stylesheet" href="bootstrap/css/compiled-4.8.1.min.css"><style></style>

<!-- BARRA LAYOUT -->
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="margin-bottom: 15px;">
	<a class="navbar-brand" href="/web/">Electro S&amp;A</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
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
			<li class="nav-item"><a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Gestión</a></li>
			<li class="nav-item dropdown" style="float: right;"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Usuarios </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" data-toggle="modal" data-target="#miLogin">Acceso a mi cuenta</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="User">Lista Usuarios</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="javascript:alert('No sabe lo que hace, siga comprando');"><b>¿Salir?</b></a>
				</div></li>
		</ul>

		<button type="button" class="btn btn-sm" data-toggle="modal" data-target="#miLogin" title="Mi Cuenta">
			<img src="content/Icons/glyph/svg/si-glyph-person-people.svg" height="20" width="20" />
		</button>
		<!-- CARRITO -->
		<button type="button" class="btn btn-sm" data-toggle="modal" data-target="#miCarrito" title="Mi compra">
			<img src="content/Icons/glyph/svg/si-glyph-basket.svg" height="20" width="20" />
		</button>
		<button type="button" class="btn btn-sm" data-toggle="tooltip" data-target="#top" title="Documentación">
			<img src="content/Icons/glyph/svg/si-glyph-document.svg" height="20" width="20" />
		</button>
</nav>		
				<!-- Modal -->
			<div class="modal fade" id="miLogin" tabindex="-1" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">				
						<div class="modal-body mb-0 p-0">	
							<div class="embed-responsive embed-responsive-4by3 z-depth-1-half">					
								<iframe class="embed-responsive-item" src="AddUser" allowfullscreen></iframe>
							</div>
						</div>
						<div class="modal-footer justify-content-center" style="background-color:#EEE8AA;">
							<button type="button" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar</button>							
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="miCarrito" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">				
						<div class="modal-body">
							<a href="AddUser">Test2</a>
						</div>
						<div class="modal-footer justify-content-center" style="background-color:#E6E6FA;">
							 <button type="button" class="btn btn-outline-primary btn-rounded btn-md ml-4" data-dismiss="modal">Cerrar</button>
						</div>
					</div>
				</div>
			</div>
		

