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
        this.vista.mostrarMenu();
    }
    
    @Override
    public void procesarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                this.vista.lanzarCobroDeAbono();
                break;
            case 2:
                this.vista.lanzarAdministrarPropietarios();
                break;
            case 3:
                this.vista.lanzarAdministrarVehiculos();
                break;
            case 4:
                this.vista.lanzarMenuEleccionAdministrador();
                break;
            case 5:
                this.vista.mostrarFinDePrograma();
                break;
        }
    }
}
