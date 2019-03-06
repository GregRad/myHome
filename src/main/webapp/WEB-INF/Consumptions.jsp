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
    <title>Title</title>
</head>
<body>
    <table border="2px">
        <tr>
            <th>
                Nazwa
            </th>
            <th>
                Wartosc
            </th>
            <th>
                Edytuj
            </th>
            <th>
                Usun
            </th>
        </tr>
        <tr>
            <c:forEach items="${consumptions}" var="consumption">
            <td>
               ${consumption.name}
            </td>
            <td>
                ${consumption.value}
            </td>
            <td>
                <a href="/consumption/edit/${consumption.id}"> edytuj </a>
            </td>
            <td>
                <a href="/confirm/delete_consumption/${consumption.id}"> usun</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
