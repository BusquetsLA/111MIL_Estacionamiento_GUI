/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroAbono;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static metodosUtiles.Metodos.generarIncremento;
import modelos.AbonoPropietario;
import modelos.Propietario;
import modelos.Ticket;
import modelos.Vehiculo;
import proveedorPropietarios.ContratoProveedorPropietarios;

/**
 *
 * @author utku33
 */
public class PresentadorCobroAbono implements ContratoPresentadorCobroAbono {
    private ContratoVistaCobroAbono vista;
    private ContratoProveedorPropietarios proveedorPropietarios;
    private int dni;
    private Propietario propietario;
    private AbonoPropietario abonoPropietario;

    
    public PresentadorCobroAbono(ContratoVistaCobroAbono vista) {
        this.vista = vista;
        this.proveedorPropietarios = this.vista.getProveedor();
    }
    
    
    @Override
    public void iniciar() {
        this.vista.generarVista();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void procesarDNI(int dni) {
        Propietario propietarioDNI = this.verificarDNI(dni);
        this.dni = dni;
        if(propietarioDNI != null) {
            this.propietario = propietarioDNI;
            if(this.proveedorPropietarios.getPropietarios().get(this.propietario) == null) {
                this.abonoPropietario = new AbonoPropietario();
                this.proveedorPropietarios.getPropietarios().put(this.propietario, this.abonoPropietario);
            }
            else {
                this.abonoPropietario = this.proveedorPropietarios.getPropietarios().get(this.propietario);
            }
            this.vista.mostrarDatosPropietario(this.propietario, this.abonoPropietario);
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
        for(Propietario propietario : this.proveedorPropietarios.getPropietarios().keySet()) {
            if(dni == propietario.getDni()) {
                return propietario;
            }
        }
        return null;
    }
    
    private void actualizarMonto(float monto) {
        float saldoAnterior = this.abonoPropietario.getSaldoActual();
        this.abonoPropietario.agregarSaldo(monto);
        float saldoActual = this.abonoPropietario.getSaldoActual();
        this.abonoPropietario.setFecha(new Date());
        this.abonoPropietario.setNroComprobante(generarIncremento());
        this.abonoPropietario.setMontoCobrado(monto);
        
        String nombre = this.propietario.getNombre();
        String apellido = this.propietario.getApellido();
        int dni = this.propietario.getDni();
        int nroComprobante = generarIncremento();
        Date fecha = new Date();
        List<String> patentes = new ArrayList();
        for(Vehiculo vehiculo : this.propietario.getVehiculos()) {
            patentes.add(vehiculo.getDominio());
        }
        
        Ticket ticket1 = new Ticket(nroComprobante, fecha, nombre, apellido, dni, monto, saldoActual, patentes);

        this.vista.mostrarAcreditacionSaldos(saldoAnterior, saldoActual, monto);
        this.vista.imprimirTicket(ticket1);
        this.vista.lanzarMenuPrincipal();
    }
    
    
}
