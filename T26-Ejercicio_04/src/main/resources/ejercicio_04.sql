DROP DATABASE IF EXISTS ejercicio_04;
CREATE DATABASE ejercicio_04;
USE ejercicio_04;

CREATE TABLE facultad(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre NVARCHAR(100)
);

CREATE TABLE equipos(
	numserie CHAR(4) PRIMARY KEY,
    nombre NVARCHAR(100),
    facultad_id INT,
    FOREIGN KEY (facultad_id) REFERENCES facultad(id)
);

CREATE TABLE investigadores(
	dni VARCHAR(8) PRIMARY KEY,
    nomapels NVARCHAR(255),
    facultad_id INT,
    FOREIGN KEY (facultad_id) REFERENCES facultad(id)
);

CREATE TABLE reserva(
	id INT AUTO_INCREMENT PRIMARY KEY,
	dni_id VARCHAR(8),
	numserie_id CHAR(4),
	comienzo DATE,
    fin DATE,
	FOREIGN KEY (dni_id) REFERENCES investigadores(dni),
    FOREIGN KEY (numserie_id) REFERENCES equipos(numserie)
);

INSERT INTO facultad (nombre) VALUES 
('Universidad Autónoma de Barcelona'),
('Universidad Autónoma de Madrid'),
('Universidad Carlos III de Madrid');

INSERT INTO equipos VALUES
('1', 'Equipo A', 2),
('2', 'Equipo B', 1),
('3', 'Equipo C', 3);

INSERT INTO investigadores VALUES
('12345678', 'JOSE IGNACIO MORAGA RODRIGO', 3),
('95135785', 'INES PINEDA CASTIÑEIRA', 2),
('64135843', 'MARINA FILGUEIRA CHAPARRO', 1);

INSERT INTO reserva (dni_id, numserie_id, comienzo, fin) VALUES
('12345678', '3', '2019-12-3', '2021-01-4'),
('64135843', '1', '2020-01-5', '2020-05-12'),
('95135785', '2', '2019-09-6', '2022-06-20');
