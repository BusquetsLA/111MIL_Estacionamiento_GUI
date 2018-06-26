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
        String retorno = "Fecha: " + this.fecha + "\n" + "\n" + 
                "Nro comprobante" + this.nroComprobante;
    
        return retorno;
    }

    public void mostrarFechaYHora() {
        System.out.println("Fecha: " + this.fecha);
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
    
    public void agregarSaldo(float monto) {
        this.saldoActual += monto;
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

    public List<Ingreso> getIngresos() {
        return ingresos;
    }
    
    @Override
    public String toString() {
        String retorno = "Fecha: " + this.fecha + " MontoCobrado: " + this.montoCobrado + " Nro Comprobante: " + this.nroComprobante + " Saldo Actual: " + this.saldoActual + " Ingresos: " + "\n";
        
        for(Ingreso ing: this.ingresos) {
            retorno += ing.toString() + "\n";
        }
        
        return retorno;
    }
    
}
