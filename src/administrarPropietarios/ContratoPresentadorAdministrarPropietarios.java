/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarPropietarios;

import java.util.List;
import modelos.Marca;
import modelos.Propietario;

/**
 *
 * @author utku35
 */
public interface ContratoPresentadorAdministrarPropietarios {
    
    public void iniciar();
    public void procesarOpcion(int opcion);
    public void crearPropietarioNuevo(String nombre, String apellido, int dni);
    public void eliminarPropietario(int indicePropietario);
    public List<Marca> getMarcas();
    public List<Propietario> getPropietarios();
    public void generarVehiculo(String dominio, String descripcion, String denominacion, Marca marca, String modelo, Propietario propietario);
    
}
