<%-- 
    Document   : showdata
    Created on : Dec 10, 2018, 11:58:57 AM
    Author     : User
--%>
<jsp:useBean id="person" class="Persons.Person" scope="request">
    <jsp:setProperty name="person" property="*"/>


</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Page</title>
    </head>
    <body>
        <h1>Show the Data</h1>
        ${person.name}
        ${person.email}
        ${person.age}   
    </body>
</html>
