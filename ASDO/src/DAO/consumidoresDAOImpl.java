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
public class consumidoresDAOImpl implements consumidoresDAO {

    final String INSERT = "insert into consumidores(numUsuario, numMedidor, nombreCompleto,  direccion, manzana, telefono) values(?,?,?,?,?,?);";
    final String GETONE = "select * from consumidores where numUsuario=?";
    final String GETALL = "select * from consumidores;";
    final String DELETE = "DELETE FROM consumidores WHERE idConsumidor=?";
    final String UPDATE = "UPDATE consumidores SET numUsuario =?, numMedidor =?, nombreCompleto =?,  direccion =?, manzana =?, telefono=? WHERE idConsumidor= ?;";

    private Connection conn;

    public consumidoresDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(consumidores c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            //stat.setInt(1, c.getIdConsumidor());
            stat.setString(1, c.getNumUsuario());
            stat.setString(2, c.getNumMedidor());
            stat.setString(3, c.getNombreCompleto());
            stat.setString(4, c.getDireccion());
            stat.setString(5, c.getManzana());
            stat.setString(6, c.getTelefono());

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
    public void actualizar(consumidores c) throws DAOException {

        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);

            stat.setString(1, c.getNumUsuario());
            stat.setString(2, c.getNumMedidor());
            stat.setString(3, c.getNombreCompleto());
            stat.setString(4, c.getDireccion());
            stat.setString(5, c.getManzana());
            stat.setString(6, c.getTelefono());
            stat.setInt(7, c.getIdConsumidor());
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
                System.out.println("No hay registors");
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

        return consumidor;
    }

   
}
