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
                Name:<h:outputText value="#{studentCon.students.name}"/><br>
                Email:<h:outputText value="#{studentCon.students.email}"/><br>
                Age:<h:outputText value="#{studentCon.students.age}"/><br>                            
                Gender:<h:outputText value="#{studentCon.students.gender}"/><br>                            
                Round:<h:outputText value="#{studentCon.students.round}"/><br>                            
            </h:form>
        </body>
    </f:view>
</html>
