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
    // Atributos agregados
    private Porton porton;
    private Tarifa tarifa;
    private Usuario usuario;
    private Vehiculo vehiculo;

    
    public Ingreso(String codigoBarra, Date fechaEgreso, Date fechaIngreso, Date horaEgreso, Date horaIngreso, float monto, int nroTicket, String observacion) {
        this.codigoBarra = codigoBarra;
        this.fechaEgreso = fechaEgreso;
        this.fechaIngreso = fechaIngreso;
        this.horaEgreso = horaEgreso;
        this.horaIngreso = horaIngreso;
        this.monto = monto;
        this.nroTicket = nroTicket;
        this.observacion = observacion;
        this.porton = new Porton();
        this.tarifa = new Tarifa();
        this.usuario = new Usuario();
        this.vehiculo = new Vehiculo();
    }
    
    
    public String conocerPorton() {
        return this.porton.toString();
    }
    
    public String conocerTarifa() {
        return this.tarifa.toString();
    }
    
    public String conocerUsuario() {
        return this.usuario.toString();
    }
    
    public String conocerVehiculo() {
        return this.vehiculo.conocerModelo();
    }
    
    /**
     * METODO SIN IMPLEMENTAR
     */
    public void determinarNroIngreso() {
        
    }
}
