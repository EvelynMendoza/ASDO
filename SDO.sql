drop DATABASE  if exists SDO;
CREATE DATABASE if not exists SDO;
use SDO;
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

 
 insert into consumidores(numUsuario, numMedidor, nombreCompleto,  direccion, manzana, telefono) 
 values("011","11028358","PEDRO GARCÍA LÓPEZ","PRIV. MORELOS#2",2,"951 128 00 98");

 insert consumo(numUsuario, periodo, anio, lecturaActual, consumoMedidor, precio, importeConsumo,
  coutaFija, recargos, cooperacion, bonificaciones, sanciones, varios, totalPagar,
  fechaPAgo, notas,aviso, status) values("011",13,2019,'2.0','2.3','4.0','432.0',
  '0.0','0','0','0','0','0','0','2019-09-19',"no hay notas","aviso",0);

select * from consumidores;