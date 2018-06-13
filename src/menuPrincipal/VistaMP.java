/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPrincipal;

import estacionamiento.ContratoControladorVistas;

/**
 *
 * @author utku33
 */
public class VistaMP implements ContratoVistaMP {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorMP presentador;

    
    public VistaMP(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorMP(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void mostrarMenu() {
        System.out.println("*** Menu Principal ***");
        System.out.println("1. Registrar cobro de abono de estacionamiento");
    }

    @Override
    public void lanzarCobroDeAbono() {
        this.controlador.lanzarCobroDeAbono();
    }
    
    
}
