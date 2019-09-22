CREATE DATABASE if not exists SDO;

CREATE TABLE consumidores (
  idConsumidor int AUTO_INCREMENT,
   nombreCompleto varchar(100),
   direccion varchar(100),
   telefono varchar(100),
   numMedidor varchar(100),
   primary key(idConsumidor)
   );

CREATE TABLE consumo(
 idConsumo int AUTO_INCREMENT,
 idUsuario int,
 periodo varchar(20),
 fechaInicio varchar(20),
 fechaIfin varchar(20),
 mCubicos double,
 pConsumo double,
 pTotal double,
 status varchar(10),
primary key(idConsumo)
);
