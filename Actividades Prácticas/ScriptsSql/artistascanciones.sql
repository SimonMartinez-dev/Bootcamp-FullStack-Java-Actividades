USE cancionesartistas;

INSERT INTO artistas (id, nombre, pais) VALUES 
(1, 'Shakira', 'Colombia'),
(2, 'Luis Fonsi', 'Puerto Rico'),
(3, 'Adele', 'Reino Unido'),
(4, 'Ed Sheeran', 'Reino Unido'),
(5, 'Bad Bunny', 'Puerto Rico');


INSERT INTO canciones (id, titulo, genero) VALUES 
(1, 'Hips Don\'t Lie', 'Pop'),
(2, 'Despacito', 'Reguetón'),
(3, 'Hello', 'Pop'),
(4, 'Shape of You', 'Pop'),
(5, 'Dakiti', 'Reguetón'),
(6, 'Perfect', 'Balada'),
(7, 'Rolling in the Deep', 'Soul'),
(8, 'Tusa', 'Reguetón'),
(9, 'Photograph', 'Pop'),
(10, 'Sobrio', 'Reguetón');


INSERT INTO artistas_canciones (artistas_id, canciones_id) VALUES 
(1, 1), 
(1, 8), 
(2, 2),
(2, 5),
(3, 3), 
(3, 7),
(4, 4), 
(4, 6), 
(4, 9), 
(5, 2), 
(5, 5),
(5, 10); 

SELECT a.nombre AS Artista, c.titulo AS Cancion
FROM artistas_canciones ac
JOIN artistas a ON ac.artistas_id = a.id
JOIN canciones c ON ac.canciones_id = c.id;

SELECT a.nombre AS Artista
FROM artistas_canciones ac
JOIN artistas a ON ac.artistas_id = a.id
JOIN canciones c ON ac.canciones_id = c.id
WHERE c.titulo = 'Despacito';

SELECT c.titulo AS Cancion, a.nombre AS Artista
FROM artistas_canciones ac
JOIN artistas a ON ac.artistas_id = a.id
JOIN canciones c ON ac.canciones_id = c.id
WHERE a.nombre = 'Ed Sheeran';

SELECT c.titulo AS Cancion, COUNT(ac.artistas_id) AS NumeroArtistas
FROM canciones c
LEFT JOIN artistas_canciones ac ON c.id = ac.canciones_id
GROUP BY c.id;

SELECT a.nombre AS Artista
FROM artistas a
LEFT JOIN artistas_canciones ac ON a.id = ac.artistas_id
WHERE ac.artistas_id IS NULL;

SELECT c.titulo AS Cancion, COUNT(ac.artistas_id) AS NumeroArtistas
FROM canciones c
JOIN artistas_canciones ac ON c.id = ac.canciones_id
GROUP BY c.id
ORDER BY NumeroArtistas DESC
LIMIT 1;