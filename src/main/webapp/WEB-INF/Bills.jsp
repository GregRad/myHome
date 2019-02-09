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
<table>
    <tr>
        <th>
            Rachunki
        </th>
    </tr>
    <tr>
   <c:forEach items="${bills}" var="bill">
       <td>
           ${bill.name}
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
