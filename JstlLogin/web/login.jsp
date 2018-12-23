<%-- 
    Document   : login
    Created on : Dec 23, 2018, 12:27:29 PM
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
            .mm{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="mm">
            <h1>Please Login</h1>
            <form action="loginAuth.jsp">
                UserName:<input type="text" name="username"/><br/>
                PassWord:<input type="password" name="password"/><br/>
                <input type="submit" value="Login"/>
            </form>
            <font color="red">
            <c:if test="${not empty param.errMsg}">
                <c:out value="${param.errMsg}"/>
            </c:if>
            </font>
        </div>

    </body>
</html>
