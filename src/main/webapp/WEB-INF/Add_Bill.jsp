<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 06.02.19
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dodaj rachunek</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    Nowy rachunek:
    <form:form method="post" modelAttribute="bill">
    <form:input path="name" placeholder="Nazwa"/>
    <form:input path="value" placeholder="Wartość"/>
    <form:input path="paymentDate" placeholder="Termin płatności"/>
    <input type="submit" value="Zapisz">
</form:form>
<br>
  <a href="/"> Strona domowa</a>
</body>
</html>
