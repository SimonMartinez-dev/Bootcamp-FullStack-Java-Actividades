USE clientesypedidos;

INSERT INTO clientes (idcliente, nombre, direccion, telefono) VALUES
(1, 'Ana Martínez', 'Calle 1, Ciudad A', '+5691234567'),
(2, 'Luis Gómez', 'Calle 2, Ciudad B', '+5698910111'),
(3, 'María López', 'Calle 3, Ciudad C', '+5691213141'),
(4, 'Pedro Fernández', 'Calle 4, Ciudad D', '+5691617181'),
(5, 'Carla Sánchez', 'Calle 5, Ciudad E', '+5692021222');

INSERT INTO pedidos (idpedido, fecha, total, clientes_idcliente) VALUES
(1, '2024-11-20', 2500.00, 1),
(2, '2024-11-20', 1800.00, 1),
(3, '2024-11-20', 3200.00, 2),
(4, '2024-11-20', 4000.00, 2),
(5, '2024-11-20', 5000.00, 3),
(6, '2024-11-20', 2200.00, 3),
(7, '2024-11-20', 1500.00, 4),
(8, '2024-11-20', 2800.00, 5),
(9, '2024-11-20', 3200.00, 5),
(10, '2024-11-20', 1800.00, 5);

SELECT  c.idcliente, c.nombre, c.direccion, c.telefono, p.idpedido, p.fecha, p.total 
FROM clientes c LEFT JOIN pedidos p ON c.idcliente = p.clientes_idcliente;

SELECT p.idpedido, p.fecha, p.total, c.idcliente, c.nombre FROM clientes c 
INNER JOIN pedidos p ON c.idcliente = p.clientes_idcliente WHERE c.idcliente = 2;

SELECT c.idcliente, c.nombre, SUM(p.total) AS total_pedidos FROM clientes c 
LEFT JOIN pedidos p ON c.idcliente = p.clientes_idcliente GROUP BY c.idcliente, c.nombre;

DELETE FROM pedidos
WHERE clientes_idcliente = 2;

DELETE FROM clientes
WHERE idcliente = 2;

SELECT * FROM clientes;
SELECT * FROM pedidos; 

SELECT *
FROM clientes
JOIN pedidos ON clientes.idcliente=pedidos.clientes_idcliente

;

SELECT clientes.*,
COUNT(pedidos.idpedido) AS pedidos 
FROM clientes
JOIN pedidos ON clientes.idcliente=pedidos.clientes_idcliente
GROUP BY idcliente
ORDER BY pedidos DESC
LIMIT 3
;