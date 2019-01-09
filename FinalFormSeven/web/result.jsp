<%-- 
    Document   : result
    Created on : Jan 9, 2019, 11:38:27 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <f:view>
        <h:form>
            <table>
                <tr>
                    <td>Id:</td>
                    <td><h:outputText value="#{studentCon.student.id}"/></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><h:outputText value="#{studentCon.student.name}"/></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><h:outputText value="#{studentCon.student.age}"/></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><h:outputText value="#{studentCon.student.gender}"/></td>
                </tr>
                <tr>
                    <td>Course:</td>
                    <td><h:outputText value="#{studentCon.student.course}"/></td>
                </tr>
                <tr>
                    <td>Round:</td>
                    <td><h:outputText value="#{studentCon.student.round}"/></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><h:outputText value="#{studentCon.student.email}"/></td>
                </tr>
            </table>
        </h:form>
        </f:view>
    </body>
</html>
