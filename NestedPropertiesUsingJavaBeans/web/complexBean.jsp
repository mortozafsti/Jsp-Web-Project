<%-- 
    Document   : complexBean
    Created on : Dec 11, 2018, 9:47:10 AM
    Author     : User
--%>

<%@page import="JavaClase.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="person" class="JavaClase.Person" scope="request">
    <jsp:setProperty name="person" property="*"/>
</jsp:useBean>
<jsp:useBean id="address" class="JavaClase.Address" scope="request">
    <jsp:setProperty name="address" property="*"/>
</jsp:useBean>
<jsp:useBean id="pnumber" class="JavaClase.PhoneNumber" scope="request">
    <jsp:setProperty name="pnumber" property="*"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EL and Complex JavaBean</h1>
        
        <table border="1">
            <tr>
                <td>${person.name}</td>
                <td>${person.age}</td>
                <td>${person["address"].line}</td>
                <td>${person["address"].city}</td>
                <td>${person["address"].country}</td>
                <td>${person["address"].postCode}</td>
                <td>${person.address.phoneNumber[0].std}
                    ${person.address.phoneNumber[0].number}
                </td>
                <td>${person.address.phoneNumber[1].std}
                    ${person.address.phoneNumber[1].number}
                </td>
            </tr>
        </table>
    </body>
</html>
