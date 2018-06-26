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
        if(dni == 0) {
            throw new IllegalArgumentException();
        }
        return this.ingresos/cantidad;
    }

    public List<Vehiculo> getVehiculos() {
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

    public int getIngresos() {
        return ingresos;
    }

    public AbonoPropietario getAbonoPropietario() {
        return abonoPropietario;
    }
    
    public void setApellido(String apellido) {
        if(apellido == null) {
            throw new NullPointerException();
        }
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        if(dni == 0) {
            throw new IllegalArgumentException();
        }
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        if(nombre == null) {
            throw new NullPointerException();
        }
        this.nombre = nombre;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if(vehiculo == null) {
            throw new NullPointerException();
        }
        this.vehiculos.add(vehiculo);
    }
    
    @Override
    public String toString() {
        String retorno = "Nombre: " + this.nombre + " Apellido: " + this.apellido + " DNI: " + this.dni + " Vehiculos: " + "\n";
        int i = 0;
        for(Vehiculo vehiculo: vehiculos) {
            retorno += vehiculo.toString() + "\n";
        }
        return retorno;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Propietario) {
            Propietario nuevo = (Propietario) o;
            
            if(this.nombre.equals(nuevo.getNombre()) && this.apellido.equals(nuevo.getApellido()) && this.dni == nuevo.getDni()
                    && this.ingresos == nuevo.getIngresos() && this.abonoPropietario.equals(nuevo.getAbonoPropietario()) ) {
                return true;
            }
        }
        return false;
    }
}
