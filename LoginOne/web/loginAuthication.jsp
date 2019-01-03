<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>GGGGGG</h1>
        <c:if test="${not empty param.uname and not empty param.pass}">
        <s:setDataSource var="gm" driver="com.mysql.jdbc.Driver"
                         url="jdbc:mysql://localhost:3306/jstllogin"
                         user="root" password="1234"/>
        <s:query dataSource="${gm}" var="jj">
            select count(*) as knout from user
            where username = '${param.uname}'
            and password = '${param.pass}'
        </s:query>
        <c:forEach items="${jj.rows}" var="r">
            <c:choose>
                <c:when test="${r.knout gt 0}">
                    <c:set scope="session" value="${param.username}" var="loginUser"/>
                    <c:redirect url="index.jsp"/>
                </c:when>
                <c:otherwise>
                    <c:redirect url="login.jsp"/>
                </c:otherwise>
            </c:choose>
        </c:forEach>

    </c:if>
</body>
</html>
