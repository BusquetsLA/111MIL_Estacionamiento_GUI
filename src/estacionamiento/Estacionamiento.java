/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import cobroAbono.ContratoVistaCobroAbono;
import cobroAbono.VistaCobroAbono;
import menuPrincipal.ContratoVistaMenuPrincipal;
import menuPrincipal.VistaMenuPrincipal;
import proveedor.ContratoFalsoProveedor;
import proveedor.FalsoProveedor;

/**
 *
 * @author utku33
 */
public class Estacionamiento implements ContratoControladorVistas {
    private ContratoVistaMenuPrincipal vistaMP;
    private ContratoVistaCobroAbono vistaCA;
    private ContratoFalsoProveedor proveedor;
    
    public Estacionamiento() {
        this.proveedor = new FalsoProveedor();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento estacionamientoUTN = new Estacionamiento();
        estacionamientoUTN.lanzarMenuPrincipal();
    }
    
    @Override
    public void lanzarMenuPrincipal() {
        this.vistaMP = new VistaMenuPrincipal(this);
    }

    @Override
    public void lanzarCobroDeAbono() {
        this.vistaCA = new VistaCobroAbono(this);
    }
    
    @Override
    public ContratoFalsoProveedor getProveedor() {
        return this.proveedor;
    }
    
}
