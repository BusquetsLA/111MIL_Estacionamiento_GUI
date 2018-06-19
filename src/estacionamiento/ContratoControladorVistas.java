/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import proveedorAdministradores.ContratoProveedorAdministradores;
import proveedorPropietarios.ContratoProveedorPropietarios;

/**
 *
 * @author utku33
 */
public interface ContratoControladorVistas {
    
    public ContratoProveedorPropietarios getProveedorPropietarios();
    public ContratoProveedorAdministradores getProveedorAdministradores();
    
    public void lanzarMenuResponsableEstacionamiento();
    public void lanzarCobroDeAbono();
    public void lanzarEleccionAdministrador();
    public void lanzarMenuCajero();
    public void lanzarAdministrarPropietarios();
    
}
