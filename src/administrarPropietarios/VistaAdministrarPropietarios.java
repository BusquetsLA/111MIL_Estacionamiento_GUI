/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarPropietarios;

import estacionamiento.ContratoControladorVistas;
import java.util.List;
import java.util.Scanner;
import static metodosUtiles.Metodos.validarNumero;
import modelos.AbonoPropietario;
import modelos.Marca;
import modelos.Propietario;
import proveedorPropietarios.ContratoProveedorPropietarios;

/**
 *
 * @author utku35
 */
public class VistaAdministrarPropietarios implements ContratoVistaAdministrarPropietarios {
    ContratoControladorVistas controlador;
    ContratoPresentadorAdministrarPropietarios presentador;

    
    public VistaAdministrarPropietarios(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorAdministrarPropietarios(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void mostrarMenu() {
        System.out.println("*** Administracion de Propietarios ***");
        System.out.println("Ingrese una de las opciones");
        System.out.println("1. Registrar nuevo propietario");
        System.out.println("2. Mostrar detalles de propietarios");
        System.out.println("3. Borrar Propietario");
        System.out.println("4. Actualizar Propietario");
        System.out.println("5. Registrar nuevo vehiculo");
        System.out.println("6. Volver a menu de Responsable de Estacionamiento");
        System.out.println("7. Salir");
        
        int opcion = validarNumero(1, 7);
        this.presentador.procesarOpcion(opcion);
    }
    
    @Override
    public void pedirDatosPropietarioNuevo() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Debe ingresar los datos del nuevo propietario");
        System.out.print("Ingrese nombre: ");
        String nombre = scan.next();
        System.out.print("Ingrese apellido: ");
        String apellido = scan.next();
        System.out.print("Ingrese dni: ");
        int dni = validarNumero(10000000, 99999999);
        
        presentador.crearPropietarioNuevo(nombre, apellido, dni);
    }
    
    @Override
    public ContratoProveedorPropietarios getProveedorPropietarios() {
        return this.controlador.getProveedorPropietarios();
    }
    
    @Override
    public void mostrarPropietarioCreado(Propietario propietario) {
        System.out.println("-----------------------------");
        System.out.println("Nuevo propietario creado:");
        System.out.println("Nombre: " + propietario.getNombre());
        System.out.println("Apellido: " + propietario.getApellido());
        System.out.println("DNI: " + propietario.getDni());
        System.out.println("-----------------------------");
    }
    
    @Override
    public void mostrarPropietarios(List<Propietario> propietarios, List<AbonoPropietario> abonos) {
        String detalles = "";
        int i = 0;
        for(Propietario propietario: propietarios) {
            detalles += i + ":  " + propietario.toString() + "Saldo Actual Abono: " + abonos.get(i).getSaldoActual() + "\n";
            i++;
        }
        
        System.out.println(detalles);
    }
    
    @Override
    public void pedirEleccionPropietarioEliminar(int cantPropietarios) {
        System.out.println("Ingree un numero correspondiente al propietario a eliminar");
        int indicePropietario = validarNumero(0, cantPropietarios - 1);
        
        this.presentador.eliminarPropietario(indicePropietario);
    }
    
    @Override
    public int pedirConfirmacionEliminacion(Propietario propietarioAEliminar) {
        System.out.println("Propietario a eliminar: ");
        System.out.println("Nombre: " + propietarioAEliminar.getNombre());
        System.out.println("Apellido: " + propietarioAEliminar.getApellido());
        System.out.println("DNI: " + propietarioAEliminar.getDni());
        
        System.out.println("Confirma eliminar al propietario. Ingrese opcion");
        System.out.println("1. Si");
        System.out.println("2. No");
        
        int opcion = validarNumero(1, 2);
        return opcion;
    }
    
    @Override
    public void pedirDatosNuevoVehiculo() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese los datos del nuevo vehiculo");
        System.out.print("Ingrese dominio (patente):");
        String dominio = scan.nextLine();
        
        System.out.print("Ingrese la descripcion (Ej.: Utilitario 6 puertas ...):");
        String descripcion = scan.nextLine();
        
        System.out.print("Ingrese denominacion del vehiculo (Ej.: Utilitario):");
        String denominacion = scan.nextLine();
        
        System.out.println("Ingrese un numero para elegir marca:");
        List<Marca> marcas = this.presentador.getMarcas();     
        int i = 0;
        for(Marca marca: marcas) {
            System.out.println(i + ": " + marca.toString());
            i++;
        }
        int marcaElegida = validarNumero(0, marcas.size() - 1);
        Marca marca = marcas.get(marcaElegida);
        
        System.out.println("Ingrese modelo: ");
        String modelo = scan.next();
        
        System.out.println("Ingrese propietario a quien pertenece nuevo vehiculo:");
        List<Propietario> propietarios = this.presentador.getPropietarios();
        i = 0;
        for(Propietario propietario : propietarios) {
            System.out.println(i + ": " + propietario.getNombre() + " " + propietario.getApellido() + "\n");
            i++;
        }
        int propietarioElegido = validarNumero(0, propietarios.size() - 1);
        Propietario propietario = propietarios.get(propietarioElegido);
        
        this.presentador.generarVehiculo(dominio, descripcion, denominacion, marca, modelo, propietario);
    }
    
    
    @Override
    public void lanzarMenuResponsableEstacionamiento() {
        this.controlador.lanzarMenuResponsableEstacionamiento();
    }
    
    @Override
    public void mostrarFinDePrograma() {
        System.out.println("El programa ha terminado");
    }
}
