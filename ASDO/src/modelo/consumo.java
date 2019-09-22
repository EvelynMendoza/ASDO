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
public class consumo {
int idConsumo;
int idUsuario;
String periodo;
String fechaInicio;
String fechaIfin;
double mCubicos;
double pConsumo;
double pTotal;
String status;

    public consumo(int idConsumo, int idUsuario, String periodo, String fechaInicio, String fechaIfin, double mCubicos, double pConsumo, double pTotal, String status) {
        this.idConsumo = idConsumo;
        this.idUsuario = idUsuario;
        this.periodo = periodo;
        this.fechaInicio = fechaInicio;
        this.fechaIfin = fechaIfin;
        this.mCubicos = mCubicos;
        this.pConsumo = pConsumo;
        this.pTotal = pTotal;
        this.status = status;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaIfin() {
        return fechaIfin;
    }

    public void setFechaIfin(String fechaIfin) {
        this.fechaIfin = fechaIfin;
    }

    public double getmCubicos() {
        return mCubicos;
    }

    public void setmCubicos(double mCubicos) {
        this.mCubicos = mCubicos;
    }

    public double getpConsumo() {
        return pConsumo;
    }

    public void setpConsumo(double pConsumo) {
        this.pConsumo = pConsumo;
    }

    public double getpTotal() {
        return pTotal;
    }

    public void setpTotal(double pTotal) {
        this.pTotal = pTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "consumo{" + "idConsumo=" + idConsumo + ", idUsuario=" + idUsuario + ", periodo=" + periodo + ", fechaInicio=" + fechaInicio + ", fechaIfin=" + fechaIfin + ", mCubicos=" + mCubicos + ", pConsumo=" + pConsumo + ", pTotal=" + pTotal + ", status=" + status + '}';
    }


}
