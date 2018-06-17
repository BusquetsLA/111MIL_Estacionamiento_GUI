/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuCajero;

/**
 *
 * @author PC
 */
public class PresentadorMenuCajero implements ContratoPresentadorMenuCajero {
    private ContratoVistaMenuCajero vista;

    
    public PresentadorMenuCajero(ContratoVistaMenuCajero vista) {
        this.vista = vista;
    }
    
    
    public void iniciar() {
        this.vista.mostrarMenu();
    }
}
