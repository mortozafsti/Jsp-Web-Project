<%-- 
    Document   : index
    Created on : Dec 10, 2018, 10:39:30 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>El And Expresstion Language</h1>
        ${20+20}

        <table>
            <tr>
                <td colspan="2">Hellow  ${param['name']}</td>
            </tr>
            <tr>
            <form action="index.jsp" method="post">
                <td><input type="text" name="name"/></td>
                <td><input type="submit" value="Send"/></td>
            </form>
        </tr>
    </table>
</body>
</html>
