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
   String numUsuario;
   String numMedidor;
   String nombreCompleto;
   String direccion;
    String manzana;
   String telefono;

    public consumidores(String numUsuario, String numMedidor, String nombreCompleto, String direccion, String manzana, String telefono) {
        this.numUsuario = numUsuario;
        this.numMedidor = numMedidor;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.manzana = manzana;
        this.telefono = telefono;
    }

   
    public consumidores() {
    }

   
    public int getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(int idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public String getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(String numUsuario) {
        this.numUsuario = numUsuario;
    }

    public String getNumMedidor() {
        return numMedidor;
    }

    public void setNumMedidor(String numMedidor) {
        this.numMedidor = numMedidor;
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

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "consumidores{" + "idConsumidor=" + idConsumidor + ", numUsuario=" + numUsuario + ", numMedidor=" + numMedidor + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", manzana=" + manzana + ", telefono=" + telefono + '}';
    }   
}
