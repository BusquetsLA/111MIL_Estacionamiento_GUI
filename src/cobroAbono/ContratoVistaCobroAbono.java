/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroAbono;

import modelos.Propietario;
import proveedor.ContratoFalsoProveedor;

/**
 *
 * @author utku33
 */
public interface ContratoVistaCobroAbono {
 
    public void mostrarVista();
    public ContratoFalsoProveedor getProveedor();
    public void solicitarMonto();
    public int pedirConfirmacion(float monto);
    public void mostrarAcreditacionSaldos(float saldoAnterior, float saldoActual, float monto);
    public void mostrarDatosPropietario(Propietario propietario);
    public void mostrarOperacionCancelada();
    public void mostrarPropietarioInexistente();
    public void lanzarMenuPrincipal();
    
}
