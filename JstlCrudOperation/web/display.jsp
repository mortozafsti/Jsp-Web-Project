<%-- 
    Document   : display
    Created on : Dec 12, 2018, 10:16:14 AM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Operation Page</title>
        <script>
            function goConfirm(m, u) {
                if (goConfirm(m)) {
                    window.location = u;
                }
            }
        </script>
    </head>
    <body>
    <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                       url="jdbc:mysql://localhost/jstlcrud" user="root" password="1234"/>
    <sql:query dataSource="${dbsource}" var="result">
        SELECT * FROM product;
    </sql:query>

    <center>
        <form>
            <table border="1" width="40%">
                <caption>Product List</caption>
                <tr>
                    <th>Product Id</th>
                    <th>Product Name</th>
                    <th>Quantity</th>
                    <th colspan="2">Action</th>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                        <td><c:out value="${row.id}"/></td>
                        <td><c:out value="${row.pname}"/></td>
                        <td><c:out value="${row.pqty}"/></td>
                        <td><a href="update.jsp?id=<c:out value="${row.id}"/>">Update</a></td>
                        <td><a href="javascript:goConfirm('Sure to delete this record?' ,'deletedb.jsp?id=<c:out value="${row.id}"/>')">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </form>
        <a href="index.jsp">Go Home</a>
    </center>
</body>
</html>
