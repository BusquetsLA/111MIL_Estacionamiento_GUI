/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author utku33
 */
public class Propietario {
    private String apellido;
    private int dni;
    private String nombre;

    
    public Propietario(String apellido, int dni, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
    }
    
    
    public void acreditarMonto() {
        
    }
    
    public void calcularSaldoActual() {
        
    }
    
    public void conocerVehiculo() {
        
    }
    
    public void cuantosIngresosPeriodo() {
        
    }

    public void obtenerVehiculosPropietario() {
        
    }
    
    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
