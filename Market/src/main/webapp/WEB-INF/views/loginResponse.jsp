<%@page import="Market_DA.UserDA"%>
<%@page import="Market_DO.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<?xml version "1.0"?>
<!-- File: loginResponse.jsp -->
<jsp:useBean id="loginBean" class="Market_DO.Login" scope="request"/>
    
    
    <%
		Boolean respuesta = UserDA.loginUser(loginBean);
    if (respuesta==true) {
        session.setAttribute("User", loginBean.getUser());
        response.sendRedirect("/web");
    } else {
        out.println("Invalid password <a href='/login'>try again</a>");
    }
	%>
	