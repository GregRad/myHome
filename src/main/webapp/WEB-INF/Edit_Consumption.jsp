<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 29.01.19
  Time: 22:17
  To change this tempate use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<form:form method="post" modelAttribute="editConsumption">
    <form:input path="unit" placeholder="Nazwa"/>
    <form:input path="value" placeholder="Wartosc"/>
    <form:input path="date" placeholder="Data (wzór: DD/MM/YYYY)"/><br/>
    <form:select path="type" items="${editType}">
    </form:select>
    <input type="submit" value="Zapisz">
</form:form>
</body>
</html>
