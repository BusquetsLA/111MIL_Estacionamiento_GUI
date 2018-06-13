/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPrincipal;

/**
 *
 * @author utku33
 */
public class PresentadorMP implements ContratoPresentadorMP {
    private ContratoVistaMP vista;

    
    public PresentadorMP(ContratoVistaMP vista) {
        this.vista = vista;
    }
    
    
    @Override
    public void iniciar() {
        this.vista.mostrarMenu();
    }
    
    public void procesarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                this.vista.lanzarCobroDeAbono();
                break;
        }
    }
}
