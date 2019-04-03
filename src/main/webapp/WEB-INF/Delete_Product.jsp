<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 06.03.19
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usun produkt</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
        Potwierdzasz usuniecie produktu ${product.name} ${product.price} ?
        <a href="/products/delete/${product.id}" > Tak </a>
        <a href="/products/list" > Nie </a>

</body>
</html>
