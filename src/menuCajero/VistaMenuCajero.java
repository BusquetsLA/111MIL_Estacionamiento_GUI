/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuCajero;

import estacionamiento.ContratoControladorVistas;

/**
 *
 * @author PC
 */
public class VistaMenuCajero implements ContratoVistaMenuCajero {
    ContratoControladorVistas controlador;
    ContratoPresentadorMenuCajero presentador;

    
    public VistaMenuCajero(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorMenuCajero(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void mostrarMenu() {
        System.out.println("Falta Implementar ...");
        this.controlador.lanzarEleccionAdministrador();
    }
}
