/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuResponsableEstacionamiento;

import javafx.scene.Scene;

/**
 *
 * @author utku33
 */
public interface ContratoVistaMenuResponsableEstacionamiento {
    
    public void generarVista();
    public void mostrarMenu();
    public Scene getScene();
    public void lanzarCobroDeAbono();
    public void lanzarMenuEleccionAdministrador();
    public void lanzarAdministrarPropietarios();
    
}
