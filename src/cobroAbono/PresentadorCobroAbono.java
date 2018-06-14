/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroAbono;

import modelos.AbonoPropietario;
import modelos.Propietario;
import proveedor.ContratoFalsoProveedor;

/**
 *
 * @author utku33
 */
public class PresentadorCobroAbono implements ContratoPresentadorCobroAbono {
    private ContratoVistaCobroAbono vista;
    private ContratoFalsoProveedor proveedor;
    private int dni;
    private Propietario propietario;

    
    public PresentadorCobroAbono(ContratoVistaCobroAbono vista) {
        this.vista = vista;
        this.proveedor = this.vista.getProveedor();
    }
    
    
    @Override
    public void iniciar() {
        this.vista.mostrarVista();
    }
    
    @Override
    public void procesarDNI(int dni) {
        Propietario propietarioDNI = verificarDNI(dni);
        this.dni = dni;
        if(propietario != null) {
            this.propietario = propietarioDNI;
            this.vista.mostrarDatosPropietario(this.propietario);
            this.vista.solicitarMonto();
        }
        else {
            this.vista.mostrarPropietarioInexistente();
            this.vista.lanzarMenuPrincipal();
        }
        
    }
    
    @Override
    public void procesarMonto(float monto) {
        int verificador = this.vista.pedirConfirmacion(monto);
        // Caso 1: Confirmado
        switch(verificador) {
            case 1:
                this.actualizarMonto(monto);
                break;
            case 2:
                this.vista.mostrarOperacionCancelada();
                this.vista.lanzarMenuPrincipal();
                break;
        }
        
    }
    
    private Propietario verificarDNI(int dni) {
        return this.proveedor.comprobarDNI(dni);
    }
    
    private void actualizarMonto(float monto) {
        AbonoPropietario abonoPropietario = this.proveedor.getPropietarios().get(this.propietario);
        
        float saldoAnterior = abonoPropietario.getSaldoActual();
        abonoPropietario.agregarSaldo(monto);
        float saldoActual = abonoPropietario.getSaldoActual();

        this.vista.mostrarAcreditacionSaldos(saldoAnterior, saldoActual, monto);
        
    }
    
    
}
