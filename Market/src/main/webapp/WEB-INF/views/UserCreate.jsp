<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>

<!DOCTYPE html><html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Usuario&lt;&gt;</title>
    <style>
        body {
            margin: 0;
            padding: 0;
        }
    </style>
<script src="bootstrap/js/jquery-3.3.1.slim.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="bootstrap/css/compiled-4.8.1.min.css">
<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
</head>

<body>

<div class="mask rgba-black-strong h-100">
  <div class="container py-5">
    <div class="row">
      <div class="col-xl-5 col-lg-6 col-md-10 col-sm-12 mx-auto">

        
        <!-- Tarjeta rotatoria -->
        <div class="card-wrapper">
          <div id="my-card" class="card card-rotating text-center">

            <!-- Cara Login -->
            <div class="face front">
              <div class="card-body">

                <!-- Header -->
                <div class="form-header primary-color">
                  <h3 class="font-weight-500 my-2 py-1"><i class="fas">
                  <img src="content/Icons/glyph/svg/si-glyph-person-people.svg" height="40" width="40" />
                  </i> Iniciar sesión</h3>
                </div>

                <!-- Formulario de Login -->
                <div class="md-form">
                  <i class="fas grey-text d-flex"></i>                 
                  <input type="text" id="email" name="email" class="form-control">
                  <label for="email" class="d-flex">Su email</label>
                </div>
                <div class="md-form">
                  <i class="fas grey-text d-flex"></i>
                  <input type="password" id="password" name="password" class="form-control">
                  <label for="password" class="d-flex">Su contraseña</label>
                </div>
                
                <!-- Footer -->
                <div class="d-flex justify-content-between">
                  <!-- Triggering button -->
                  <a class="rotate-btn text-primary" tabindex="-1" data-card="my-card">crear cuenta nueva</a>
                  <a href="javascript:alert('Rasca y sigue buscando');" class="green-text" tabindex="-2">¿clave olvidada?</a>
                </div>
                <div class="text-center">
                  <button class="btn primary-color white-text btn-lg">Entrar</button>
                </div>
                <!-- FIN.Formulario de Login -->

              </div>
            </div>
            <!-- FIN.Cara Login -->

            <!-- Cara Creación Usuario -->
            <div class="face back">
              <div class="card-body">

                <!-- Header -->
                <div class="form-header primary-color">
                  <h3 class="font-weight-500 my-2 py-1"><i class="fas">
                		  <img src="content/Icons/glyph/svg/si-glyph-baby.svg" height="40" width="40" />
                	  </i> Crear Nueva Cuenta</h3>
                </div>
                 
                <!-- Formulario de Registro-->
                 <form class="form-horizontal" action="UserCreateRequest" method="get">
	                 <div class="md-form">             
		                  <i class="fas grey-text d-flex"></i>              
		                  <input type="text" id="nombre" name="nombre" class="form-control" required>
		                  <label for="Nombre" class="d-flex">Nombre</label>
		             </div>
		             <div class="md-form">             
		                  <i class="fas grey-text d-flex"></i>              
		                  <input type="text" id="apellido" name="apellido" class="form-control" required>
		                  <label for="Apellido" class="d-flex">Apellido/s</label>
		             </div>
		             <div class="md-form">             
		                  <i class="fas grey-text d-flex"></i>              
		                  <input type="text" id="email" name="email" class="form-control" required>
		                  <label for="email" class="d-flex">Su email</label>
		             </div>
		             <div class="md-form">             
		                  <i class="fas grey-text d-flex"></i>              
		                  <input type="text" id="telefono" name="telefono" class="form-control" required>
		                  <label for="Telefono" class="d-flex">Teléfono de contacto</label>
		             </div>
		             <div class="md-form">
	                  <i class="fas grey-text d-flex"></i>                 
	                  <input type="password" id="password" name="password" class="form-control" required>
	                  <label for="pass" class="d-flex">Escriba una contraseña</label>
	                </div>
		             <div class="md-form">             
		                  <i class="fas grey-text d-flex"></i>              
		                  <input type="text" id="ciudad" name="ciudad" class="form-control" required>
		                  <label for="Ciudad" class="d-flex">Ciudad de residencia</label>
		             </div>
	                <div class="md-form">             
	                  <i class="fas grey-text d-flex"></i>              
	                  <input type="text" id="direccion" name="direccion" class="form-control" required>
	                  <label for="Direccion" class="d-flex">Su dirección</label>
	                </div>
	                <div class="md-form">             
	                  <i class="fas grey-text d-flex"></i>              
	                  <input type="text" id="CP" name="CP" class="form-control" required>
	                  <label for="CP" class="d-flex">Código postal</label>
	                </div>
	                <div class="md-form">             
	                  <i class="fas grey-text d-flex"></i>
	                  <input type="hidden" id="userType_Id" name="userType_Id" class="form-control" placeholder="2">
	                </div>
	               
	
					<!-- Footer -->
	                <div class="d-flex justify-content-between">
	                  <!-- Triggering button -->
	                  <a class="rotate-btn text-primary" tabindex="-3" data-card="my-card">iniciar sesión</a>
	                </div>
	                <div class="text-center">
		                <button id="submit" name="submit" onclick="cerrar()" class="btn primary-color white-text btn-lg">Crear cuenta</button>
		            </div>
	            </form>               
                <!-- FIN.Formulario de Registro-->

              </div>
            </div>
            <!-- Fin.Cara Creación Usuario-->

          </div>
        </div>
        <!-- Fin.Tarjeta Rotatoria -->
     
      </div>
    </div>
  </div>
</div>

	<script>
		//Aviso de que se ha enviado el formulario 
		function cerrar() {
			$("body").html(
				'<div align="center"><img title="Suscripción Realizada" src="content/Images/Varios/muneco-ok.jpg" alt="Proceso correcto" width="400" height="300"></div>');
		}
	</script>
	<script src="bootstrap/js/compiled-4.8.1.min.js"></script>
</body>
</html>

