/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionAdministrador;

import estacionamiento.ContratoControladorVistas;
import java.util.Scanner;
import static metodosUtiles.Metodos.validarNumero;
import proveedorAdministradores.ContratoProveedorAdministradores;

/**
 *
 * @author PC
 */
public class VistaEleccionAdministrador implements ContratoVistaEleccionAdministrador {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorEleccionAdministrador presentador;

    
    public VistaEleccionAdministrador(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorEleccionAdministrador(this);
        this.presentador.iniciar();
    }
    
    @Override
    public ContratoProveedorAdministradores getProveedorAdministradores() {
        return this.controlador.getProveedorAdministradores();
    }
    
    @Override
    public void mostrarMenu() {
        System.out.println("");
        System.out.println("*** Estacionamiento UTN ***");
        System.out.println("Ingrese una de las opciones ...");
        System.out.println("1. Ingresar como Responsable de Estacionamiento");
        System.out.println("2. Ingresar como cajero");
        System.out.println("3. Salir");
        
        int opcionIngresada = validarNumero(1, 3);
        this.presentador.procesarOpcion(opcionIngresada);
    }
    
    
    @Override
    public void pedirDatosIngresoResponsableEstacionamiento() {
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;
        String clave;
        
        System.out.println(" - - > Ingreso: Responsable de Estacionamiento");
        System.out.println("Ingrese nombre de usuario");
        System.out.print("> ");
        nombreUsuario = scan.next();
        System.out.println("Ingrese clave");
        System.out.print("> ");
        clave = scan.next();
        
        this.presentador.validarIngresoResponsableEstacionamiento(nombreUsuario, clave);
    }
    
    @Override
    public void pedirDatosIngresoCajero() {
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;
        String clave;
        
        System.out.println(" - - > Ingreso: Cajero");
        System.out.println("Ingrese nombre de usuario");
        System.out.print("> ");
        nombreUsuario = scan.next();
        System.out.println("Ingrese clave");
        System.out.print("> ");
        clave = scan.next();
        
        this.presentador.validarIngresoCajero(nombreUsuario, clave);
    }
    
    @Override
    public void mostrarFinDePrograma() {
        System.out.println("El programa ha terminado");
    }
    
    @Override
    public void mostrarIngresoDatosIncorrecto() {
        System.out.println("Usuario o contraseña invalidos ...");
    }
    
    @Override
    public void lanzarMenuResponsableEstacionamiento() {
        this.controlador.lanzarMenuResponsableEstacionamiento();
    }
    
    @Override
    public void lanzarMenuCajero() {
        this.controlador.lanzarMenuCajero();
    }
}
