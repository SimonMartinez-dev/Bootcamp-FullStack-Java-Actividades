<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>
	<h1>Ingrese su libro:</h1>
	<form action="/procesa/libro" method="POST">
		<label for="nombreLibro">Nombre del Libro:</label>
		<input type="text" name="nombreLibro">
		<label for="autorLibro">Nombre del Autor:</label>
		<input type="text" name="autorLibro">
		<button type="submit">Agregar a la Lista</button>
	
	</form>
</body>
</html>