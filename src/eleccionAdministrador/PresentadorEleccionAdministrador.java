/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionAdministrador;

import modelos.Administrador;
import proveedorAdministradores.ContratoProveedorAdministradores;

/**
 *
 * @author PC
 */
public class PresentadorEleccionAdministrador implements ContratoPresentadorEleccionAdministrador {
    private ContratoVistaEleccionAdministrador vista;
    private ContratoProveedorAdministradores proveedorAdministradores;

    
    public PresentadorEleccionAdministrador(ContratoVistaEleccionAdministrador vista) {
        this.vista = vista;
        this.proveedorAdministradores = this.vista.getProveedorAdministradores();
    }
    
    
    @Override
    public void iniciar() {
        this.vista.mostrarMenu();
    }
    
    @Override
    public void procesarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                this.vista.pedirDatosIngresoResponsableEstacionamiento();
                break;
            case 2:
                this.vista.pedirDatosIngresoCajero();
                break;
            case 3:
                this.vista.mostrarFinDePrograma();
                break;    
        }
    }
    
    @Override
    public void validarIngresoResponsableEstacionamiento(String nombreUsuario, String clave) {
        boolean nombreUsuarioCorrecto = false;
        boolean claveCorrecta = false;
        Administrador administrador = null;
        
        for(Administrador admin: this.proveedorAdministradores.getResponsablesEstacionamiento()) {
            if(nombreUsuario.equals(admin.getNombreUsuario())) {
                administrador = admin;
                nombreUsuarioCorrecto = true;
            }
        }
        
        if(nombreUsuarioCorrecto == true) {
            if(clave.equals(administrador.getClave())) {
                claveCorrecta = true;
            }
        }
        
        if(claveCorrecta == true && nombreUsuarioCorrecto == true) {
            this.vista.lanzarMenuResponsableEstacionamiento();
        }
        else {
            this.vista.mostrarIngresoDatosIncorrecto();
            this.vista.mostrarMenu();
        }
    }
    
    @Override
    public void validarIngresoCajero(String nombreUsuario, String clave) {
        boolean nombreUsuarioCorrecto = false;
        boolean claveCorrecta = false;
        Administrador administrador = null;
        
        for(Administrador admin: this.proveedorAdministradores.getCajeros()) {
            if(nombreUsuario.equals(admin.getNombreUsuario())) {
                administrador = admin;
                nombreUsuarioCorrecto = true;
            }
        }
        
        if(nombreUsuarioCorrecto == true) {
            if(clave.equals(administrador.getClave())) {
                claveCorrecta = true;
            }
        }
        
        if(claveCorrecta == true && nombreUsuarioCorrecto == true) {
            this.vista.lanzarMenuCajero();
        }
        else {
            this.vista.mostrarIngresoDatosIncorrecto();
            this.vista.mostrarMenu();
        }
    }
}
