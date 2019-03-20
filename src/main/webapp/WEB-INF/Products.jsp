<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 28.01.19
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Zakupy</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    Podsumowanie zakupów
    <br>
    <br>
    <div>
        <a href="/"> Styczen</a>
        <a href="/"> Luty</a>
        <a href="/"> Marzec</a>
        <a href="/"> Kwiecień</a>
        <a href="/"> Maj</a>
        <a href="/"> Czerwiec</a>
        <a href="/"> Lipiec</a>
        <a href="/"> Sierpień</a>
        <a href="/"> Wrzesień</a>
        <a href="/"> Październik</a>
        <a href="/"> Listopad</a>
        <a href="/"> Grudzień</a>
    </div>
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
            <c:forEach items="${allProducts}" var="products">
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
        </tr>

</c:forEach>
    </table>
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

            </td>
            <td>
                <c:forEach items="${productsByCategory}" var="product">
                    <c:set var="totalByCategory" value="${productsByCategory + product.price}">
                    </c:set>
                </c:forEach>
                ${totalHouseholds} zl
            </td>
            <td>
                <c:forEach items="${allProducts}" var="products">
                    <c:set var="total" value="${total + products.price}">
                    </c:set>
                </c:forEach>
                ${total} zl
            </td>
        </tr>
    </table>
    <br>
    <a href="/"> Strona domowa</a>
</body>
</html>
