DROP DATABASE ejercicio_03;
CREATE DATABASE ejercicio_03;
USE ejercicio_03;

CREATE TABLE cajeros (
  id int NOT NULL AUTO_INCREMENT,
  nomapels varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE maquinas_registradoras (
  id int NOT NULL AUTO_INCREMENT,
  piso int DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE productos (
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(100) DEFAULT NULL,
  precio int NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE venta (
  id int NOT NULL AUTO_INCREMENT,
  producto_id int NOT NULL,
  cajero_id int NOT NULL,
  maquina_id int NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (producto_id) REFERENCES productos (id),
  FOREIGN KEY (cajero_id) REFERENCES cajeros (id),
  FOREIGN KEY (maquina_id) REFERENCES maquinas_registradoras (id)
);

INSERT INTO cajeros (nomapels) VALUES
('JOSE MIGUEL RIAL ANGUITA'),
('RAUL GOMEZ BALAGUER'),
('PILAR PORCEL DOS SANTOS');

INSERT INTO maquinas_registradoras (piso) VALUES 
('4'),
('5'),
('3');

INSERT INTO productos (nombre, precio) VALUES 
('Naranja', 1),
('Manzana', 1),
('Fresas', 3);

INSERT INTO venta (producto_id, cajero_id, maquina_id) VALUES 
(2, 1, 3),
(1, 3, 2),
(3, 1, 2);
