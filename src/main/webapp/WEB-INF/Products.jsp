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
</head>
<body>
    Lista zakupów
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
                <a href="/products/edit/${products.id}"> Edytuj </a>
            </td>
            <td>
                <a href="/products/delete/${products.id}"> Usuń</a>
            </td>
        </tr>

</c:forEach>
    </table>
</body>
</html>
