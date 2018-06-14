/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroAbono;

import estacionamiento.ContratoControladorVistas;
import java.util.Scanner;
import static metodosUtiles.Metodos.validarNumero;
import modelos.Propietario;
import proveedor.ContratoFalsoProveedor;

/**
 *
 * @author utku33
 */
public class VistaCobroAbono implements ContratoVistaCobroAbono {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorCobroAbono presentador;

    
    public VistaCobroAbono(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorCobroAbono(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void mostrarVista() {
        System.out.println("*** COBRO DE ABONO DE ESTACIONAMIENTO ***");
        System.out.println("Ingrese DNI:");
        int opcionIngresada = validarNumero(9999999, 100000000, "Ingrese el DNI del propietario: ");
        this.presentador.procesarDNI(opcionIngresada);
    }
    
    @Override
    public ContratoFalsoProveedor getProveedor() {
        return this.controlador.getProveedor();
    }
    
    @Override
    public void solicitarMonto() {
        System.out.println("Ingrese monto a acreditar: ");
        Scanner scan = new Scanner(System.in);
        float monto = scan.nextFloat();
        
        this.presentador.procesarMonto(monto);
    }
    
    @Override
    public int pedirConfirmacion(float monto) {
        System.out.println("Monto acreditado: " + monto);
        System.out.println("¿Confirma el monto acreditado?");
        System.out.println("1. Si");
        System.out.println("2. No");
        
        int opcion = validarNumero(0, 3, "");
        return opcion;
    }
    
    @Override
    public void mostrarAcreditacionSaldos(float saldoAnterior, float saldoActual, float monto) {
        System.out.println(" ******* ");
        System.out.println("Saldo anterior: " + saldoAnterior);
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println("Monto acreditado: " + monto);
        System.out.println(" ******* ");
    }

    @Override
    public void mostrarDatosPropietario(Propietario propietario) {
        System.out.println("*** Datos del propietario ***");
        System.out.println("Nombre: " + propietario.getNombre());
        System.out.println("Apellido: " + propietario.getApellido());
        System.out.println("DNI: " + propietario.getDni());
    }
    
    @Override
    public void mostrarOperacionCancelada() {
        System.out.println("La operacion ha sido cancelada");
    }
    
    @Override
    public void mostrarPropietarioInexistente() {
        System.out.println("No existe ningun propietario registrado con este DNI");
        System.out.println("Debe crear un propietario para poder acreditar un monto.");
    }
    
    @Override
    public void lanzarMenuPrincipal() {
        this.controlador.lanzarMenuPrincipal();
    }
}
