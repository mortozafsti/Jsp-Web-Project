<%-- 
    Document   : stuForms
    Created on : Dec 17, 2018, 12:21:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE html>
<html>
    <f:view>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <h1>Hello World!</h1>
        <h:form>
            <table>
                <tr>
                    <td>Name:</td>
                    <td><h:inputText value="#{studentCon.students.name}"/></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><h:inputText value="#{studentCon.students.email}"/></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><h:inputText value="#{studentCon.students.age}"/></td>
                </tr>
            </table> 
        </h:form>
            <h:commandButton value="Send" action="submit"/>
    </body>
</f:view>
</html>
