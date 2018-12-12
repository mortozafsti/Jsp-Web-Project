<%-- 
    Document   : insert
    Created on : Dec 12, 2018, 8:55:09 AM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="insertdb.jsp" method="post">
            <table border="0" cellspacing="2" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Purchase Product</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label>Product Name</label></td>
                        <td><input type="text" name="pname"/></td>
                    </tr>
                    <tr>
                        <td><label>Quantity</label></td>
                        <td><input type="text" name="pqty"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Save"/></td>
                        <td><input type="reset" value="Reset"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
        <a href="index.jsp">Go Home</a>
        <font color="red"><c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
            <a href="index.jsp">Go Back</a>
        </c:if>           
        </font>
        <font color="green"><c:if test="${not empty param.susMsg}">
            <c:out value="${param.susMsg}"/>
            <a href="index.jsp">Go Back</a>
        </c:if>           
        </font>
    </center>
</body>
</html>
