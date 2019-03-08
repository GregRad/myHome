<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Usun rachunek</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
        Potwierdzasz usuniecie rachunku ${bill.name} ${bill.value} ?
        <a href="/bills/delete/${bill.id}"> Tak </a>
        <a href="/bills/all_Bills" > Nie </a>

</body>
</html>
