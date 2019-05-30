<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<!-- BARRA LAYOUT -->
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="margin-bottom:15px;">
    <a class="navbar-brand" href="#">Electo S&A</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
            <a class="nav-link" href="/web/">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="Producto">Productos</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="User">Usuarios</a>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Dropdown
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Something else here</a>
            </div>
        </li>
        <li class="nav-item">
            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>
        <li class="nav-item dropdown" style="float:right;">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Usuarios
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">Register/Login</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Exit</a>
                </div>
            </li>
            </ul>
<img src="content/Icons/glyph/svg/si-glyph-person-people.svg" height="20" width="20"/>
<!-- CARRITO -->
<button type="button" class="btn btn-sm" data-toggle="modal" data-target="#myModalCarrito">
	<img src="content/Icons/glyph/svg/si-glyph-basket.svg" height="20" width="20"/>
</button>
<button type="button" class="btn btn-sm" data-toggle="tooltip" title="Documentacion!">
	<img src="content/Icons/glyph/svg/si-glyph-document.svg" height="20" width="20"/>
</button>
        </div>
    </nav>