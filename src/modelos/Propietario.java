/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utku33
 */
public class Propietario {
    private String apellido;
    private int dni;
    private String nombre;
    // Atributos agregados
    private AbonoPropietario abonoPropietario;
    private List<Vehiculo> vehiculos;
    private int ingresos;

    
    public Propietario(String nombre, String apellido, int dni) {
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
        this.abonoPropietario = new AbonoPropietario();
        this.vehiculos = new ArrayList();
    }
    
    
    public void acreditarMonto(float monto) {
        this.abonoPropietario.setMontoCobrado(monto);
    }
    
    public float calcularSaldoActual() {
        return this.abonoPropietario.getSaldoActual();
    }
    
    public String conocerVehiculo(Vehiculo vehiculo) {
        String retorno = "";
        for(Vehiculo vehiculoPropietario: vehiculos) {
            if(vehiculoPropietario.equals(vehiculo)) {
                retorno = vehiculoPropietario.conocerModelo();
            }
        }
        
        return retorno;
    }
    
    public float cuantosIngresosPeriodo(int cantidad) {
        return this.ingresos/cantidad;
    }

    public List<Vehiculo> obtenerVehiculosPropietario() {
        return this.vehiculos;
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

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " DNI: " + this.dni;
    }
}
