<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>DBA page</title>
</head>
<body>
    Dear <strong>${user}</strong>, Welcome to DBA Page.
    <form action="<c:url value="/logoutApp"/>" method="post">
    	<button type="submit">Logout</button>
    	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
<%--     <a href="<c:url value="/logoutApp" />">Logout</a> --%>
</body>
</html>