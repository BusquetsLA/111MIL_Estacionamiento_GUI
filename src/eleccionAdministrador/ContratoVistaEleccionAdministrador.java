/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionAdministrador;

import javafx.scene.Scene;
import proveedorAdministradores.ContratoProveedorAdministradores;

/**
 *
 * @author PC
 */
public interface ContratoVistaEleccionAdministrador {
 
    public void generarVista();
    public Scene getScene();
    public void mostrarIngresoDatosIncorrecto();
    public ContratoProveedorAdministradores getProveedorAdministradores();
    public void lanzarMenuResponsableEstacionamiento();
    public void lanzarMenuCajero();
    
}
