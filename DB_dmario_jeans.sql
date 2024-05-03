CREATE DATABASE Dmario_Jeans_DB;
USE Dmario_Jeans_DB;
CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(70) NOT NULL,
    identificacion VARCHAR(40) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    telefono VARCHAR(30) NOT NULL,
    contraseña VARCHAR(100) NOT NULL,
    UNIQUE (identificacion)
);


CREATE TABLE Diseño (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_diseño VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    archivo BLOB 
);

CREATE TABLE Bodega (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(100) NOT NULL,
    id_diseño INT,
    dia_exacto DATE NOT NULL,
    tipo_movimiento VARCHAR(50),
    cant INT
);
