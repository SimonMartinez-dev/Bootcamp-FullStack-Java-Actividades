<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Lista de Recetas</title>
</head>
<body>
    <h1>Lista de Recetas</h1>
    <ul>
        <c:forEach var="receta" items="${listaRecetas}">
            <li>${receta}</li>
        </c:forEach>
    </ul>
</body>
</html>