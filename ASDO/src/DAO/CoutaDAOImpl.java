/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Couta;

/**
 *
 * @author octavio
 */
public class CoutaDAOImpl implements CoutaDAO{
    
    final String INSERT = "INSERT INTO CUOTA (PRECIO, ANIO) VALUES (?, ?);";
    //final String GETONE = "select * from CUOTA where ID_CUOTA=?;";
    final String GETONE = "select * from CUOTA LIMIT 1;";
    final String GETALL = "select * from CUOTA;";
    final String DELETE = "DELETE FROM CUOTA WHERE ID_CUOTA=?";
    final String UPDATE = "UPDATE CUOTA SET PRECIO=?, ANIO=? WHERE ID_CUOTA=?;";

    private Connection conn;

    public CoutaDAOImpl(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insertar(Couta c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            //stat.setInt(1, c.getIdConsumidor());
            stat.setDouble(1, c.getPRECIO());
            stat.setString(2, c.getANIO());
            

            if (stat.executeUpdate() == 0) {
                throw new DAOException("No se guardaron los datos");
            } else {
                System.out.println("Los datos se han guardado");
            }
        } catch (SQLException e) {
            throw new DAOException("Error sql" + e);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
        }
    }

    @Override
    public void elimnar(int c) throws DAOException {
         PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, c);

            if (stat.executeUpdate() == 0) {
                throw new DAOException("No se ha podido elimiar el registro");
            } else {
                System.out.println("Los datos se han borrado");
            }
        } catch (SQLException e) {
            throw new DAOException("Error sql" + e);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
        }
    }

    @Override
    public void actualizar(Couta c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setDouble(1, c.getPRECIO());
            stat.setString(2, c.getANIO());
            stat.setInt(3, c.getID_CUOTA());
            if (stat.executeUpdate() == 0) {
                throw new DAOException("No se guardaron los datos");
            } else {
                JOptionPane.showMessageDialog(null, "La CUOTA a sido Actualizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            throw new DAOException("Error sql" + e);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
        }
    }

    @Override
    public Couta buscarCuota() throws DAOException {
       PreparedStatement stat = null;
        ResultSet rs = null;
        Couta c = null;        
        try {            
            stat = conn.prepareStatement(GETONE);            
            //stat.setInt(1, id);            
            rs = stat.executeQuery();
            if (rs.next()) {
                c = convertir(rs);
            } else {
                System.out.println("No hay registros");
            }
        } catch (SQLException e) {
            throw new DAOException("Error SQL" + e);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
            if (rs != null) {
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
    public List<Couta> buscarTodos() throws DAOException {
         List<Couta> couta = new ArrayList<>();
        PreparedStatement stat = null;
        ResultSet rs = null;
        Couta c = null;
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while (rs.next()) {
                couta.add(convertir(rs));
            }
        } catch (SQLException e) {
            throw new DAOException("Error SQL" + e);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL" + e);
                }
            }
        }

        return couta;

    }
    
    
     private Couta convertir(ResultSet rs) throws SQLException {
        //String nombreCompleto=rs.getString("nombreCompleto");
        Couta couta = new Couta();
        couta.setID_CUOTA(rs.getInt("ID_CUOTA"));
        couta.setPRECIO(rs.getDouble("PRECIO"));
        couta.setANIO(rs.getString("ANIO"));

        return couta;
    }

}
