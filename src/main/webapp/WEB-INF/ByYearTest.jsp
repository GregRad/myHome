<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<table border=2px>
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
 	<c:forEach items="${productsByYear}" var="byYear">
 	         <tr>
                
                <td>
                        ${byYear.name}
                </td>
                <td>
                        ${byYear.price}
                </td>
                <td>
                        ${byYear.date}
                </td>
                <td>
                        ${byYear.category}
                </td>
                <td>
                    <a href="/products/edit/${byYear.id}"> Edytuj </a>
                </td>
                <td>
                    <a href="/products/confirm/${byYear.id}"> Usuń</a>
                </td>
            </tr>
 	</c:forEach>
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
			<c:forEach items="${allGroceries}" var="groceries">
				<c:set var="totalGroceries" value="${totalGroceries + groceries.price}"></c:set>
			</c:forEach>
			${totalGroceries} zl
        </td>
        <td>
			<c:forEach items="${allHouseholds}" var="households">
				<c:set var="totalHouseholds" value="${totalHouseholds + households.price}"></c:set>
			</c:forEach>
			${totalHouseholds} zl
        </td>
        <td>
            <c:forEach items="${productsByYear}" var="products">
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