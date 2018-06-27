/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroAbono;

import javafx.scene.Scene;
import modelos.AbonoPropietario;
import modelos.Propietario;
import modelos.Ticket;
import proveedorPropietarios.ContratoProveedorPropietarios;

/**
 *
 * @author utku33
 */
public interface ContratoVistaCobroAbono {
 
    public void generarVista();
    public Scene getScene();
    public void campoDniIncorrecto();
    
    
    
    
    
    
    public void mostrarVista();
    public ContratoProveedorPropietarios getProveedor();
    public void solicitarMonto();
    public int pedirConfirmacion(float monto);
    public void mostrarAcreditacionSaldos(float saldoAnterior, float saldoActual, float monto);
    public void mostrarDatosPropietario(Propietario propietario, AbonoPropietario abono);
    public void mostrarOperacionCancelada();
    public void mostrarPropietarioInexistente();
    public void lanzarMenuResponsableEstacionamiento();
    public void imprimirTicket(Ticket ticket);
    
}
