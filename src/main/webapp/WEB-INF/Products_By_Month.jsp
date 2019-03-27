<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 21.03.19
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<br>
<br>
    <table border="2px">
            <tr>
                <th>
                    Nazwa
                </th>
                <th>
                    Wartość
                </th>
                <th>
                    Data
                </th>
                <th>
                    Kategoria
                </th>
                <th>
                    Edytuj
                </th>
                <th>
                    Usuń
                </th>
            </tr>
            <tr>
                <c:forEach items="${productsByDate}" var="products">
                <td>
                        ${products.name}
                </td>
                <td>
                        ${products.price}
                </td>
                <td>
                        ${products.date}
                </td>
                <td>
                        ${products.category}
                </td>
                <td>
                    <a href="/products/edit/${products.id}"> Edytuj </a>
                </td>
                <td>
                    <a href="/products/confirm/${products.id}"> Usuń</a>
                </td>
                </c:forEach>
            </tr>
            
    </table>
    <br>
    <br>
    <table border="2px">
     <tr>
        <th>
            Suma spozywczych
        </th>
        <th>
            Suma gospodarczych
        </th>
        <th>
            Suma kosztow
        </th>
    </tr>
    <tr>
        <td>
        ...
        </td>
        <td>
            <c:forEach items="${productsByCategory}" var="product">
                <c:set var="totalByCategory" value="${productsByCategory + product.price}">
                </c:set>
            </c:forEach>
            ${totalHouseholds} zl
        </td>
        <td>
            <c:forEach items="${productsByDate}" var="products">
                <c:set var="total" value="${total + products.price}">
                </c:set>
            </c:forEach>
            ${total} zl
        </td>
    </tr>
    </table>
        <br>
        <a href="/"> Strona domowa</a>
        <br>
        <a href="/products/list">Cofnij</a>
</body>
</html>
