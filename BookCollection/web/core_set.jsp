<%-- 
    Document   : core_set
    Created on : Dec 12, 2018, 12:03:12 PM
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
        <h1>Hello World Header</h1>
        <c:set var="browser" value="${header['User-Agent']}" scope="session"/>
            My Browser Agent is : <c:out value="${browser}"/>
      
    </body>
</html>
