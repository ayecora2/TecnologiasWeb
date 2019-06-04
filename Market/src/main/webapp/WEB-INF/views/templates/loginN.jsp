<!DOCTYPE html><html lang="en"><head>
    <meta charset="UTF-8">
    <title>Login&lt;&gt;Register - FlipCard</title>
    <style>
        body {
            margin: 0;
            padding: 0;
        }
    </style>
<link rel="stylesheet" type="text/css" href="bootstrap/css/compiled-4.8.1.min.css"><style></style></head>
<body>


<div class="mask rgba-black-strong h-100">
  <div class="container py-5">
    <div class="row">
      <div class="col-xl-5 col-lg-6 col-md-10 col-sm-12 mx-auto">

        
        <!-- Rotating card -->
        <div class="card-wrapper">
          <div id="my-card" class="card card-rotating text-center">

            <!-- Front Side -->
            <div class="face front">
              <div class="card-body">

                <!-- Header -->
                <div class="form-header primary-color">
                  <h3 class="font-weight-500 my-2 py-1"><i class="fas fa-sign-in-alt"></i> Log in</h3>
                </div>

                <!-- Login Form -->
                <div class="md-form">
                  <i class="fas fa-envelope prefix grey-text d-flex"></i>
                  <input type="text" id="email" name="email" class="form-control">
                  <label for="email" class="d-flex">Your email</label>
                </div>

                <div class="md-form">
                  <i class="fas fa-lock prefix grey-text d-flex"></i>
                  <input type="password" id="password" name="password" class="form-control">
                  <label for="password" class="d-flex">Your password</label>
                </div>

                <div class="d-flex justify-content-between">
                  <!-- Triggering button -->
                  <a class="rotate-btn text-primary" tabindex="-1" data-card="my-card">create account</a>
                  <a href="#" class="grey-text" tabindex="-2">forgot password?</a>
                </div>
                <div class="text-center">
                  <button class="btn primary-color white-text btn-lg">Login</button>
                </div>
                <!-- Login Form -->

              </div>
            </div>
            <!-- Front Side -->

            <!-- Back Side -->
            <div class="face back">
              <div class="card-body">

                <!-- Header -->
                <div class="form-header primary-color">
                  <h3 class="font-weight-500 my-2 py-1"><i class="fas fa-plus"></i> Create Account</h3>
                </div>

                <!-- Register Form-->
                <div class="md-form">
                  <i class="fas fa-envelope prefix grey-text d-flex"></i>
                  <input type="text" id="email" name="email" class="form-control">
                  <label for="email" class="d-flex">Your email</label>
                </div>

                <div class="md-form">
                  <i class="fas fa-lock prefix grey-text d-flex"></i>
                  <input type="password" id="password" name="password" class="form-control">
                  <label for="password" class="d-flex">Your password</label>
                </div>
                <div class="md-form">
                  <i class="fas fa-lock prefix grey-text d-flex"></i>
                  <input type="password" id="password2" name="password2" class="form-control">
                  <label for="password2" class="d-flex">Confirm password</label>
                </div>

                <div class="d-flex justify-content-end">
                  <!-- Triggering button -->
                  <a class="rotate-btn text-primary" data-card="my-card" tabindex="-3">back to login</a>
                </div>

                <div class="text-center">
                  <button class="btn primary-color white-text btn-lg">Create account</button>
                </div>
                <!-- Register Form-->

              </div>
            </div>
            <!-- Back Side -->

          </div>
        </div>
        <!-- Rotating card -->

        
      </div>
    </div>
  </div>
</div><script src="bootstrap/js/compiled-4.8.1.min.js"></script><script></script></body></html>