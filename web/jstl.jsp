<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/26
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="num" value="{1,2,3}"/>

<c:forEach var="a" items="num">
    ${a}
</c:forEach>
</body>
</html>
