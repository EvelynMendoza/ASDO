/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdo;

import ConexionCloseBD.ConexionBD;
import DAO.CoutaDAO;
import DAO.CoutaDAOImpl;
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
import modelo.Couta;
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
                CoutaDAO dao = new CoutaDAOImpl(conn);
            List<Couta> consumidores = dao.buscarTodos();

                // eliminar 
                // dao.elimnar(2);
                //consulta por id
                //Couta consumidor =dao.buscarCoua(2); 
              
               //System.out.println(consumidor.toString());
 /*Insert*/
 /*consumidores consu=new consumidores("410","11028358","PEDRO GARCÍA LÓPEZ","PRIV. MORELOS#2",2,"951 128 00 98");
            dao.insertar(consu);*/
                //Update 
                Couta consu=new Couta(2.9,"2029");
            
            consu.setID_CUOTA(1);
            //dao.actualizar(consu);
            //dao.insertar(consu);
            
 for (Couta c : consumidores) {
                System.out.println(c.toString());
            }
                //PRUEBA CONSUMO
               
               
              /* consumo consumo3 = dao.buscarConsumidor(2);
                System.out.println(consumo3.toString());*/
               
            } finally {
                if (conn != null) {
                    con.cerrarConexion();
                }
            }
        }

    }
