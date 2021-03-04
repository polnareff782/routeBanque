<%-- 
    Document   : home
    Created on : 12 févr. 2021, 16:00:52
    Author     : polnareff
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="menuAdmin.jsp" %>
        <h1>Bonjour <span>${user.login}</span> !</h1><br>
    </body>
</html>
