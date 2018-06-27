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
        this.vista.generarVista();
    }
    
    @Override
    public void comprobarUsuario(String usuario, String contraseña) {
        // Se comprueba que sea un responsable de estacionamiento
        boolean nombreUsuarioCorrecto = false;
        boolean claveCorrecta = false;
        Administrador administrador = null;
        
        for(Administrador admin: this.proveedorAdministradores.getResponsablesEstacionamiento()) {
            if(usuario.equals(admin.getNombreUsuario())) {
                administrador = admin;
                nombreUsuarioCorrecto = true;
            }
        }
        
        if(nombreUsuarioCorrecto == true) {
            if(contraseña.equals(administrador.getClave())) {
                claveCorrecta = true;
            }
        }
        
        if(claveCorrecta == true && nombreUsuarioCorrecto == true) {
            this.vista.lanzarMenuResponsableEstacionamiento();
            return;
        }
        
        
        // Se comprueba que sea un cajero/a
        for(Administrador admin: this.proveedorAdministradores.getCajeros()) {
            if(usuario.equals(admin.getNombreUsuario())) {
                administrador = admin;
                nombreUsuarioCorrecto = true;
            }
        }
        
        if(nombreUsuarioCorrecto == true) {
            if(contraseña.equals(administrador.getClave())) {
                claveCorrecta = true;
            }
        }
        
        if(claveCorrecta == true && nombreUsuarioCorrecto == true) {
            System.out.println("MENU DE CAJERO/A NO IMPLEMENTADO AUN!!");
            // this.vista.lanzarMenuCajero();
            return;
        }
        
        this.vista.mostrarIngresoDatosIncorrecto();
    }
    
}
