<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 29.01.19
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<form:form method="post" modelAttribute="editProduct">
    <form:input path="name" placeholder="Nazwa"/>
    <form:input path="price" placeholder="Cena"/>
    <form:input path="date" placeholder="Data (wzór: DD/MM/YYYY)"/><br/>
    <form:select path="category" items="${editCategory}">
    </form:select>
    <input type="submit" value="Zapisz">
</form:form>
</body>
</html>
