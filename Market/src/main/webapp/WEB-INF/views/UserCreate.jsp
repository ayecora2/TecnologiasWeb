<!DOCTYPE html><html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login&lt;&gt;Registro/Alta</title>
    <style>
        body {
            margin: 0;
            padding: 0;
        }
    </style>
<link rel="stylesheet" type="text/css" href="bootstrap/css/compiled-4.8.1.min.css"><style></style>
</head>

<body>

<div class="mask rgba-black-strong h-100">
  <div class="container py-5">
    <div class="row">
      <div class="col-xl-5 col-lg-6 col-md-10 col-sm-12 mx-auto">

        
        <!-- Tarjeta rotatoria -->
        <div class="card-wrapper">
          <div id="my-card" class="card card-rotating text-center">

            <!-- Cara Frontal -->
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
            <!-- FIN.Cara Frontal -->

            <!-- Cara Reverso -->
            <div class="face back">
              <div class="card-body">

                <!-- Header -->
                <div class="form-header primary-color">
                  <h3 class="font-weight-500 my-2 py-1"><i class="fas">
                		  <img src="content/Icons/glyph/svg/si-glyph-baby.svg" height="40" width="40" />
                	  </i> Crear Nueva Cuenta</h3>
                </div>
                 
                <!-- Formulario de Registro-->
                <div class="md-form">             
                  <i class="fas grey-text d-flex"></i>              
                  <input type="text" id="email" name="email" class="form-control">
                  <label for="email" class="d-flex">Su email</label>
                </div>
                <div class="md-form">
                  <i class="fas grey-text d-flex"></i>                 
                  <input type="password" id="password" name="password" class="form-control">
                  <label for="password" class="d-flex">Su clave</label>
                </div>

				<!-- Footer -->
                <div class="d-flex justify-content-between">
                  <!-- Triggering button -->
                  <a class="rotate-btn text-primary" tabindex="-3" data-card="my-card">iniciar sesión</a>
                </div>
                <div class="text-center">
	                <button class="btn primary-color white-text btn-lg">Crear cuenta</button>
	            </div>               
                <!-- FIN.Formulario de Registro-->

              </div>
            </div>
            <!-- Fin.Cara Reverso -->

          </div>
        </div>
        <!-- Fin.Tarjeta Rotatoria -->
     
      </div>
    </div>
  </div>
</div><script src="bootstrap/js/compiled-4.8.1.min.js"></script><script></script></body></html>