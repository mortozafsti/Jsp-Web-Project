<%-- 
    Document   : login
    Created on : Jan 3, 2019, 9:28:16 AM
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
        <h1>Please Login</h1>
        <form action="loginAuthication.jsp" method="post">
            UserName:<input type="text" name="uname"/><br/>
            PassWord<input type="password" name="pass"/><br/>
            <input type="submit" value="Login"/>
        </form>
        <font color="red">
        <c:if test="">
            <c:out value="">
                
            </c:out>
        </c:if>
        </font>
    </body>
</html>
