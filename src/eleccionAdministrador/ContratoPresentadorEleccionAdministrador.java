/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionAdministrador;

/**
 *
 * @author PC
 */
public interface ContratoPresentadorEleccionAdministrador {
    
    public void iniciar();
    public void procesarOpcion(int opcion);
    public void validarIngresoResponsableEstacionamiento(String nombreUsuario, String clave);
    public void validarIngresoCajero(String nombreUsuario, String clave);
    
}
