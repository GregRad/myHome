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
    <title>Usuniecie produktu</title>
</head>
<body>
        Potwierdzasz usuniecie produktu ${product.name} ${product.price} ?
        <a href="/products/delete/${product.id}" > Tak </a>
        <a href="/products/all_Products" > Nie </a>

</body>
</html>
