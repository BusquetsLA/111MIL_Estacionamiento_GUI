/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author utku33
 */
public class AbonoPropietario {
    private Date fecha;
    private Date hora;
    private float montoCobrado;
    private int nroComprobante;
    private float saldoActual;
    // Atributos agregados
    private List<Ingreso> ingresos;

    
    public AbonoPropietario(Date fecha, float montoCobrado, int nroComprobante, float saldoActual) {
        this.fecha = fecha;
        this.montoCobrado = montoCobrado;
        this.nroComprobante = nroComprobante;
        this.saldoActual = saldoActual;
        this.ingresos = new ArrayList();
    }

    public AbonoPropietario() {
        this.ingresos = new ArrayList();
    }
    
    
    
    public String conocerIngreso() {
        String retorno = "Fecha: " + this.fecha + "\n" + "Hora: " + this.hora + "\n" + 
                "Nro comprobante" + this.nroComprobante;
    
        return retorno;
    }

    public void mostrarFechaYHora() {
        System.out.println("Fecha: " + this.fecha + "\n" + "Hora: " + this.hora);
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMontoCobrado(float montoCobrado) {
        this.montoCobrado = montoCobrado;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getMontoCobrado() {
        return montoCobrado;
    }

    public int getNroComprobante() {
        return nroComprobante;
    }

    public float getSaldoActual() {
        return saldoActual;
    }
    
    public Date getHora() {
        return hora;
    }
}
