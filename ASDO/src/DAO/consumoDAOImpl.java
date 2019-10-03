/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.consumo;

/**
 *
 * @author octavio
 */
public class consumoDAOImpl implements consumoDAO {

    private Connection conn;

    final String INSERT = " insert consumo(idUsuario, lecturaActual, consumoMedidor, precio, importeConsumo,\n"
            + " coutaFija, recargos, cooperacion, bonificaciones, sanciones, varios, totalPagar,\n"
            + " fechaPAgo, notas,aviso, status) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    final String GETONE = "select * from consumo where idConsumo=?";
    final String GETALL = "select * from consumo;";
    final String DELETE = "DELETE FROM consumo WHERE idConsumo=?";
    final String UPDATE = "UPDATE consumo SET idUsuario=?, lecturaActual=?, consumoMedidor=?, precio=?, importeConsumo=?,"
            + " coutaFija=?, recargos=?, cooperacion=?, bonificaciones=?, sanciones=?, varios=?, totalPagar=?,"
            + "fechaPAgo=?, notas=?,aviso=?, status=? WHERE idConsumo= ?;";

    public consumoDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(consumo c) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            //stat.setInt(1, c.getIdConsumidor());
            stat.setString(1, c.getNumUsuario());
            stat.setDouble(2, c.getLecturaActual());
            stat.setDouble(3, c.getConsumoMedidor());
            stat.setDouble(4, c.getPrecio());
            stat.setDouble(5, c.getImporteConsumo());
            stat.setDouble(6, c.getCoutaFija());
            stat.setDouble(7, c.getRecargos());
            stat.setDouble(8, c.getCooperacion());
            stat.setDouble(9, c.getBonificaciones());
            stat.setDouble(10, c.getSanciones());
            stat.setDouble(11, c.getVarios());
            stat.setDouble(12, c.getTotalPagar());
            stat.setString(13, c.getFechaPAgo());
            stat.setString(14, c.getNotas());
            stat.setString(15, c.getAviso());
            stat.setInt(16, c.getStatus());

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
    public void elimnar(int id) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setInt(1, id);

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
    public void actualizar(consumo c) throws DAOException {

        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);

            stat.setString(1, c.getNumUsuario());
            stat.setDouble(2, c.getLecturaActual());
            stat.setDouble(3, c.getConsumoMedidor());
            stat.setDouble(4, c.getPrecio());
            stat.setDouble(5, c.getImporteConsumo());
            stat.setDouble(6, c.getCoutaFija());
            stat.setDouble(7, c.getRecargos());
            stat.setDouble(8, c.getCooperacion());
            stat.setDouble(9, c.getBonificaciones());
            stat.setDouble(10, c.getSanciones());
            stat.setDouble(11, c.getVarios());
            stat.setDouble(12, c.getTotalPagar());
            stat.setString(13, c.getFechaPAgo());
            stat.setString(14, c.getNotas());
            stat.setString(15, c.getAviso());
            stat.setInt(16, c.getStatus());
            stat.setInt(17, c.getIdConsumo());
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
    public consumo buscarConsumo(int id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        consumo c = null;
        try {
            stat = conn.prepareStatement(GETONE);
            stat.setInt(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                c = convertir(rs);
            } else {
                throw new DAOException("No se ha encontrado ese registro");
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
    public List<consumo> buscarTodos() throws DAOException {
          List<consumo> consumo = new ArrayList<>();
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while (rs.next()) {
                consumo.add(convertir(rs));
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

        return consumo;
    }

    
     private consumo convertir(ResultSet rs) throws SQLException {
        //String nombreCompleto=rs.getString("nombreCompleto");
        consumo consumo = new consumo();
        consumo.setIdConsumo(rs.getInt("idConsumo"));
        consumo.setNumUsuario(rs.getString("numUsuario"));
        consumo.setLecturaActual(rs.getDouble("lecturaActual"));
        consumo.setConsumoMedidor(rs.getDouble("consumoMedidor"));
        consumo.setPrecio(rs.getDouble("precio"));
        consumo.setImporteConsumo(rs.getDouble("importeConsumo"));
        consumo.setCoutaFija(rs.getDouble("coutaFija"));
        consumo.setRecargos(rs.getDouble("recargos"));
        consumo.setCooperacion(rs.getDouble("cooperacion"));
        consumo.setBonificaciones(rs.getDouble("bonificaciones"));
        consumo.setSanciones(rs.getDouble("sanciones"));
        consumo.setVarios(rs.getDouble("varios"));
        consumo.setTotalPagar(rs.getDouble("totalPagar"));
        consumo.setFechaPAgo(rs.getString("fechaPAgo"));
        consumo.setNotas(rs.getString("notas"));
        consumo.setAviso(rs.getString("aviso"));
        consumo.setStatus(rs.getInt("status"));

        return consumo;
    }
}
