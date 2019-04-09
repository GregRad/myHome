<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Zużycie</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    Zuzycie
    <br>
    <br>
    <table border="2px">
        <tr>
            <th>
                Nazwa
            </th>
            <th>
                Wartosc
            </th>
            <th>
            	Data
            </th>
            <th>
            	Typ
            </th>
            
            <th>
                Edytuj
            </th>
            <th>
                Usun
            </th>
        </tr>
        <c:forEach items="${consumptions}" var="consumption">
        <tr>
            
            <td>
               ${consumption.name}
            </td>
            <td>
                ${consumption.value}
            </td>
            <td>
            	${consumption.date}
            </td>
            <td>
            	${consumption.type}
            </td>
            <td>
                <a href="/consumption/edit/${consumption.id}"> edytuj </a>
            </td>
            <td>
                <a href="/consumption/confirm/delete_consumption/${consumption.id}"> usun</a>
            </td>
            
        </tr>
        </c:forEach>
        
    </table>
    <br>
    <a href="/"> Strona domowa</a>
</body>
</html>
