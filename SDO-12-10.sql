DROP DATABASE  IF EXISTS SDO;
CREATE DATABASE IF NOT EXISTS SDO;

DROP TABLE IF EXISTS COSTO;
DROP TABLE IF EXISTS CONSUMIDORES;
DROP TABLE IF EXISTS CONSUMO;

USE SDO;

CREATE TABLE costo (
  idcosto INT AUTO_INCREMENT,
  costo DOUBLE,
  PRIMARY KEY (idcosto)
);

CREATE TABLE consumidores (
  idConsumidor int AUTO_INCREMENT,
  numUsuario varchar(50),
  numMedidor varchar(50),
  nombreCompleto varchar(100),
  direccion varchar(100),
  manzana varchar(10),
  telefono varchar(30),
  primary key(idConsumidor)
   );

CREATE TABLE consumo(
 -- idConsumo int AUTO_INCREMENT,
 numUsuario varchar(50),
 periodo int,
 anio int,
 lecturaActual double,
 consumoMedidor double,
 precio double,
 importeConsumo double,
 coutaFija double,
 recargos double,
 cooperacion double,
 bonificaciones double,
 sanciones double,
 varios double,
 totalPagar double,
 fechaPAgo date,
 notas varchar(300),
 aviso varchar(300),
 status int,
primary key(numUsuario,periodo, anio)
);
