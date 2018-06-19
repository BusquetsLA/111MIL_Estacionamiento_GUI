/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import administrarPropietarios.ContratoVistaAdministrarPropietarios;
import administrarPropietarios.VistaAdministrarPropietarios;
import cobroAbono.ContratoVistaCobroAbono;
import cobroAbono.VistaCobroAbono;
import menuCajero.ContratoVistaMenuCajero;
import menuCajero.VistaMenuCajero;
import eleccionAdministrador.VistaEleccionAdministrador;
import menuResponsableEstacionamiento.VistaMenuResponsableEstacionamiento;
import proveedorAdministradores.ContratoProveedorAdministradores;
import proveedorAdministradores.ProveedorAdministradores;
import proveedorPropietarios.ProveedorPropietarios;
import proveedorPropietarios.ContratoProveedorPropietarios;
import eleccionAdministrador.ContratoVistaEleccionAdministrador;
import menuResponsableEstacionamiento.ContratoVistaMenuResponsableEstacionamiento;

/**
 *
 * @author utku33
 */
public class Estacionamiento implements ContratoControladorVistas {
    private ContratoProveedorPropietarios proveedorPropietarios;
    private ContratoProveedorAdministradores proveedorAdministradores;
    
    private ContratoVistaMenuResponsableEstacionamiento vistaMenuPrincipal;
    private ContratoVistaCobroAbono vistaCobroAbono;
    private ContratoVistaEleccionAdministrador vistaEleccionTipoAdministrador;
    private ContratoVistaMenuCajero vistaMenuCajero;
    private ContratoVistaAdministrarPropietarios vistaAdministrarPropietarios;
    
    
    public Estacionamiento() {
        this.proveedorPropietarios = new ProveedorPropietarios();
        this.proveedorAdministradores = new ProveedorAdministradores();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento estacionamientoUTN = new Estacionamiento();
        estacionamientoUTN.lanzarEleccionAdministrador();
    }
    
    @Override
    public ContratoProveedorPropietarios getProveedorPropietarios() {
        return this.proveedorPropietarios;
    }
    
    @Override
    public ContratoProveedorAdministradores getProveedorAdministradores() {
        return this.proveedorAdministradores;
    }
    
    @Override
    public void lanzarEleccionAdministrador() {
        this.vistaEleccionTipoAdministrador = new VistaEleccionAdministrador(this);
    }
    
    @Override
    public void lanzarMenuResponsableEstacionamiento() {
        this.vistaMenuPrincipal = new VistaMenuResponsableEstacionamiento(this);
    }

    @Override
    public void lanzarCobroDeAbono() {
        this.vistaCobroAbono = new VistaCobroAbono(this);
    }
    
    @Override
    public void lanzarMenuCajero() {
        this.vistaMenuCajero = new VistaMenuCajero(this);
    }
    
    public void lanzarAdministrarPropietarios() {
        this.vistaAdministrarPropietarios = new VistaAdministrarPropietarios(this);
    }
}
