<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<table>
		Zimna woda
		<tr>
			<th>
				Wartosc
			</th>
			<th>
				Jednostka
			</th>
			<th>
				Typ
			</th>
		</tr>
		<c:forEach items="${coldWater}" var="coldwater">
		<tr>
			<td>
				${coldwater.value}
			</td>
			<td>
				${coldwater.name}
			</td>
			<td>
				${coldwater.type}
			</td>
		</tr>
		</c:forEach>
	</table>
	<table>
		Ciepla woda
		<tr>
			<th>
				Wartosc
			</th>
			<th>
				Jednostka
			</th>
			<th>
				Typ
			</th>
		</tr>
		<c:forEach items="${hotWater}" var="hotwater">
		<tr>
			<td>
				${hotwater.value}
			</td>
			<td>
				${hotwater.name}
			</td>
			<td>
				${hotwater.type}
			</td>
		</tr>
		</c:forEach>
	</table>
	<table>
		Energia elektryczna
		<tr>
			<th>
				Wartosc
			</th>
			<th>
				Jednostka
			</th>
			<th>
				Typ
			</th>
		</tr>
		<c:forEach items="${electricty}" var="electricty">
		<tr>
			<td>
				${electricty.value}
			</td>
			<td>
				${electricty.name}
			</td>
			<td>
				${electricty.type}
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>