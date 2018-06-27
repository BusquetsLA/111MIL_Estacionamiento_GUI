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
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import menuResponsableEstacionamiento.ContratoVistaMenuResponsableEstacionamiento;

/**
 *
 * @author utku33
 */
public class Estacionamiento extends Application implements ContratoControladorVistas {
    private ContratoProveedorPropietarios proveedorPropietarios;
    private ContratoProveedorAdministradores proveedorAdministradores;
    
    private ContratoVistaMenuResponsableEstacionamiento vistaMenuResponsableEstacionamiento = null;
    private ContratoVistaCobroAbono vistaCobroAbono = null;
    private ContratoVistaEleccionAdministrador vistaEleccionAdministrador = null;
    private ContratoVistaMenuCajero vistaMenuCajero = null;
    private ContratoVistaAdministrarPropietarios vistaAdministrarPropietarios = null;
    
    private Scene scene;
    private Stage primaryStage;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.proveedorPropietarios = new ProveedorPropietarios();
        this.proveedorAdministradores = new ProveedorAdministradores();
        
        //this.lanzarEleccionAdministrador();
        this.lanzarMenuResponsableEstacionamiento();
                
        this.primaryStage.setTitle("Estacionamiento");
        this.primaryStage.setResizable(false);
        this.primaryStage.show();
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
        if(this.vistaEleccionAdministrador == null) {
            this.vistaEleccionAdministrador = new VistaEleccionAdministrador(this);
        }
        this.primaryStage.setScene(vistaEleccionAdministrador.getScene());
    }
    
    @Override
    public void lanzarMenuResponsableEstacionamiento() {
        if(this.vistaMenuResponsableEstacionamiento == null) {
            this.vistaMenuResponsableEstacionamiento = new VistaMenuResponsableEstacionamiento(this);
        }
        this.primaryStage.setScene(vistaMenuResponsableEstacionamiento.getScene());
    }

    @Override
    public void lanzarCobroDeAbono() {
        if(this.vistaCobroAbono == null) {
            this.vistaCobroAbono = new VistaCobroAbono(this);
        }
        this.primaryStage.setScene(vistaCobroAbono.getScene());
    }
    
    @Override
    public void lanzarMenuCajero() {
        this.vistaMenuCajero = new VistaMenuCajero(this);
    }
    
    @Override
    public void lanzarAdministrarPropietarios() {
        this.vistaAdministrarPropietarios = new VistaAdministrarPropietarios(this);
    }
}
