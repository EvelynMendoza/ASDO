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
public class Couta {
      int ID_CUOTA;
    double PRECIO;
    String ANIO;

    public Couta() {
        
    }

    public Couta( double PRECIO, String ANIO) {
       // this.ID_CUOTA = ID_CUOTA;
        this.PRECIO = PRECIO;
        this.ANIO = ANIO;
    }
    

    public int getID_CUOTA() {
        return ID_CUOTA;
    }

    public void setID_CUOTA(int ID_CUOTA) {
        this.ID_CUOTA = ID_CUOTA;
    }

    public double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(double PRECIO) {
        this.PRECIO = PRECIO;
    }

    public String getANIO() {
        return ANIO;
    }

    public void setANIO(String ANIO) {
        this.ANIO = ANIO;
    }

    @Override
    public String toString() {
        return "Couta{" + "ID_CUOTA=" + ID_CUOTA + ", PRECIO=" + PRECIO + ", ANIO=" + ANIO + '}';
    }
    
    
    
}
