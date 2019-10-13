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

    final String INSERT = "insert consumo(numUsuario, periodo, anio, lecturaActual, consumoMedidor, precio, importeConsumo,\n" +
"  coutaFija, recargos, cooperacion, bonificaciones, sanciones, varios, totalPagar,\n" +
"  fechaPAgo, notas,aviso, status ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    final String GETONE = "select * from consumo WHERE numUsuario=? and periodo=? and anio=?;";
    final String GETALL = "select * from consumo;";
    final String DELETE = "DELETE FROM consumo WHERE numUsuario=? and periodo=? and anio=?;";
    final String UPDATE = "UPDATE consumo SET  lecturaActual=?, consumoMedidor=?, precio=?, importeConsumo=?,"
            + " coutaFija=?, recargos=?, cooperacion=?, bonificaciones=?, sanciones=?, varios=?, totalPagar=?,"
            + "fechaPAgo=?, notas=?,aviso=?, status=? WHERE numUsuario=? and periodo=? and anio=?;";
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
            stat.setInt(2, c.getPeriodo());
            stat.setInt(3, c.getAnio());
            stat.setDouble(4, c.getLecturaActual());
            stat.setDouble(5, c.getConsumoMedidor());
            stat.setDouble(6, c.getPrecio());
            stat.setDouble(7, c.getImporteConsumo());
            stat.setDouble(8, c.getCoutaFija());
            stat.setDouble(9, c.getRecargos());
            stat.setDouble(10, c.getCooperacion());
            stat.setDouble(11, c.getBonificaciones());
            stat.setDouble(12, c.getSanciones());
            stat.setDouble(13, c.getVarios());
            stat.setDouble(14, c.getTotalPagar());
            stat.setString(15, c.getFechaPAgo());
            stat.setString(16, c.getNotas());
            stat.setString(17, c.getAviso());
            stat.setInt(18, c.getStatus());

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
    public void elimnar(int IdUser, int periodo, int anio) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            //stat.setInt(1, id);
            stat.setInt(1,IdUser );
            stat.setInt(2, periodo);
            stat.setInt(3, anio);
            

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

            
            stat.setDouble(1, c.getLecturaActual());
            stat.setDouble(2, c.getConsumoMedidor());
            stat.setDouble(3, c.getPrecio());
            stat.setDouble(4, c.getImporteConsumo());
            stat.setDouble(5, c.getCoutaFija());
            stat.setDouble(6, c.getRecargos());
            stat.setDouble(7, c.getCooperacion());
            stat.setDouble(8, c.getBonificaciones());
            stat.setDouble(9, c.getSanciones());
            stat.setDouble(10, c.getVarios());
            stat.setDouble(11, c.getTotalPagar());
            stat.setString(12, c.getFechaPAgo());
            stat.setString(13, c.getNotas());
            stat.setString(14, c.getAviso());
            stat.setInt(15, c.getStatus());
            
            stat.setString(16, c.getNumUsuario());
            stat.setInt(17, c.getPeriodo());
            stat.setInt(18, c.getAnio());
            
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
    public consumo buscarConsumo(int IdUser, int periodo, int anio) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        consumo c = null;
        try {
            stat = conn.prepareStatement(GETONE);
            stat.setInt(1,IdUser );
            stat.setInt(2, periodo);
            stat.setInt(3, anio);
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
       // consumo.setIdConsumo(rs.getInt("idConsumo"));
        consumo.setNumUsuario(rs.getString("numUsuario"));
        consumo.setPeriodo(rs.getInt("periodo"));
        consumo.setAnio(rs.getInt("anio"));
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
