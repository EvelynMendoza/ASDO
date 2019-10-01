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
    void elimnar(int c) throws DAOException;
    void actualizar(consumo c)throws DAOException;
    consumo buscarConsumo(int id)throws DAOException;
    List<consumo> buscarTodos()throws DAOException;
    
}
