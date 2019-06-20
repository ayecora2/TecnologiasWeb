<%@page import="Market_DA.UserDA"%>
<%@page import="Market_DO.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<?xml version "1.0"?>

<!-- File: loginResponse.jsp -->
<jsp:useBean id="loginBean" class="Market_DO.Login" scope="request"/>
    
    <%
		String[] respuesta = UserDA.loginUser(loginBean);
    if (respuesta!=null) {
        session.setAttribute("User", respuesta[0]);
        session.setAttribute("Role", respuesta[1]);
        out.println("<script> alert('Bienvenido/a " + respuesta[0] + " '); </script>");
        out.println("<div align=" + "center" + ">");
        out.println("<h2><b>Ha iniciado sesión correctamente.</b></h2><br><br>");
        out.println("<img src=" + "content/Images/Varios/acceso-ok.png" + " style=" + "width:auto;height:auto;" + ">");
        out.println("</div>");     
    } else {
    	out.println("<script> alert('Usuario y/o contraseña inválido'); </script>");
    	session.setAttribute("userName", null);
    	session.invalidate();
    	out.println("<div align=" + "center" + ">");
        out.println("<h2><b>Usuario o clave erronea, intentelo de nuevo.</b></h2><br><br>");
    	out.println("<img src=" + "content/Images/Varios/user-no-encontrado.jpg" + " style=" + "width:auto;height:auto;" + ">");
        out.println("</div>");     
    }
	%>
	