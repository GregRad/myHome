<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 22.03.19
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<table border="2">
    <tr>
        <th>
            Gospodarcze
        </th>
    </tr>
    <tr>
    <c:forEach items="${G}" var="gosp">
        <td>
        ${gosp.price}
        </td>
    </tr>
      </c:forEach>
</table>
<br>
<table border="2">
    <tr>
        <th>
            Spozywcze
        </th>
    </tr>
    <tr>
        <c:forEach items="${S}" var="spoz">
        <td>
            ${spoz.price}
        </td>
    </tr>
        </c:forEach>
</table>


</body>
</html>
