<%-- 
    Document   : showdata
    Created on : Dec 10, 2018, 11:58:57 AM
    Author     : User
--%>
<jsp:useBean id="person" class="Persons.Person" scope="request">
    <jsp:setProperty name="person" property="*"/>


</jsp:useBean>
<jsp:useBean id="address" class="Persons.Address" scope="request">
    <jsp:setProperty name="address" property="*"/>


</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Page</title>
    </head>
    <style>
        body,td{ 
            font-family: verdana;
            font-size: 20pt;
        }
    </style>
    <body>
        <h1>Show the Data</h1>

        <table border="1">
            <tr>
                <td>Name:${person.name}</td>
            </tr>
            <tr>
                <td>Email:${person.email}</td>
            </tr>
            <tr>
                <td>Age:${person.age} </td>
            </tr>
            <tr>
                <td>Line:${address.line} </td>
            </tr>
            <tr>
                <td>City:${address.city}</td>
            </tr>
            <tr>
                <td>City:${address.country}</td>
            </tr>
        </table>
    </body>
</html>
