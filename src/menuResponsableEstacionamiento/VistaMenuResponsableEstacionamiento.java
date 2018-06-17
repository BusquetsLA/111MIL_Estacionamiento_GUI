/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuResponsableEstacionamiento;

import estacionamiento.ContratoControladorVistas;
import static metodosUtiles.Metodos.validarNumero;

/**
 *
 * @author utku33
 */
public class VistaMenuResponsableEstacionamiento implements ContratoVistaMenuResponsableEstacionamiento {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorMenuResponsableEstacionamiento presentador;

    
    public VistaMenuResponsableEstacionamiento(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorMenuResponsableEstacionamiento(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void mostrarMenu() {
        System.out.println("");
        System.out.println("*** Menu Principal Responsable de Estacionamiento ***");
        System.out.println("Ingrese una de las opciones...");
        System.out.println("1. Registrar cobro de abono");
        System.out.println("2. Administrar propietarios");
        System.out.println("3. Administrar vehiculos");
        System.out.println("4. Volver a Eleccion de Administrador");
        System.out.println("5. Salir");
        
        int opcionSeleccionada = validarNumero(1, 5);
        this.presentador.procesarOpcion(opcionSeleccionada);
    }

    @Override
    public void lanzarCobroDeAbono() {
        this.controlador.lanzarCobroDeAbono();
    }
    
    @Override
    public void lanzarMenuEleccionAdministrador() {
        this.controlador.lanzarEleccionAdministrador();
    }
    
    @Override
    public void mostrarFinDePrograma() {
        System.out.println("El programa ha terminado");
    }
    
    @Override
    public void lanzarAdministrarPropietarios() {
        System.out.println("Falta Implementar ...");
        this.controlador.lanzarMenuResponsableEstacionamiento();
    }
    
    public void lanzarAdministrarVehiculos() {
        System.out.println("Falta Implementar ...");
        this.controlador.lanzarMenuResponsableEstacionamiento();
    }
}
