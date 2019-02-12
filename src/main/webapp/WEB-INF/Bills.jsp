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
    <title>Title</title>
</head>
<body>
Rachunki
<table border="2px">
    <tr>
        <th>
            Nazwa
        </th>
        <th>
            Wartosc
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
            ${bill.value}
        </td>
        <td>
            ${bill.paymentDate}
        </td>
        <td>
            <a href="/bills/edit/${bill.id}"> edytuj </a>
        </td>
        <td>
            <a href="/bills/delete/${bill.id}"> usun </a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
