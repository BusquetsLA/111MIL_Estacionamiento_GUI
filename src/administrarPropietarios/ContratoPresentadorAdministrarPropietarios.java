/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarPropietarios;

/**
 *
 * @author utku35
 */
public interface ContratoPresentadorAdministrarPropietarios {
    
    public void iniciar();
    public void procesarOpcion(int opcion);
    public void crearPropietarioNuevo(String nombre, String apellido, int dni);
    public void eliminarPropietario(int indicePropietario);
    
}
