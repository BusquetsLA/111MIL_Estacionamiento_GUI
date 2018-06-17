/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedorAdministradores;

import java.util.List;
import modelos.Administrador;

/**
 *
 * @author PC
 */
public interface ContratoProveedorAdministradores {
    
    public List<Administrador> getCajeros();
    public List<Administrador> getResponsablesEstacionamiento();
    public void agregarCajero(String nombre, String apellido, int dni, String clave, String nombreUsuario);
    public void agregarResponsableEstacionamiento(String nombre, String apellido, int dni, String clave, String nombreUsuario);
    
}
