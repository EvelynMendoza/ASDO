drop DATABASE  if exists SDO;
CREATE DATABASE if not exists SDO;
use SDO;
CREATE TABLE consumidores (
  idConsumidor int AUTO_INCREMENT,
  numUsuario varchar(50),
  numMedidor varchar(50),
  nombreCompleto varchar(100),
  direccion varchar(100),
  manzana int,
  telefono varchar(15),
  primary key(idConsumidor)
   );

CREATE TABLE consumo(
 idConsumo int AUTO_INCREMENT,
 idUsuario int,
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
 avis varchar(300),
 status varchar(10),
primary key(idConsumo)
);

-- insert into consumidores(nombreCompleto, direccion, telefono,  numMedidor) values("octavio","Zaragosa 20","9515194019", 244);
insert into consumidores(numUsuario, numMedidor, nombreCompleto,  direccion, manzana, telefono) 
values("410","11028358","PEDRO GARCÍA LÓPEZ","PRIV. MORELOS#2",2,"951 128 00 98");

