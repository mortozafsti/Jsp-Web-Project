<%-- 
    Document   : stu
    Created on : Dec 17, 2018, 9:14:05 AM
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
            <h:inputText value="#{stud.stu.name}" size="35"/>

            <h:inputText value="#{stud.stu.email}" size="35"/>

            <h:commandButton value="Search" action="submit"/>
        </h:form>
    </body>
    </f:view>
</html>
