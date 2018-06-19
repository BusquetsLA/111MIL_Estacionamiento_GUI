/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarPropietarios;

import modelos.Propietario;
import proveedorPropietarios.ContratoProveedorPropietarios;

/**
 *
 * @author utku35
 */
public interface ContratoVistaAdministrarPropietarios {
    
    public void mostrarMenu();
    public void pedirDatosPropietarioNuevo();
    public ContratoProveedorPropietarios getProveedorPropietarios();
    public void mostrarPropietarioCreado(Propietario propietario);
    public void mostrarPropietarios(ContratoProveedorPropietarios proveedor);
    public void pedirEleccionPropietarioEliminar(int cantPropietarios);
    public int pedirConfirmacionEliminacion(Propietario propietarioAEliminar);
    public void pedirDatosNuevoVehiculo();
    
}
