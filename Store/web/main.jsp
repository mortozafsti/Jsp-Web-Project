<%-- 
    Document   : main
    Created on : Dec 9, 2018, 10:29:08 PM
    Author     : Cf-37
--%>

<%@page import="JavaClasses.Products"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.*,servlet.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! MAl</h1>
        <%
            HashMap products = (HashMap) application.getAttribute("products");

            Iterator it = products.values().iterator();
            out.println("<table>");
            while (it.hasNext()) {
                out.println("<tr>");
                Products product = (Products) it.next();
            }
        %>
    <td>
        <a href='CartAction?add=true&id=<%=roduct.getId()%>'>
            <%=product.getName%>
        </a>
    </td>
    <td>
        <%=product.getPrice()%>
    </td>
</tr>

</table>
</body>
</html>
