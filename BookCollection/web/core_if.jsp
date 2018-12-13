<%-- 
    Document   : core_if
    Created on : Dec 13, 2018, 9:53:55 AM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.awt.print.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <jsp:useBean id="cal" class="calenderBeans.CalBean" />
            
        The time is Currently: <br><br>
        <c:out value="${cal.time}" />
        <c:set var="hour" value="${cal.hour}" scope="session" />
        <br>
        <c:if test="${hour >= 0 && hour <= 11}">
        Good Morning!
        </c:if>
        <c:if test="${hour >= 18 && hour <= 23}">
        Good Evening!
        </c:if>
        <br>
    </body>
</html>
