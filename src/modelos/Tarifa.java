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
    private float montoIngresado;
    private boolean esDeAbono;

    
    public Tarifa(int cantidadIngresosSinSaldo, Date fecha, float montoIngresado, boolean esDeAbono) {
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
        this.fecha = fecha;
        this.montoIngresado = montoIngresado;
        this.esDeAbono = esDeAbono;
    }
    
    
    public void conocerTipoVehiculo() {
        
    }
}
