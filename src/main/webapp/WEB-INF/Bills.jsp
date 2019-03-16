<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 28.01.19
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Rachunki</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
Wszystkie rachunki
<br>
<br>
<table border="2px">
    <tr>
        <th>
            Nazwa
        </th>
        <th>
            Naleznosc
        </th>
        <th>
            Data platnosci
        </th>
        <th>
            Edytuj
        </th>
        <th>
            Usun
        </th>
    </tr>
    <tr>
   <c:forEach items="${bills}" var="bill">
       <td>
           ${bill.name}
       </td>
        <td>
            ${bill.value} zl
        </td>
        <td>
            ${bill.paymentDate}
        </td>
        <td>
            <a href="/bills/edit/${bill.id}"> edytuj </a>
        </td>
        <td>
            <a href="/bills/confirm/delete_bill/${bill.id}"> usun </a>
        </td>
    </tr>
</c:forEach>
</table>

<br>
<table border="2px">
    <tr>
    <th>
        Suma w miesiacu
    </th>
    </tr>
    <tr>
        <td>
            <c:forEach items="${bills}" var="bill">
               <c:set var="total" value="${total + bill.value}"></c:set>
            </c:forEach>
            Suma: ${total} zl
        </td>
    </tr>
</table>
<a href="/"> Strona domowa</a>
</body>
</html>
