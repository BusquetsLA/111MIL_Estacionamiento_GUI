/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuResponsableEstacionamiento;

import estacionamiento.ContratoControladorVistas;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.StageStyle;

/**
 *
 * @author utku33
 */
public class VistaMenuResponsableEstacionamiento implements ContratoVistaMenuResponsableEstacionamiento {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorMenuResponsableEstacionamiento presentador;
    private Scene scene;

    
    public VistaMenuResponsableEstacionamiento(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorMenuResponsableEstacionamiento(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void generarVista() {
        /**
         * CENTER
         */
        // Elementos de contenedor secundario
        List<Button> botones = new ArrayList();
        Button cobroDeAbono = new Button("Cobro de Abono");
        Button administracionPropietarios = new Button("Administracion de Propietarios");
        Button volverInicioSesion = new Button("Volver a Inicio de Sesion");
        botones.add(cobroDeAbono);
        botones.add(administracionPropietarios);
        botones.add(volverInicioSesion);
        
        for(Button boton : botones) {
            boton.setMinSize(200, 40);
        }
        cobroDeAbono.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            lanzarCobroDeAbono();
        }
        });
        
        administracionPropietarios.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            lanzarAdministrarPropietarios();
        }
        });
        
        volverInicioSesion.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            lanzarMenuEleccionAdministrador();
        }
        });
        
        
        // Caracteristicas del contenedor secundario
        VBox contenedorSecundario = new VBox();
        contenedorSecundario.setPadding(new Insets(10));
        contenedorSecundario.setSpacing(20);
        contenedorSecundario.setAlignment(Pos.CENTER);
        
        for(Button boton : botones) {
            contenedorSecundario.getChildren().add(boton);
        }
        
        
        /**
         * Principal
         */
        BorderPane panel = new BorderPane(contenedorSecundario);
        this.scene = new Scene(panel, 800, 700);
    }
    
    @Override
    public Scene getScene() {
        return this.scene;
    }
    
    @Override
    public void lanzarCobroDeAbono() {
        this.controlador.lanzarCobroDeAbono();
    }
    
    @Override
    public void lanzarMenuEleccionAdministrador() {
        this.controlador.lanzarEleccionAdministrador();
    }
    
    @Override
    public void lanzarAdministrarPropietarios() {
        // this.controlador.lanzarAdministrarPropietarios();
        
        Alert errorDeIngreso = new Alert(Alert.AlertType.WARNING);
        errorDeIngreso.setTitle("Error de ejecucion");
        errorDeIngreso.setHeaderText("Error de opcion");
        errorDeIngreso.setContentText("Esta opcion aun no ha sido implementada en el programa." + "\n" + "Ingrese otra opcion por favor.");
        errorDeIngreso.initStyle(StageStyle.UTILITY);
        java.awt.Toolkit.getDefaultToolkit().beep();
        errorDeIngreso.showAndWait();
        
    }

    @Override
    public void mostrarMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
