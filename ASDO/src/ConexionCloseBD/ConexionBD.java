/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionCloseBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author octavio
 */
public class ConexionBD {

    private Connection conn = null;

    public Connection conexion() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/SDO", "octavio", "octavio");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return conn;
    }

    public Connection getConn() {
        return conn;
    }

    public Connection cerrarConexion(){
        try {
            conn.close();
             System.out.println("Cerrando conexion a . . . . . Ok");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conn=null;
        return conn;
    }
    
}
