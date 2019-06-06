<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- File: loginrequest.jsp -->

<jsp:useBean id="loginBean" class="Market_DO.Login" scope="request"/>

<jsp:setProperty name="loginBean" property="*" />

<jsp:forward page="loginResponse.jsp" />