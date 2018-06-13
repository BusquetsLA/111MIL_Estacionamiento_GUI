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
public class Ingreso {
    private String codigoBarra;
    private Date fechaEgreso;
    private Date fechaIngreso;
    private Date horaEgreso;
    private Date horaIngreso;
    private float monto;
    private int nroTicket;
    private String observacion;

    
    public Ingreso(String codigoBarra, Date fechaEgreso, Date fechaIngreso, Date horaEgreso, Date horaIngreso, float monto, int nroTicket, String observacion) {
        this.codigoBarra = codigoBarra;
        this.fechaEgreso = fechaEgreso;
        this.fechaIngreso = fechaIngreso;
        this.horaEgreso = horaEgreso;
        this.horaIngreso = horaIngreso;
        this.monto = monto;
        this.nroTicket = nroTicket;
        this.observacion = observacion;
    }
    
    
    public void conocerPorton() {
        
    }
    
    public void conocerTarifa() {
        
    }
    
    public void conocerUsuario() {
        
    }
    
    public void conocerVehiculo() {
        
    }
    
    public void determinarNroIngreso() {
        
    }
}
