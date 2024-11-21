USE autoresylibros;

INSERT INTO autores (id, nombre, nacionalidad, fecha_publicacion) VALUES
(1, 'Gabriel García Márquez', 'Colombiana', '1967-06-05'),
(2, 'Isabel Allende', 'Chilena', '1982-09-01'),
(3, 'J.K. Rowling', 'Británica', '1997-06-26'),
(4, 'Haruki Murakami', 'Japonesa', '1987-10-15'),
(5, 'George Orwell', 'Británica', '1945-08-17');

INSERT INTO libros (id, autores_id, titulo, genero, editorial) VALUES
(1, 1, 'Cien años de soledad', 'Ficción', 'Sudamericana'),
(2, 1, 'El coronel no tiene quien le escriba', 'Ficción', 'Sudamericana'),
(3, 2, 'La casa de los espíritus', 'Realismo mágico', 'Plaza & Janés'),
(4, 2, 'De amor y de sombra', 'Romance', 'Plaza & Janés'),
(5, 3, 'Harry Potter y la piedra filosofal', 'Fantasía', 'Bloomsbury'),
(6, 3, 'Harry Potter y la cámara secreta', 'Fantasía', 'Bloomsbury'),
(7, 3, 'Tokio Blues', 'Ficción', 'Tusquets'),
(8, 4, 'Kafka en la orilla', 'Ficción', 'Tusquets'),
(9, 5, '1984', 'Distopía', 'Secker & Warburg'),
(10, 5, 'Rebelión en la granja', 'Satírica', 'Secker & Warburg');

SELECT a.nombre AS autor, l.titulo AS libro
FROM autores a 
LEFT JOIN libros l ON a.id = l.autores_id;

SELECT a.id,a.nombre, l.autores_id,l.titulo 
FROM autores a JOIN libros l 
ON  a.id = l.autores_id
WHERE a.id = 1;

SELECT genero, COUNT(*) 
FROM libros
AS cantidad
GROUP BY genero;

UPDATE autores
SET nacionalidad = "Chilena" 
WHERE id=1;

SELECT * FROM autores;

SELECT * FROM autores
WHERE nombre LIKE 'AI%';

DELETE FROM libros
WHERE autores_id = 2;

DELETE FROM autores
WHERE id = 2;

SELECT * FROM autores;
SELECT * FROM libros;

SELECT *
FROM autores
JOIN libros ON autores_id=libros.autores_id;


