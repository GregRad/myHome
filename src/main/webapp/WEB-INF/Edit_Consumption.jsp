<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 29.01.19
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="editConsumption">
    <form:input path="name" placeholder="Nazwa"/>
    <form:input path="value" placeholder="Wartosc"/>
    <input type="submit" value="Zapisz">
</form:form>
</body>
</html>
