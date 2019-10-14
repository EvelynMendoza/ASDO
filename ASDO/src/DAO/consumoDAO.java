/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelo.consumidores;
import modelo.consumo;

/**
 *
 * @author octavio
 */
public interface consumoDAO {
    void insertar(consumo c) throws DAOException;
    void elimnar(int IdUser, int periodo, int anio) throws DAOException;
    void actualizar(consumo c)throws DAOException;
    consumo buscarPerantConsumo(int IdUser, int periodo, int anio)throws DAOException;
    consumo buscarConsumo(int IdUser, int periodo, int anio)throws DAOException;
    List<consumo> buscarTodos()throws DAOException;
<<<<<<< HEAD
    List<consumo> buscarConsumoPorUser(int IdUser, int anio)throws DAOException;
    
=======
>>>>>>> 3f20d56261d47cf4ccc6b409dfc607f1c4cfd837
}
