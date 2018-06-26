/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarPropietarios;

import java.util.ArrayList;
import java.util.List;
import modelos.AbonoPropietario;
import modelos.Marca;
import modelos.Modelo;
import modelos.Propietario;
import modelos.TipoVehiculo;
import modelos.Vehiculo;
import proveedorPropietarios.ContratoProveedorPropietarios;

/**
 *
 * @author utku35
 */
public class PresentadorAdministrarPropietarios implements ContratoPresentadorAdministrarPropietarios {
    private ContratoVistaAdministrarPropietarios vista;
    private ContratoProveedorPropietarios proveedor;
    private List<Propietario> propietarios;
    private List<AbonoPropietario> abonos;
    
    public PresentadorAdministrarPropietarios(ContratoVistaAdministrarPropietarios vista) {
        this.vista = vista;
        this.proveedor = this.vista.getProveedorPropietarios();
        this.propietarios = new ArrayList();
        this.abonos = new ArrayList();
        this.actualizarPropietariosYAbonos();
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
                this.actualizarPropietariosYAbonos();
                this.vista.mostrarPropietarios(this.propietarios, this.abonos);
                this.vista.mostrarMenu();
                break;
            case 3:
                this.actualizarPropietariosYAbonos();
                this.vista.mostrarPropietarios(this.propietarios, this.abonos);
                int cantPropietarios = this.proveedor.getPropietarios().keySet().size();
                this.vista.pedirEleccionPropietarioEliminar(cantPropietarios);
                break;
            case 4:
                System.out.println("No implementado");
                this.vista.mostrarMenu();
                break;
            case 5: 
                this.vista.pedirDatosNuevoVehiculo();
                this.vista.mostrarMenu();
                break;
            case 6:
                this.vista.lanzarMenuResponsableEstacionamiento();
                break;
            case 7:
                this.vista.mostrarFinDePrograma();
        }
    }
    
    private void actualizarPropietariosYAbonos() {
        this.propietarios.clear();
        this.abonos.clear();
        
        for(Propietario propietario: this.proveedor.getPropietarios().keySet()) {
            this.propietarios.add(propietario);
            if(this.proveedor.getPropietarios().get(propietario) == null) {
                AbonoPropietario abono = new AbonoPropietario();
                this.proveedor.getPropietarios().put(propietario, abono);
            }
            this.abonos.add(this.proveedor.getPropietarios().get(propietario));
        }
        
        System.out.println(this.propietarios.size());
        System.out.println(this.abonos.size());
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
    
    @Override
    public List<Marca> getMarcas() {
        Marca FIAT = Marca.FIAT;
        Marca AUDI = Marca.AUDI;
        Marca FORD = Marca.FORD;
        Marca PEUGEOT = Marca.PEUGEOT;
        Marca RENAULT = Marca.RENAULT;
        Marca TOYOTA = Marca.TOYOTA;
        Marca VOLKSWAGEN = Marca.VOLKSWAGEN;

        List<Marca> marcas = new ArrayList();
        marcas.add(FIAT);
        marcas.add(AUDI);
        marcas.add(FORD);
        marcas.add(PEUGEOT);
        marcas.add(RENAULT);
        marcas.add(TOYOTA);
        marcas.add(VOLKSWAGEN);
        
        return marcas;
    }
    
    
    @Override
    public List<Propietario> getPropietarios() {
        List<Propietario> propietarios = new ArrayList();
        
        for(Propietario prop : this.proveedor.getPropietarios().keySet()) {
            propietarios.add(prop);
        }
        return propietarios;
    }
    
    @Override
    public void generarVehiculo(String dominio, String descripcion, String denominacion, Marca marca, String modelo, Propietario propietario) {
        TipoVehiculo tipoNuevo = new TipoVehiculo(descripcion, denominacion);
        Modelo modeloNuevo = new Modelo(marca, modelo);
        Vehiculo vehiculoNuevo = new Vehiculo(dominio, tipoNuevo, modeloNuevo);
        System.out.println("Llego hasta aca");
        for(Propietario prop :this.proveedor.getPropietarios().keySet()) {
            if(propietario.equals(prop)) {
                prop.agregarVehiculo(vehiculoNuevo);
            }
        }
        
        
    }
    
    
}
