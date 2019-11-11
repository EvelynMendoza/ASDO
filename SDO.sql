
use sdo;

select periodo, anio,sum(consumoMedidor) as total from consumo GROUP BY periodo, anio;

select periodo, anio,sum(consumoMedidor) as total from consumo where periodo=4; /*7413*/
select periodo, anio,sum(consumoMedidor) as total from consumo where periodo=5; /*818*/

select * from consumo where periodo = 6;

select periodo, anio,sum(consumoMedidor) as total from consumo GROUP BY periodo, anio order by anio desc,periodo asc;

select * from consumidores;


select numUsuario from consumidores order by numUsuario desc limit 0,1