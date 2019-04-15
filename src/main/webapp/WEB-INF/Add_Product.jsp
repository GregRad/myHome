<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 04.03.19
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj produkt</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    Nowy produkt:
<form:form method="post" modelAttribute="productForm">
    <form:input path="name" placeholder="Nazwa"/>
    <form:input path="price" placeholder="Cena"/>
    <form:input path="date" placeholder="Data (wzór: DD/MM/YYYY)"/><br/>
    <form:select path="category" items="${category}">
    </form:select>
    <input type="submit" value="Zapisz">
</form:form>
<br>
  <a href="/"> Strona domowa</a>
</body>
</html>
