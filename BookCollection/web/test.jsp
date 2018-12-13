<%-- 
    Document   : test
    Created on : Dec 13, 2018, 9:10:23 AM
    Author     : User
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:out value="Congratulation, Jstl is Working" /><br>
        <c:out value="Good Morning" />
        <c:out value="${book.author.name}"  default="Unkonown"/><br>
        
        <c:catch var="exception">
            <fmt:parseDate var="dob" value="${param.birtDate}" pattern="yyyy-MM-dd" />
        </c:catch>
        <c:if test="${exception != null}">
            <jsp:useBean id="dob" class="java.util.Date"/>
        </c:if>
    </body>
</html>
