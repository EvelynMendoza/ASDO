/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author octavio
 */
public class consumo {

    //int idConsumo;
    int periodo;
    int anio;
    String numUsuario;
    double lecturaActual;
    double consumoMedidor;
    double precio;
    double importeConsumo;
    double coutaFija;
    double recargos;
    double cooperacion;
    double bonificaciones;
    double sanciones;
    double varios;
    double totalPagar;
    String fechaPAgo;
    String notas;
    String aviso;
    int status;

    public consumo() {

    }


    public String getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(String numUsuario) {
        this.numUsuario = numUsuario;
    }

    
    

    public double getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(double lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    public double getConsumoMedidor() {
        return consumoMedidor;
    }

    public void setConsumoMedidor(double consumoMedidor) {
        this.consumoMedidor = consumoMedidor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImporteConsumo() {
        return importeConsumo;
    }

    public void setImporteConsumo(double importeConsumo) {
        this.importeConsumo = importeConsumo;
    }

    public double getCoutaFija() {
        return coutaFija;
    }

    public void setCoutaFija(double coutaFija) {
        this.coutaFija = coutaFija;
    }

    public double getRecargos() {
        return recargos;
    }

    public void setRecargos(double recargos) {
        this.recargos = recargos;
    }

    public double getCooperacion() {
        return cooperacion;
    }

    public void setCooperacion(double cooperacion) {
        this.cooperacion = cooperacion;
    }

    public double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public double getSanciones() {
        return sanciones;
    }

    public void setSanciones(double sanciones) {
        this.sanciones = sanciones;
    }

    public double getVarios() {
        return varios;
    }

    public void setVarios(double varios) {
        this.varios = varios;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getFechaPAgo() {
        return fechaPAgo;
    }

    public void setFechaPAgo(String fechaPAgo) {
        this.fechaPAgo = fechaPAgo;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "consumo{" + "periodo=" + periodo + ", anio=" + anio + ", numUsuario=" + numUsuario + ", lecturaActual=" + lecturaActual + ", consumoMedidor=" + consumoMedidor + ", precio=" + precio + ", importeConsumo=" + importeConsumo + ", coutaFija=" + coutaFija + ", recargos=" + recargos + ", cooperacion=" + cooperacion + ", bonificaciones=" + bonificaciones + ", sanciones=" + sanciones + ", varios=" + varios + ", totalPagar=" + totalPagar + ", fechaPAgo=" + fechaPAgo + ", notas=" + notas + ", aviso=" + aviso + ", status=" + status + '}';
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


}
