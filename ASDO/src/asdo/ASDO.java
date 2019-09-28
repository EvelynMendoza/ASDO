/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdo;

import DAO.DAOException;
import DAO.consumidoresDAO;
import DAO.consumidoresDAOImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import modelo.consumidores;

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
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/SDO", "octavio", "octavio");
            consumidoresDAO dao = new consumidoresDAOImpl(conn);
            List<consumidores> consumidores = dao.buscarTodos();

            // eliminar 
            // dao.elimnar(2);
           

            //consulta por id
            /* consumidores consumidor =dao.buscarConsumidor(1);
            System.out.println(consumidor.toString());*/
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
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    
}
