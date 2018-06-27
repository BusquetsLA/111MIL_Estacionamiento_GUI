/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuResponsableEstacionamiento;

/**
 *
 * @author utku33
 */
public class PresentadorMenuResponsableEstacionamiento implements ContratoPresentadorMenuResponsableEstacionamiento {
    private ContratoVistaMenuResponsableEstacionamiento vista;

    
    public PresentadorMenuResponsableEstacionamiento(ContratoVistaMenuResponsableEstacionamiento vista) {
        this.vista = vista;
    }
    
    
    @Override
    public void iniciar() {
        this.vista.generarVista();
    }
    
}
