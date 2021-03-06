<%-- 
    Document   : loginAuth
    Created on : Jan 4, 2019, 10:02:32 PM
    Author     : Cf-37
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${empty param.username or empty param.password}">
            <c:redirect url="login.jsp">
                <c:param name="errMsg" value="Please Enter UserName and Password"/>
            </c:redirect>
        </c:if>
        <c:if test="${not empty param.username and not empty param.password}">
            <s:setDataSource var="kk" driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/jstllogin"
                             user="root" password="1234"/>
            <s:query dataSource="${kk}" var="ll">
                select count(*) as knout from user
                where username = '${param.username}'
                and password = '${param.password}'
            </s:query>
            <c:forEach items="${ll.rows}" var="e">
                <c:choose>
                    <c:when test="${e.knout gt 0}">
                        <c:set scope="session" value="${param.username}" var="loginuser"/>
                        <c:redirect url="index.jsp"/>
                    </c:when>
                    <c:otherwise>
                        <c:redirect url="login.jsp">
                            <c:param name="errMsg" value="UserName and Password does nt Mach"/>
                        </c:redirect>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </c:if>
    </body>
</html>
