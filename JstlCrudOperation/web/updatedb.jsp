<%-- 
    Document   : updatedb
    Created on : Dec 12, 2018, 11:46:41 AM
    Author     : User
--%>

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
        <sql:update dataSource="${dbsource}" var="count">
            UPDATE product SET pname=?,pqty=? where id ='${param.id}'
            <sql:param value="${param.pname}"/>
            <sql:param value="${param.pqty}"/>
        </sql:update>
    <c:if test="${count>=1}">
        <font size="5" color='green'> Congratulations ! Data updated
        successfully.</font>
        <a href="index.jsp">Go Home</a>          
    </c:if>
</body>
</html>
