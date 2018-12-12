<%-- 
    Document   : update
    Created on : Dec 12, 2018, 11:35:50 AM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                       url="jdbc:mysql://localhost/jstlcrud" user="root" password="1234"/>
    <sql:query dataSource="${dbsource}" var="result">
        SELECT * FROM product where id = ?;
        <sql:param value="${param.id}"/>
    </sql:query>
        <form action="updatedb.jsp" method="post">
            <table border="0" width="40%">
                <caption>Update Product</caption>
                <tr>
                    <th>Product Name</th>
                    <th>Quantity</th>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                        <td><input type="hidden" value="${param.id}" name="id"/>
                            <input type="text" value="${param.pname}" name="id"/>
                        </td>
                        <td><input type="text" value="${param.pqty}" name="id"/></td>
                        <td><input type="submit" value="Update"/></td>
                    </tr>
                </c:forEach>
            </table>
            <a href="index.jsp">Go Home</a>
        </form>
    </body>
</html>
