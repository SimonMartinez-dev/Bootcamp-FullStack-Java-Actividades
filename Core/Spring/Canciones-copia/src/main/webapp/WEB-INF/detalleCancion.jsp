<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Detalle Canción</title>
</head>
<body>	
	<h1>{cancion.titulo}</h1>
    	<p><strong>Artista:</strong> ${cancion.artista}</p>
    	<p><strong>Álbum:</strong> ${cancion.album}</p>
    	<p><strong>Género:</strong> ${cancion.genero}</p>
    	<p><strong>Idioma:</strong> ${cancion.idioma}</p>
    	<p><strong>Fecha de Creación:</strong> ${cancion.fechaCreacion}</p>
    	<p><strong>Fecha de Actualización:</strong> ${cancion.fechaActualizacion}</p>

    	 <form action="/canciones/eliminar/${cancion.id}" method="POST">
    		<input type="hidden" name="_method" value="DELETE" />
    		<button> Eliminar </button>
    	</form>

	<a href="/canciones/formulario/editar/${cancion.id}">Editar canción</a>
	<a href="<c:url value='/canciones'/>">Lista Canciones</a>
	<a href="<c:url value='/artistas'/>">Lista Artistas</a>
</body>
</html>