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
     void insertar(consumo c);
    void elimnar(consumo c);
    void actualizar(consumo c);
    consumo buscarConsumidor(int id);
    List<consumo> buscarTodos();
    
}
