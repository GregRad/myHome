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
<br>
	<table border="2px">
		Zimna woda
		<br>
		<br>
		<tr>
			<th>
				Wartosc
			</th>
			<th>
				Jednostka
			</th>
			<th>
				Data
			</th>
		</tr>
		<c:forEach items="${coldWater}" var="coldwater">
		<tr>
			<td>
				${coldwater.value}
			</td>
			<td>
				${coldwater.unit}
			</td>
			<td>
				${coldwater.date}
			</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<table border="2px">
		Ciepla woda
		<br>
		<br>
		<tr>
			<th>
				Wartosc
			</th>
			<th>
				Jednostka
			</th>
			<th>
				Data
			</th>
		</tr>
		<c:forEach items="${hotWater}" var="hotwater">
		<tr>
			<td>
				${hotwater.value}
			</td>
			<td>
				${hotwater.unit}
			</td>
			<td>
				${hotwater.date}
			</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<table border="2px">
		Energia elektryczna
		<br>
		<br>
		<tr>
			<th>
				Wartosc
			</th>
			<th>
				Jednostka
			</th>
			<th>
				Data
			</th>
		</tr>
		<c:forEach items="${electricity}" var="electricity">
		<tr>
			<td>
				${electricity.value}
			</td>
			<td>
				${electricity.unit}
			</td>
			<td>
				${electricity.date}
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>