/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdo;

import ConexionCloseBD.ConexionBD;
import DAO.DAOException;
import DAO.consumidoresDAO;
import DAO.consumidoresDAOImpl;
import DAO.consumoDAOImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import modelo.consumidores;
import modelo.consumo;

/**
 *
 * @author Evelyn
 */
public class ASDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, DAOException {
        Connection conn = null;
        ConexionBD con = new ConexionBD();

       SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
       String fechaformateada =formato.format(new Date());

            try {
                // conn = DriverManager.getConnection("jdbc:mysql://localhost/SDO", "octavio", "octavio");

                conn = con.conexion();
                consumidoresDAO dao = new consumidoresDAOImpl(conn);
            List<consumidores> consumidores = dao.buscarTodos();

                // eliminar 
                // dao.elimnar(2);
                //consulta por id
                consumidores consumidor =dao.buscarConsumidor(2); 
              
               //System.out.println(consumidor.toString());
 /*Insert*/
 /*consumidores consu=new consumidores("410","11028358","PEDRO GARCÍA LÓPEZ","PRIV. MORELOS#2",2,"951 128 00 98");
            dao.insertar(consu);*/
                //Update 
                /* consumidores consu=new consumidores("411","11028358","PEDRO ","PRIV. MORELOS#4",17,"951 128 00 98");
            
            consu.setIdConsumidor(1);
            dao.actualizar(consu);*/
 for (consumidores c : consumidores) {
                System.out.println(c.toString());
            }
                //PRUEBA CONSUMO
              //  consumoDAOImpl dao = new consumoDAOImpl(conn);
                //List<consumo> consumo = dao.buscarTodos();

                consumo consu = new consumo();
                
                //consu.setIdUsuario(1);
                consu.setLecturaActual(2.0);
                consu.setConsumoMedidor(3.0);
                consu.setPrecio(4.0);
                consu.setImporteConsumo(4);
                consu.setCoutaFija(0);
                consu.setRecargos(0);
                consu.setCooperacion(50);
                consu.setBonificaciones(0);
                consu.setSanciones(0);
                consu.setVarios(0);
                consu.setTotalPagar(40);
                consu.setFechaPAgo(fechaformateada);
                consu.setNotas("sin notas");
                consu.setAviso("aviso");
                consu.setStatus(0);
               // dao.insertar(consu);
               //consu.setIdConsumo(2);
              // dao.actualizar(consu);
               
               
               //dao.elimnar(1);
      //  List<consumo> consumo2 = dao.buscarTodos();
               /* for (consumo c : consumo2) {
                System.out.println(c.toString());
            }*/
               
              /* consumo consumo3 = dao.buscarConsumidor(2);
                System.out.println(consumo3.toString());*/
               
            } finally {
                if (conn != null) {
                    con.cerrarConexion();
                }
            }
        }

    }
