/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroDeAbono;

import estacionamiento.ContratoControladorVistas;

/**
 *
 * @author utku33
 */
public class VistaCA implements ContratoVistaCA {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorCA presentador;

    
    public VistaCA(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorCA(this);
        this.presentador.iniciar();
    }
}
