<%-- 
    Document   : login
    Created on : Jan 7, 2019, 12:09:05 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .mm{ text-align: center; }
        </style>
    </head>
    <body>
        <div class="mm">
            <h1>This is Login Page</h1>
            <form action="loginAuth.jsp" method="post">
                UserName:<input type="text" name="username"/><br/>
                PassWord:<input type="password" name="password"/><br/>
                <input type="submit" value="Login"/><br/>
            </form>
            <font color="red">
            <c:if test="${not empty param.errMsg}">
                <c:out value="${param.errMsg}"/>
            </c:if>
            </font>
        </div>
    </body>
</html>
