/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author utku35
 */
public class Ticket {
    private int numero;
    private Date fecha;
    private String nombreUsuario;
    private String apellidoUsuario;
    private final String denominacion = "ESTACIONAMIENTO UTN";
    private final String descripcion = "CREDITO PLAYA";
    private int dniUsuario;
    private float importe;
    private float saldo;
    private List<String> patentes;

    
    public Ticket(int numero, Date fecha, String nombreUsuario, String apellidoUsuario, int dniUsuario, float importe, float saldo, List<String> patentes) {
        this.numero = numero;
        this.fecha = fecha;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dniUsuario = dniUsuario;
        this.importe = importe;
        this.saldo = saldo;
        this.patentes = patentes;
    }

    
    public Ticket() {
    }
    
    
    private String generarNumero() {
        String numero = "";
        if(this.numero < 10) {
            numero = "000" + this.numero;
        }
        if(this.numero < 100 && this.numero >= 10) {
            numero = "00" + this.numero;
        }
        if(this.numero < 1000 && this.numero >= 100) {
            numero = "0" + this.numero;
        }
        
        return numero;
    }

    private String generarListaPatentes() {
        String retorno = "";
        
        for(String patente: this.patentes) {
            retorno += patente + " _ ";
        }
        
        return retorno;
    }
    
    
    @Override
    public String toString() {
        String retorno = "";
        
        retorno += "----------------------------------" + "\n" + this.denominacion + "\n" + "----------------------------------" + 
                "\n" + this.dniUsuario + "   " + this.apellidoUsuario + "  " + this.nombreUsuario + "\n" + "Ticket N  | Descripcion     | Importe" + "\n" + 
                "----------------------------------" + "\n" + this.generarNumero() + "      " + this.descripcion + "      " + this.importe + "\n" + 
                "----------------------------------" + "\n" + "Importe Total: " + this.importe + "\n" + "Patentes: " + this.generarListaPatentes() + "\n" + "Credito Acual Playa: " + this.saldo + 
                 "\n" + this.fecha;
        return retorno;
    }
}
