<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 06.03.19
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usun zuzycie</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
        Potwierdzasz usuniecie zuzycia ${consumption.name} ${consumption.value}?
        <a href="/consumption/delete/${consumption.id}"> Tak </a>
        <a href="/consumption/all_Consumptions"> Nie </a>
</body>
</html>
