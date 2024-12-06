CREATE DATABASE canciones_db;

USE canciones_db;

CREATE TABLE canciones (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    artista VARCHAR(255) NOT NULL,
    album VARCHAR(255),
    genero VARCHAR(100),
    idioma VARCHAR(100),
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Inserta datos de ejemplo:
INSERT INTO canciones (titulo, artista, album, genero, idioma) 
VALUES 
('Bohemian Rhapsody', 'Queen', 'A Night at the Opera', 'Rock', 'Inglés'),
('Imagine', 'John Lennon', 'Imagine', 'Pop', 'Inglés');