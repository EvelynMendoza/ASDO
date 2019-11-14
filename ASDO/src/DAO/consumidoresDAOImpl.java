
package DAO;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.consumidores;

/**
 *
 * @author octavio
 */
public class consumidoresDAOImpl implements consumidoresDAO {

    final String INSERT = "insert into consumidores(numUsuario, numMedidor, nombreCompleto,  direccion, manzana, telefono, status) values(?,?,?,?,?,?,?);";
    final String GETONE = "select * from consumidores where numUsuario=?;";
    final String GETMEDIDOR = "select * from consumidores where numMedidor=?;";
    final String GETALL = "select * from consumidores;";
    final String GETMAX = "select * from consumidores order by numUsuario desc limit 0,1";
    final String DELETE = "DELETE FROM consumidores WHERE idConsumidor=?";
    final String UPDATE = "UPDATE consumidores SET numMedidor=?, nombreCompleto=?,  direccion=?, manzana=?, telefono=?, status=? WHERE numUsuario=?;";

    private final Connection conn;

    public consumidoresDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(consumidores c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, c.getNumUsuario());
            stat.setString(2, c.getNumMedidor());
            stat.setString(3, c.getNombreCompleto());
            stat.setString(4, c.getDireccion());
            stat.setString(5, c.getManzana());
            stat.setString(6, c.getTelefono());
            stat.setInt(7, c.getStatus());

            if (stat.executeUpdate() == 0) {
                throw new DAOException("No se guardaron los datos");
            } else {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Los datos se han borrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
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
    public void actualizar(consumidores c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
//            stat.setString(1, c.getNumUsuario());
            stat.setString(1, c.getNumMedidor());
            stat.setString(2, c.getNombreCompleto());
            stat.setString(3, c.getDireccion());
            stat.setString(4, c.getManzana());
            stat.setString(5, c.getTelefono());
            stat.setInt(6, c.getStatus());
            stat.setString(7, c.getNumUsuario());
            if (stat.executeUpdate() == 0) {
                throw new DAOException("No se guardaron los datos");
            } else {
                JOptionPane.showMessageDialog(null, "Los datos se han Actualizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
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
    public consumidores buscarConsumidor(int id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        consumidores c = null;        
        try {            
            stat = conn.prepareStatement(GETONE);            
            stat.setInt(1, id);            
            rs = stat.executeQuery();
            if (rs.next()) {
                c = convertir(rs);
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no fue encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
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
    public List<consumidores> buscarTodos() throws DAOException {

        List<consumidores> consumidores = new ArrayList<>();
        PreparedStatement stat = null;
        ResultSet rs = null;
        consumidores c = null;
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while (rs.next()) {
                consumidores.add(convertir(rs));
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

        return consumidores;

    }

    private consumidores convertir(ResultSet rs) throws SQLException {
        //String nombreCompleto=rs.getString("nombreCompleto");
        consumidores consumidor = new consumidores();
        consumidor.setIdConsumidor(rs.getInt("idConsumidor"));
        consumidor.setNumUsuario(rs.getString("numUsuario"));
        consumidor.setNumMedidor(rs.getString("numMedidor"));
        consumidor.setNombreCompleto(rs.getString("nombreCompleto"));
        consumidor.setDireccion(rs.getString("direccion"));
        consumidor.setManzana(rs.getString("manzana"));
        consumidor.setTelefono(rs.getString("telefono"));
        consumidor.setStatus(rs.getInt("status"));

        return consumidor;
    }  

    @Override
    public consumidores obtenerNumusuario() throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        consumidores c = null;        
        try {   
            stat = conn.prepareStatement(GETMAX);            
//            stat.setInt(1, id);  
            rs = stat.executeQuery();
            if (rs.next()) {
                c = convertir(rs);                
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no fue encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            throw new DAOException("Error SQL" + e);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL var stat: " + e);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL var rs: " + e);
                }
            }
        }
        return c;
    }

    @Override
    public consumidores buscarNconsumidor(int nConsumidor) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        consumidores c = null;        
        try {            
            stat = conn.prepareStatement(GETMEDIDOR);            
            stat.setInt(1, nConsumidor);            
            rs = stat.executeQuery();
            if (rs.next()) {
                c = convertir(rs);
            } else {
//                JOptionPane.showMessageDialog(null, "El usuario no fue encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
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
}
