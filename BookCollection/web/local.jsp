<%-- 
    Document   : local
    Created on : Dec 13, 2018, 10:48:01 AM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<fmt:setLocale value="en_GB" scope="request"/>
<fmt:setBundle basename="label"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <h2>Survey </h2>
        <form action="">
            <table>
                <tr>
                    <td><fmt:message key="nameQuestion"/></td>
                    <td><input type="text" size="16"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="ageQuestion"/></td>
                    <td><input type="text" size="16"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="locationQuestion"/></td>
                    <td><input type="text" size="16"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value='<fmt:message key="submit"/>'/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
