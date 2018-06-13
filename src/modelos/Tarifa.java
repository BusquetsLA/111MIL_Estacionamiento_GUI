/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author utku33
 */
public class Tarifa {
    private int cantidadIngresosSinSaldo;
    private Date fecha;
    private float montoIngreso;
    private boolean esDeAbono;

    
    public Tarifa(int cantidadIngresosSinSaldo, Date fecha, float montoIngreso, boolean esDeAbono) {
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
        this.fecha = fecha;
        this.montoIngreso = montoIngreso;
        this.esDeAbono = esDeAbono;
    }

    public Tarifa() {
    }
    
    /**
     * METODO SIN IMPLEMENTAR
     */
    public void conocerTipoVehiculo() {
        
    }

    @Override
    public String toString() {
        return ( "Fecha: " + this.fecha + "\n" + "Monto Ingreso: " + this.montoIngreso + "\n" + "Abono: " + this.esDeAbono);
    }
}
