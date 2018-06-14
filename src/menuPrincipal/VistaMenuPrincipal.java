/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPrincipal;

import estacionamiento.ContratoControladorVistas;
import static metodosUtiles.Metodos.validarNumero;

/**
 *
 * @author utku33
 */
public class VistaMenuPrincipal implements ContratoVistaMenuPrincipal {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorMenuPrincipal presentador;

    
    public VistaMenuPrincipal(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorMenuPrincipal(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void mostrarMenu() {
        System.out.println("*** Menu Principal ***");
        System.out.println("Ingrese una de las opciones...");
        System.out.println("1. Registrar cobro de abono");
        System.out.println("2. Opciones de Administrador");
        
        int opcionSeleccionada = validarNumero(0, 3, "Ingrese un numero:");
        this.presentador.procesarOpcion(opcionSeleccionada);
    }

    @Override
    public void lanzarCobroDeAbono() {
        this.controlador.lanzarCobroDeAbono();
    }
    
    @Override
    public void lanzarAdministracion() {
        // this.controlador.lanzarAdministracion();
        System.out.println("No implementado aun ...");
    }
}
