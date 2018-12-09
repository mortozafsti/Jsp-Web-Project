<%-- 
    Document   : index
    Created on : Dec 7, 2018, 11:02:12 PM
    Author     : Cf-37
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
        <h1>This is Index Page</h1>
        <%-- This is Declaration Tag --%>
        <p>The Current Time is <%= new java.util.Date() %> Preciously</p>
        
        <form action="newjsp.jsp">
            First Name<input type="text" name="fname"/><br>
            Last Name<input type="text" name="lname"/><br>
             <input type="submit" value="Send"/>
        </form>
    </body>
</html>
