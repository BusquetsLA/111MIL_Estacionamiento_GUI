/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionAdministrador;

import proveedorAdministradores.ContratoProveedorAdministradores;

/**
 *
 * @author PC
 */
public interface ContratoVistaEleccionAdministrador {
 
    public ContratoProveedorAdministradores getProveedorAdministradores();
    public void mostrarMenu();
    public void pedirDatosIngresoResponsableEstacionamiento();
    public void pedirDatosIngresoCajero();
    public void mostrarFinDePrograma();
    public void mostrarIngresoDatosIncorrecto();
    public void lanzarMenuResponsableEstacionamiento();
    public void lanzarMenuCajero();
    
}
