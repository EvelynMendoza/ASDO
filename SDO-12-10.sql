DROP DATABASE  IF EXISTS SDO;
CREATE DATABASE IF NOT EXISTS SDO;

DROP TABLE IF EXISTS CONSUMIDORES;
DROP TABLE IF EXISTS CONSUMO;
DROP TABLE IF EXISTS CUOTA;
DROP TABLE IF EXISTS PERIODO;

USE SDO;

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


CREATE TABLE IF NOT EXISTS CUOTA
(
    ID_CUOTA INT PRIMARY KEY AUTO_INCREMENT, # IDENTIFICADOR
    PRECIO   NUMERIC(10, 4),# PRECIO
    ANIO VARCHAR(4) # AÑO AL QUE CORRESPONDE LA CUOTA
);


CREATE TABLE IF NOT EXISTS PERIODO(
    ID_PERIODO INT PRIMARY KEY AUTO_INCREMENT,# IDENTIFICADOR
    FECHA_INICIAL DATE,# FECHA DE INICIO DEL PERIODO
    FECHA_FINAL DATE,# FECHA DE FIN DEL PERIODO
    ID_CUOTA INT,# IDENTIFICADOR DE LA CUOTA CORRESPONDIENTE AL PERIODO
    FOREIGN KEY (ID_CUOTA) REFERENCES CUOTA(ID_CUOTA)
);


insert into CUOTA (PRECIO, ANIO)
values (3,2018),
       (4,2019);

-- AQUI SE IRAN INSERTANDO LOS PERIODOS
INSERT INTO PERIODO (FECHA_INICIAL, FECHA_FINAL, ID_CUOTA) VALUES
('2018-08-01', '2018-09-30', 2),
('2018-10-01','2018-11-30',2),
('2018-12-01','2019-01-31',2),
('2019-02-01','2019-03-31',2),
('2019-04-01','2019-05-31',2),
('2019-06-01','2019-07-31',2);

-- ('2019-08-01','2019-09-30',2),
-- ('2019-10-01','2019-11-30',2),
-- ('2019-12-01','2020-01-31',2);

 insert into consumidores(numUsuario, numMedidor, nombreCompleto,  direccion, manzana, telefono) 
 values("011","11028358","PEDRO GARCÍA LÓPEZ","PRIV. MORELOS#2",2,"951 128 00 98");

 insert consumo(numUsuario, periodo, anio, lecturaActual, consumoMedidor, precio, importeConsumo,
  coutaFija, recargos, cooperacion, bonificaciones, sanciones, varios, totalPagar,
  fechaPAgo, notas,aviso, status) values("011",1,2019,'2.0','2.3','4.0','432.0',
  '0.0','0','0','0','0','0','0','2019-09-19',"no hay notas","aviso",0);

select * from consumo;
select * from consumo where status=2;
select * from consumo where numUsuario=409;

select * from consumo;