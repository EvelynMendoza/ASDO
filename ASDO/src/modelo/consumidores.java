/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author octavio
 */
public class consumidores {
   int idConsumidor;
   String nombreCompleto;
   String direccion;
   String telefono;
   int numMedidor;

    public consumidores(String nombreCompleto, String direccion, String telefono, int numMedidor) {
        
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numMedidor = numMedidor;
    }

//    public consumidores(String nombreCompleto) {
//        this.nombreCompleto = nombreCompleto;
//    }
    
    public consumidores() {
        
    }
   
   

    public int getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(int idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumMedidor() {
        return numMedidor;
    }

    public void setNumMedidor(int numMedidor) {
        this.numMedidor = numMedidor;
    }

    @Override
    public String toString() {
        return "consumidores{" + "idConsumidor=" + idConsumidor + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", telefono=" + telefono + ", numMedidor=" + numMedidor + '}';
    }
   
   
   
    
}
