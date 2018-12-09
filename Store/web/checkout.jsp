<%-- 
    Document   : checkout
    Created on : Dec 10, 2018, 12:06:12 AM
    Author     : Cf-37
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:include page="cart.jsp"/>
        <br>Please Click Confirm to Check out<br>
        <form action="ConfirmAction">
            <input type="submit" value="Confirm"/>
        </form>
    </body>
</html>
