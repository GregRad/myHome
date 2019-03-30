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
    <title>Zakupy</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    Podsumowanie zakupów
    <br>
    <br>
    <div>
    	<select name="links" onchange="window.location.href=this.value;">
    		
    			<option value="www.google.pl">Google</option>
    	
    	</select>
    	<input type="submit" value="OK">
    	
    </div>
    <br>
    <div>
        <a href="/products/monthly/01"> Styczen</a>
        <a href="/products/monthly/02"> Luty</a>
        <a href="/products/monthly/03"> Marzec</a>
        <a href="/products/monthly/04"> Kwiecień</a>
        <a href="/products/monthly/05"> Maj</a>
        <a href="/products/monthly/06"> Czerwiec</a>
        <a href="/products/monthly/07"> Lipiec</a>
        <a href="/products/monthly/08"> Sierpień</a>
        <a href="/products/monthly/09"> Wrzesień</a>
        <a href="/products/monthly/10"> Październik</a>
        <a href="/products/monthly/11"> Listopad</a>
        <a href="/products/monthly/12"> Grudzień</a>
        <a href="/products/all_Products">Rocznie</a>
    </div>
    <br>
    <a href="/"> Strona domowa</a>
</body>
</html>
