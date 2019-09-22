/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.consumidores;

/**
 *
 * @author octavio
 */
public class consumidoresDAOImpl implements consumidoresDAO{

    
    final String INSERT="insert into consumidores(nombreCompleto, direccion, telefono,  numMedidor) values(?,?,?,?);";
    final String GETONE="select * from consumidores where idConsumidor=?";
    final String GETALL="select * from consumidores;";
   
    private Connection conn;

    public consumidoresDAOImpl(Connection conn) {
        this.conn = conn;
    }
    
    
    
    
    @Override
    public void insertar(consumidores c) throws DAOException{
        PreparedStatement stat=null;
        try {
            stat=conn.prepareStatement(INSERT);
            //stat.setInt(1, c.getIdConsumidor());
            stat.setString(1, c.getNombreCompleto());
            stat.setString(2, c.getDireccion());
            stat.setString(3, c.getTelefono());
            stat.setInt(4, c.getNumMedidor());
            if(stat.executeUpdate()==0){
                throw new DAOException("No se guardaron los datos" );
            }else{
                System.out.println("Los datos se han guardado");
            }
        } catch (SQLException e) {
            throw new DAOException("Error sql" + e);
        }finally{
            if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
        }
    }

    @Override
    public void elimnar(consumidores c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(consumidores c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public consumidores buscarConsumidor(int id) throws DAOException {
        PreparedStatement stat=null;        
        ResultSet rs=null;
        consumidores c=null;
        try {
            stat=conn.prepareStatement(GETONE);            
            stat.setInt(1, id);            
            rs=stat.executeQuery();
            if(rs.next()){
                c=convertir(rs);
            }else{
                throw new DAOException("No se ha encontrado ese registro");
            }
        } catch (SQLException e) {
            throw new DAOException("Error SQL" + e);
        }finally{
             if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
             if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
        }
        return c;
    }

    @Override
    public List<consumidores> buscarTodos() throws DAOException {
        
        List<consumidores> consumidores= new ArrayList<>();        
        PreparedStatement stat=null;        
        ResultSet rs=null;
        consumidores c=null;
        try {
            stat=conn.prepareStatement(GETALL);           
            rs=stat.executeQuery();
        while(rs.next()){
            consumidores.add(convertir(rs));
            }
        } catch (SQLException e) {
            throw new DAOException("Error SQL" + e);
        }finally{
             if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
             if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
        }
        
        return consumidores;
        
    }
    
    private consumidores convertir(ResultSet rs) throws SQLException{
        //String nombreCompleto=rs.getString("nombreCompleto");
        consumidores consumidor= new consumidores();
        consumidor.setIdConsumidor(rs.getInt("idConsumidor"));
        consumidor.setNombreCompleto(rs.getString("nombreCompleto"));
        consumidor.setDireccion(rs.getString("direccion"));
        consumidor.setTelefono(rs.getString("telefono"));
        consumidor.setNumMedidor(rs.getInt("numMedidor"));
   
        return consumidor;
    }
    
    
    public static void main(String[] args) throws SQLException, DAOException{
        Connection conn=null;
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/SDO","octavio", "octavio");
            consumidoresDAO dao= new consumidoresDAOImpl(conn);
            List<consumidores> consumidores=dao.buscarTodos();            
            for(consumidores c:consumidores){
                System.out.println(c.toString());
            }
            
            //consulta por id
            /*consumidores consumidor =dao.buscarConsumidor(1);
            System.out.println(consumidor.toString());*/
            
            /*Insert*/
            /*consumidores consu=new consumidores("Luis","Zaragosa 20","9515194019", 245);
            dao.insertar(consu);*/
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
}
