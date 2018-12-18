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
            <h1>This is Faltu Foem</h1>
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
                <tr>
                    <td>Gender:</td>
                    <td><h:selectOneRadio value="#{studentCon.students.gender}">
                            <f:selectItem itemValue="Male" itemLabel="Male"/>
                            <f:selectItem itemValue="Female" itemLabel="Female"/>
                    </h:selectOneRadio></td>
                </tr>
                <tr>
                    <td>Round</td>
                    <td><h:selectOneMenu value="#{studentCon.students.round}">
                            <f:selectItem itemValue="" itemLabel="Select the Round"/>
                            <f:selectItem itemValue="37" itemLabel="Select -37"/>
                            <f:selectItem itemValue="38" itemLabel="Select -38"/>
                            <f:selectItem itemValue="39" itemLabel="Select -39"/>
                            <f:selectItem itemValue="40" itemLabel="Select -40"/>
                    </h:selectOneMenu></td>
                </tr>
            </table> 
                <h:commandButton value="Send" action="submit"/>
                <h:commandButton value="Reset" action="#{studentCon.reset()}"/>
        </h:form>
            
    </body>
</f:view>
</html>
