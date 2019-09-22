CREATE DATABASE if not exists SDO;

CREATE TABLE consumidores (
  idConsumidor int AUTO_INCREMENT,
   nombreCompleto varchar(100),
   direccion varchar(100),
   telefono varchar(100),
   numMedidor varchar(100),
   primary key(idConsumidor)
   );

