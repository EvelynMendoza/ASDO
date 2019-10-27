/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelo.Couta;

/**
 *
 * @author octavio
 */
public interface CoutaDAO {
       void insertar(Couta c) throws DAOException;
    void elimnar(int c)throws DAOException;
    void actualizar(Couta c)throws DAOException;
    Couta buscarCoua()throws DAOException;
    List<Couta> buscarTodos()throws DAOException;
}
