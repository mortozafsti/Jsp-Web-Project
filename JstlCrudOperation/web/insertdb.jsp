<%-- 
    Document   : insertdb
    Created on : Dec 12, 2018, 9:48:17 AM
    Author     : User
--%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Operation</title>
    </head>
    <body>
        <c:if test="${empty param.pname or empty param.pqty}">
            <c:redirect url="insert.jsp">
                <c:param name="errMsg" value="Enter the Name And qty"/>
            </c:redirect>
        </c:if>
        <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost/jstlcrud" user="root" password="1234"/>
        <sql:update dataSource="${dbsource}" var="result">
            INSERT INTO product(pname, pqty)values(?,?);
            <sql:param value="${param.pname}"/>
            <sql:param value="${param.pqty}"/>
        </sql:update>
            <c:if test="${result>=1}">
                <font size="5" color="green">
                    Congratulation ! Data Inserted Successfully
                </font>
                <c:redirect url="insert.jsp">
                    <c:param name="susMsg" value="Thanks Data Inserted"/>
                </c:redirect>
            </c:if>
    </body>
</html>
