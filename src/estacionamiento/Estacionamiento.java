/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import cobroDeAbono.ContratoVistaCA;
import cobroDeAbono.VistaCA;
import menuPrincipal.ContratoVistaMP;
import menuPrincipal.VistaMP;

/**
 *
 * @author utku33
 */
public class Estacionamiento implements ContratoControladorVistas {
    private ContratoVistaMP vistaMP;
    private ContratoVistaCA vistaCA;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    @Override
    public void lanzarMP() {
        this.vistaMP = new VistaMP(this);
    }

    @Override
    public void lanzarCobroDeAbono() {
        this.vistaCA = new VistaCA(this);
    }
    
}
