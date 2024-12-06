<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Recetas</title>
</head>
<body>
    <h1>Detalle de las Recetas</h1>
    <c:choose>
        <c:when test="${not empty ingredientes}">
            <h3>${nombre}</h3>
            <ul>
                <c:forEach var="ingrediente" items="${ingredientes}">
                <li>${ingrediente}</li>
                </c:forEach>
            </ul>
        </c:when>
        <c:otherwise>
        <p> ${error}</p>
        </c:otherwise>
    </c:choose>
</body>
</html>