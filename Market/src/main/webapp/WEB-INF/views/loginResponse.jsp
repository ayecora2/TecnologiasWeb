<%@page import="Market_DA.UserDA"%>
<%@page import="Market_DO.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<?xml version "1.0"?>
<!-- File: loginResponse.jsp -->
<jsp:useBean id="loginBean" class="Market_DO.Login" scope="request"/>
    
    
    <%
		String[] respuesta = UserDA.loginUser(loginBean);
    if (respuesta!=null) {
        session.setAttribute("User", respuesta[0]);
        session.setAttribute("Role", respuesta[1]);
        response.sendRedirect("/web");
    } else {
    	out.println("<script> alert('Usuario y/o contraseña inválido'); </script>");
        out.println("<a href='/web/UserLogin'><b>Vuelva a intentarlo</b></a>");
    }
	%>
	