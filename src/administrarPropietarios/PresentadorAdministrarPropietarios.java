/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarPropietarios;

import estacionamiento.ContratoControladorVistas;
import java.util.ArrayList;
import java.util.List;
import modelos.AbonoPropietario;
import modelos.Propietario;
import proveedorPropietarios.ContratoProveedorPropietarios;

/**
 *
 * @author utku35
 */
public class PresentadorAdministrarPropietarios implements ContratoPresentadorAdministrarPropietarios {
    private ContratoVistaAdministrarPropietarios vista;
    private ContratoProveedorPropietarios proveedor;
    
    public PresentadorAdministrarPropietarios(ContratoVistaAdministrarPropietarios vista) {
        this.vista = vista;
        this.proveedor = this.vista.getProveedorPropietarios();
    }
    
    
    @Override
    public void iniciar() {
        this.vista.mostrarMenu();
    }
    
    @Override
    public void procesarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                this.vista.pedirDatosPropietarioNuevo();
                break;
            case 2:
                this.vista.mostrarPropietarios(this.proveedor);
                this.vista.mostrarMenu();
                break;
            case 3:
                this.vista.mostrarPropietarios(proveedor);
                int cantPropietarios = this.proveedor.getPropietarios().keySet().size();
                this.vista.pedirEleccionPropietarioEliminar(cantPropietarios);
                break;
            case 4:
                System.out.println("No implementado");
                break;
            case 5: 
                this.vista.pedirDatosNuevoVehiculo();
                break;
        }
    }
    
    @Override
    public void crearPropietarioNuevo(String nombre, String apellido, int dni) {
        Propietario nuevoPropietario = new Propietario(nombre, apellido, dni);
        this.proveedor.getPropietarios().put(nuevoPropietario, null);
        this.vista.mostrarPropietarioCreado(nuevoPropietario);
        this.vista.mostrarMenu();
    }
    
    @Override
    public void eliminarPropietario(int indicePropietario) {
        List<Propietario> propietarios = new ArrayList();
        for(Propietario propietario : this.proveedor.getPropietarios().keySet()) {
            propietarios.add(propietario);
        }
        Propietario propietarioAEliminar = propietarios.get(indicePropietario);
        int eliminacion = this.vista.pedirConfirmacionEliminacion(propietarioAEliminar);
        if(eliminacion == 1) {
            this.proveedor.getPropietarios().remove(propietarioAEliminar);
        }
        this.vista.mostrarMenu();
    }
}
