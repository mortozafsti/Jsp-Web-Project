<%-- 
    Document   : StudentForm
    Created on : Dec 15, 2018, 10:42:35 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
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
        
                <h:outputText value="#{stud.stu.name}"/>
        
            <h:outputText value="#{stud.stu.email}"/>
            
<!--            <tr>
                <td></td>
                <td><input type="submit" value="Submit"/></td>
            </tr>-->
    
             
    </h:form>

    </body>
        </f:view>
</html>
