<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>AccessDenied page</title>
</head>
<body>
    Dear <strong>${user}</strong>, You are not authorized to access this page
    <form action="/logoutApp" method="post">
    	<button type="submit">Logout</button>
    	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
<%--     <a href="<c:url value="/logoutApp" />">Logout</a> --%>
</body>
</html>