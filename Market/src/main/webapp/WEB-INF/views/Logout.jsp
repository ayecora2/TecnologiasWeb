<%@page import="Market_DA.UserDA"%>
<%@page import="Market_DO.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<?xml version "1.0"?>
    

<%
session.setAttribute("userName", null);
session.invalidate();
response.sendRedirect("/web");
%>