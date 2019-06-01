<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Alta de Usuario</title>
<script src="bootstrap/js/jquery-3.3.1.slim.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<spring:url value="bootstrap/css/bootstrap.min.css" var="MyBootstrap" />
</head>
<body>
	<div>
		<jsp:include page="templates/_NavBarView.jsp" />
		<form class="form-horizontal" action="UserCreateRequest" method="get">
			<fieldset>

				<!-- Form Name -->
				<legend>Form Name</legend>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Nombre">Nombre</label>
					<div class="col-md-4">
						<input id="nombre" name="nombre" type="text" placeholder=""
							class="form-control input-md" required="">

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Apellido">Apellido</label>
					<div class="col-md-4">
						<input id="apellido" name="apellido" type="text" placeholder=""
							class="form-control input-md" required="">

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="email">E-Mail</label>
					<div class="col-md-4">
						<input id="email" name="email" type="text" placeholder=""
							class="form-control input-md" required="">

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Telefono">Teléfono</label>
					<div class="col-md-4">
						<input id="telefono" name="telefono" type="text" placeholder=""
							class="form-control input-md" required="">

					</div>
				</div>

				<!-- Password input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="pass">Password</label>
					<div class="col-md-4">
						<input id="pass" name="pass" type="password" placeholder=""
							class="form-control input-md" required="">

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Ciudad">Ciudad</label>
					<div class="col-md-4">
						<input id="ciudad" name="ciudad" type="text" placeholder=""
							class="form-control input-md" required="">

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Direccion">Direccion</label>
					<div class="col-md-4">
						<input id="direccion" name="direccion" type="text" placeholder=""
							class="form-control input-md">

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="CP">Código
						Postal</label>
					<div class="col-md-4">
						<input id="CP" name="CP" type="text" placeholder=""
							class="form-control input-md" required="">

					</div>
				</div>
				<input id="userType_Id" name="userType_Id" type="hidden" placeholder="2">

				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">
						<button id="submit" name="submit" class="btn btn-default">Enviar</button>
					</div>
				</div>

			</fieldset>
		</form>

		<jsp:include page="templates/_Footer.jsp" />

		<%
			String policyNumber = request.getParameter("policyNumber");
			String claimValue = request.getParameter("claim");
			String claimType = request.getParameter("type");
			String description = request.getParameter("description");
		%>
	</div>
</body>
</html>