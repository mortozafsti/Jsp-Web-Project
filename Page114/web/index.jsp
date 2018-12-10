<%-- 
    Document   : index
    Created on : Dec 10, 2018, 11:12:02 AM
    Author     : User
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
        <h1>This is Form</h1>
       
        <form action="showdata.jsp" method="post">
            <input type="text" name="name"/>
            <input type="text" name="email"/>
            <input type="number" name="age"/>
            <input type="submit" value="Send"/>
        </form>
    </body>
</html>
