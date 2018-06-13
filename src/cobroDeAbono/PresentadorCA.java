/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroDeAbono;

/**
 *
 * @author utku33
 */
public class PresentadorCA implements ContratoPresentadorCA {
    private ContratoVistaCA vista;

    
    public PresentadorCA(ContratoVistaCA vista) {
        this.vista = vista;
    }
    
    
    @Override
    public void iniciar() {
        this.vista.mostrarVista();
    }
}
