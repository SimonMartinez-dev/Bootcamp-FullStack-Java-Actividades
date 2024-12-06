<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Detalle Libros</title>
</head>
<body>
<h1>Detalle de los libros</h1>
       <c:choose>
        <c:when test="${not empty nombre}">
            <h1>Información del Libro</h1>
            <p><strong>Nombre:</strong> ${nombre}</p>
            <p><strong>Autor:</strong> ${autor}</p>
        </c:when>
        <c:otherwise>
            <p>${mensaje}</p>
        </c:otherwise>
    </c:choose>
    <a href="/libros">Volver a la lista de libros</a>
</body>
</html>