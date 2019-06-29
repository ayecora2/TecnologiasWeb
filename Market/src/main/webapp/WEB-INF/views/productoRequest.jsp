<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!-- File: productoRequest.jsp -->

<jsp:useBean id="productoBean" class="Market_DO.Producto" scope="request"/>

<jsp:setProperty name="productoBean" property="*" />

<jsp:forward page="ProductoView.jsp" />