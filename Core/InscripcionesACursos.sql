USE inscripcionesacursos;

INSERT INTO estudiantes (id, nombre, edad) VALUES 
(1, 'Juan Pérez', 20),
(2, 'María López', 22),
(3, 'Carlos Gómez', 19),
(4, 'Ana Sánchez', 23),
(5, 'Luis Fernández', 21);

INSERT INTO cursos (id, nombre, duracion) VALUES 
(1, 'Matemáticas', 40),
(2, 'Física', 35),
(3, 'Química', 30),
(4, 'Programación', 50);

INSERT INTO inscripciones (estudiantes_id, cursos_id) VALUES 
(1, 1), 
(1, 2), 
(2, 3), 
(2, 4), 
(3, 1), 
(3, 4),
(4, 2), 
(5, 3); 

SELECT e.nombre AS Estudiante, c.nombre AS Curso
FROM inscripciones i
JOIN estudiantes e ON i.estudiantes_id = e.id
JOIN cursos c ON i.cursos_id = c.id;

SELECT e.nombre AS Estudiante, c.nombre AS Curso
FROM inscripciones i
JOIN estudiantes e ON i.estudiantes_id = e.id
JOIN cursos c ON i.cursos_id = c.id
WHERE c.nombre = 'Física';

SELECT c.nombre AS Curso, COUNT(i.estudiantes_id) AS NumeroEstudiantes
FROM cursos c
LEFT JOIN inscripciones i ON c.id = i.cursos_id
GROUP BY c.id;

SELECT e.nombre AS Estudiante
FROM estudiantes e
LEFT JOIN inscripciones i ON e.id = i.estudiantes_id
WHERE i.estudiantes_id IS NULL;