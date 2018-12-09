<%-- 
    Document   : cart
    Created on : Dec 10, 2018, 12:17:03 AM
    Author     : Cf-37
--%>

<%@page import="JavaClasses.Products"%>
<%@page import="JavaClasses.Cart"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%Iterator item = ((Cart) session.getAttribute("cart")).getItems();%>
        <h1>Current Cart Contents:</h1>
        <table>
            <%while (item.hasNext()) {%>
            <tr>
                <%Products p = (Products) item.next();%>
                <td><%=p.getName() %></td>
                <td><%=p.getPrice()%></td>
            </tr>
                }
                <%}%>
        </table>
    </body>
</html>
