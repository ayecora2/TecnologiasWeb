<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!-- File: UserCreateRequest.jsp -->
<jsp:useBean id="userBean" class="Market_DO.User" scope="request"/>

<jsp:setProperty name="userBean" property="*" />

<jsp:forward page="UserCreateResponse.jsp" />