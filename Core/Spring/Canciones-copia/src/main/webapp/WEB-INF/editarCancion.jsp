<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar Canción</title>
</head>
<body>
	<h1>Editar Canción: </h1>
	<form:form action="/canciones/procesa/editar/${cancion.id}" method="POST" modelAttribute="cancion">
		<input type="hidden" name="_method" value="PUT" />
		
		<input type="hidden" name="id" value="${cancion.id}" />
		<form:label path="titulo">Titulo de la Canción:</form:label>
		<form:input path="titulo" type="text"/>
		<form:errors path="titulo"/>
		
		<form:label path="artista">Artista:</form:label>
		<form:input path="artista" type="text"/>
		<form:errors path="artista"/>
		
		<form:label path="album">Álbum:</form:label>s
		<form:input path="album" type="text"/>
		<form:errors path="album"/>
		
		<form:label path="genero">Género:</form:label>
		<form:input path="genero" type="text"/>
		<form:errors path="genero"/>
		
		<form:label path="idioma">Idioma:</form:label>
		<form:input path="idioma" type="text"/>
		<form:errors path="idioma"/>
		
		<input type="submit" value="Actualizar Cancion">
	
	</form:form>
	<a href="/canciones">Lista Canciones</a>

</body>
</html>