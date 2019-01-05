<%-- 
    Document   : login
    Created on : Jan 5, 2019, 9:53:20 AM
    Author     : Cf-37
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
            <h1>This Login Page</h1>
            <form action="loginAuth.jsp" method="post">
                UserName:<input type="text" name="username"/><br/>
                PassWord:<input type="text" name="password"/><br/>
                <input type="submit" value="Login"/><br/>
            </form>
            <font color="red">
            <c:if test="${ not empty param.errMsg}">
                <c:out value="${param.errMsg}">
                    
                </c:out>
            </c:if>
            </font>
        </div>
        
    </body>
</html>