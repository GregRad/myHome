<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 29.01.19
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj zuzycie</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    Nowe zuzycie:
    <form:form method="post" modelAttribute="consumptionForm">
    <form:input path="name" placeholder="Nazwa"/>
    <form:input path="value" placeholder="Wartosc"/>
    <input type="submit" value="Zapisz">
    </form:form>
</body>
</html>
