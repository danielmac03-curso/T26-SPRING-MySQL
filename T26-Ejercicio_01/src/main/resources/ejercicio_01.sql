DROP DATABASE `ejercicio_01`;
CREATE DATABASE `ejercicio_01`;
USE `ejercicio_01`;

CREATE TABLE piezas(
    id int AUTO_INCREMENT PRIMARY KEY,
    nombre NVARCHAR(100) NOT NULL
);

CREATE TABLE proveedores(
    id NVARCHAR(4) PRIMARY KEY,
    nombre NVARCHAR(100) NOT NULL
);

CREATE TABLE suministra(
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigopieza_id INT NOT NULL,
    proveedor_id NVARCHAR(100) NOT NULL,
    precio INT NOT NULL,
    FOREIGN KEY (codigoPieza_id) REFERENCES piezas(id),
    FOREIGN KEY (proveedor_id) REFERENCES proveedores(id)
);

INSERT INTO piezas (nombre) VALUES
('Tornillo'),
('Tuerca'),
('Broca 6m'),
('Clavos');

INSERT INTO proveedores (id, nombre) VALUES
('1', 'Fischer'),
('2', 'Bosch'),
('3', 'Craftomat'),
('4', 'Stanley');

INSERT INTO suministra (codigoPieza_id, proveedor_id, precio) VALUES
(1, '3', 15),
(2, '4', 10),
(3, '2', 11),
(3, '4', 25);