<%-- 
    Document   : core_remove
    Created on : Dec 12, 2018, 12:24:50 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World Remove</h1>
        <c:if test="${param.expert != null}">
            <c:remove var="level" scope="session"/>
        </c:if>
        Your level is : <c:out value="${level}" default="Expert"/>
        <c:choose>
            <c:when test="${level != null}">
                <p/> Here the things you need to do...
            </c:when>
            <c:otherwise>
                <p/> You are the Excpert...
            </c:otherwise>
        </c:choose>
    </body>
</html>
