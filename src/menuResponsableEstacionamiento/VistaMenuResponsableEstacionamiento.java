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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.StageStyle;
import static metodosUtiles.Metodos.validarNumero;

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
        // Elementos de contenedores terciarios
        String opcionCobroDeAbono = "Ingresar a esta opcion le permite cobrar un importe de abono, requiriendose un dni, importe, y que el propietario exista.";
        String opcionAdministracionPropietarios = "Ingresar a esta opcion le permite ver detalles, agregar, eliminar, y/o actualizar propietarios o vehiculos de los mismos.";
        String opcionInicioSesion = "Ingresar a esta opcion le permite ingresar con un usuario diferente.";
        
        
        List<TextArea> labels = new ArrayList();
        TextArea infoCobroDeAbono = new TextArea(opcionCobroDeAbono);
        TextArea infoAdministracionPropietarios = new TextArea(opcionAdministracionPropietarios);
        TextArea infoVolverAInicioSesion = new TextArea(opcionInicioSesion);
        labels.add(infoCobroDeAbono);
        labels.add(infoAdministracionPropietarios);
        labels.add(infoVolverAInicioSesion);
        
        for(TextArea label : labels) {
            label.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
            label.setMaxWidth(450);
            label.setEditable(false);
        }
        
        
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
        
        
        // Elementos del contenedor Secundario
        // Caracteristicas de los contenedores terciarios
        List<HBox> contenedores = new ArrayList();
        HBox contenedorTerciario1 = new HBox();
        HBox contenedorTerciario2 = new HBox();
        HBox contenedorTerciario3 = new HBox();
        
        contenedores.add(contenedorTerciario1);
        contenedores.add(contenedorTerciario2);
        contenedores.add(contenedorTerciario3);
        
        for(HBox contenedor : contenedores) {
            contenedor.setPadding(new Insets(10));
            contenedor.setSpacing(50);
            contenedor.setAlignment(Pos.CENTER);
            contenedor.setStyle("-fx-padding: 10;" + 
                                "-fx-border-style: solid inside;" + 
                                "-fx-border-width: 5;" +
                                "-fx-border-insets: 5;" + 
                                "-fx-border-radius: 5;" + 
                                "-fx-border-color: #614B4B;");
        }
        
        for(int i = 0 ; i < contenedores.size() ; i++) {
            contenedores.get(i).getChildren().add(labels.get(i));
            contenedores.get(i).getChildren().add(botones.get(i));
        }
        
        
        // Caracteristicas del contenedor secundario
        VBox contenedorSecundario = new VBox();
        contenedorSecundario.setPadding(new Insets(10));
        contenedorSecundario.setSpacing(20);
        contenedorSecundario.setAlignment(Pos.CENTER);
        
        for(HBox contenedor : contenedores) {
            contenedorSecundario.getChildren().add(contenedor);
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
    public void mostrarIngresoDatosIncorrecto() {
        Alert errorDeIngreso = new Alert(Alert.AlertType.ERROR);
        errorDeIngreso.setTitle("Error de Ingreso");
        errorDeIngreso.setHeaderText("Ingreso de datos incorrecto");
        errorDeIngreso.setContentText("Ha habido un error debido a un ingreso de datos incorrecto, del usuario o la contraseña." + "\n" + "Por favor, intente nuevamente.");
        errorDeIngreso.initStyle(StageStyle.UTILITY);
        java.awt.Toolkit.getDefaultToolkit().beep();
        errorDeIngreso.showAndWait();
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
        this.controlador.lanzarAdministrarPropietarios();
    }
    
    
    
    
    
    
    
    
    
    @Override
    public void mostrarMenu() {
        System.out.println("");
        System.out.println("*** Menu Principal Responsable de Estacionamiento ***");
        System.out.println("Ingrese una de las opciones...");
        System.out.println("1. Registrar cobro de abono");
        System.out.println("2. Administrar propietarios");
        System.out.println("3. Volver a Eleccion de Administrador");
        System.out.println("4. Salir");
        
        int opcionSeleccionada = validarNumero(1, 4);
        this.presentador.procesarOpcion(opcionSeleccionada);
    }

    
    @Override
    public void mostrarFinDePrograma() {
        System.out.println("El programa ha terminado");
    }
    
}
