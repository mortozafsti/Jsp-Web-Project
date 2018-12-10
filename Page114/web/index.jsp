<%-- 
    Document   : index
    Created on : Dec 10, 2018, 11:12:02 AM
    Author     : User
--%>


<%@page import="Persons.Address"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="person" class="Persons.Person" scope="request">
    <jsp:setProperty name="person" property="*"/>
</jsp:useBean>
<jsp:useBean id="address" class="Persons.Address" scope="request">
    <jsp:setProperty name="address" property="*"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
        <h1>This is Form</h1>
        <table border="1">
            <tr>
                <td>${person.name}</td>
                <td>${person.email}</td>
                <td> ${person.age}</td>
                <td> ${address.line}</td>
                <td> ${address.city}</td>
                <td> ${address.country}</td>
                <td>&nbsp;</td>
            </tr>

            <tr>
            <form action="index.jsp" method="post">
                <td><input type="text" name="name"/></td>
                <td><input type="text" name="email"/></td>
                <td><input type="number" name="age"/></td>
                <td><input type="text" name="line"/></td>
                <td><input type="text" name="city"/></td>
                <td><input type="text" name="country"/></td>
                <td><input type="submit" value="Send"/></td>
                
            </form>
        </tr>
    </table>
</body>
</html>
