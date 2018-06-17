/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedorAdministradores;

import java.util.ArrayList;
import java.util.List;
import modelos.Administrador;

/**
 *
 * @author PC
 */
public class ProveedorAdministradores implements ContratoProveedorAdministradores {
    private List<Administrador> responsablesEstacionamiento;
    private List<Administrador> cajeros;

    
    public ProveedorAdministradores() {
        this.responsablesEstacionamiento = new ArrayList();
        this.setearResponsablesEstacionamiento();
        this.cajeros = new ArrayList();
        this.setearCajeros();
    }
    
    /**
     * Metodos privados
     */
    private void setearResponsablesEstacionamiento() {
        Administrador santiago = new Administrador("Santiago", "Salamandri", 54466556, "qwerty", "santiago1111");
        Administrador esteban = new Administrador("Esteban", "Morales", 78321456, "qwerty", "esteban1111");
        
        this.responsablesEstacionamiento.add(santiago);
        this.responsablesEstacionamiento.add(esteban);
        
    }
    
    private void setearCajeros() {
        Administrador jose = new Administrador("Jose", "Beas", 40683129, "Jose1234,.-", "jose1248");
        
        this.cajeros.add(jose);
    }
    
    /**
     * Metodos publicos
     * @return 
     */
    @Override
    public void agregarCajero(String nombre, String apellido, int dni, String clave, String nombreUsuario) {
        Administrador nuevoAdmin = new Administrador(nombre, apellido, dni, clave, nombreUsuario);
        this.cajeros.add(nuevoAdmin);
    }
    
    @Override
    public void agregarResponsableEstacionamiento(String nombre, String apellido, int dni, String clave, String nombreUsuario) {
        Administrador nuevoAdmin = new Administrador(nombre, apellido, dni, clave, nombreUsuario);
        this.responsablesEstacionamiento.add(nuevoAdmin);
    }
    
    @Override
    public List<Administrador> getCajeros() {
        return this.cajeros;
    }
    
    @Override
    public List<Administrador> getResponsablesEstacionamiento() {
        return this.responsablesEstacionamiento;
    }
}
