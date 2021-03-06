/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelo.consumidores;

/**
 *
 * @author octavio
 */
public interface consumidoresDAO {
    void insertar(consumidores c) throws DAOException;
    void elimnar(int c)throws DAOException;
    void actualizar(consumidores c)throws DAOException;
    consumidores buscarConsumidor(int id)throws DAOException;
    consumidores buscarNconsumidor(int id)throws DAOException;
    consumidores obtenerNumusuario()throws DAOException;
    List<consumidores> buscarTodos()throws DAOException;
    List<consumidores> buscarNumUsuario()throws DAOException;
}
