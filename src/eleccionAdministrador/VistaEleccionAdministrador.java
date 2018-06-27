/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionAdministrador;

import estacionamiento.ContratoControladorVistas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.StageStyle;
import proveedorAdministradores.ContratoProveedorAdministradores;

/**
 *
 * @author PC
 */
public class VistaEleccionAdministrador implements ContratoVistaEleccionAdministrador {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorEleccionAdministrador presentador;
    private Scene scene;

    
    public VistaEleccionAdministrador(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorEleccionAdministrador(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public ContratoProveedorAdministradores getProveedorAdministradores() {
        return this.controlador.getProveedorAdministradores();
    }
    
    @Override
    public void generarVista() {
        /**
         * CENTER - Contenedor Secundario
         */
        // Elementos del contenedor secundario
        String urlUser = "/imagenes/user.png";
        ImageView imagenUser = new ImageView(urlUser);
        
        Label titulo = new Label("Ingreso de Usuario");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
        titulo.setAlignment(Pos.CENTER);
        
        Label ingresoUsuario = new Label("Ingrese usuario");
        ingresoUsuario.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        ingresoUsuario.setAlignment(Pos.CENTER);
        
        TextField username = new TextField("");
        username.setMaxSize(200, 20);
        
        Label ingresoContraseña = new Label("Ingrese contraseña");
        ingresoContraseña.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        ingresoContraseña.setAlignment(Pos.CENTER);
        
        TextField password = new TextField("");
        password.setMaxSize(200, 20);
        
        Button login = new Button("Ingresar");
        login.setMinSize(200, 30);
        login.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            comprobarUsuario(username.getText(), password.getText());
        }
        });
        
        
        // Creacion del contenedor secundario
        VBox contenedorSecundario = new VBox();
        contenedorSecundario.setPadding(new Insets(10));
        contenedorSecundario.setSpacing(15);
        contenedorSecundario.setAlignment(Pos.CENTER);
        
        contenedorSecundario.getChildren().add(imagenUser);
        contenedorSecundario.getChildren().add(titulo);
        contenedorSecundario.getChildren().add(ingresoUsuario);
        contenedorSecundario.getChildren().add(username);
        contenedorSecundario.getChildren().add(ingresoContraseña);
        contenedorSecundario.getChildren().add(password);
        contenedorSecundario.getChildren().add(login);
        
        /**
         * Principal
         */
        BorderPane panel = new BorderPane();
        panel.setCenter(contenedorSecundario);
        this.scene = new Scene(panel, 800, 700);
    }
    
    private void comprobarUsuario(String usuario, String contraseña) {
        this.presentador.comprobarUsuario(usuario, contraseña);
    }
    
    @Override
    public void mostrarIngresoDatosIncorrecto() {
        Alert errorDeIngreso = new Alert(AlertType.ERROR);
        errorDeIngreso.setTitle("Error de Ingreso");
        errorDeIngreso.setHeaderText("Ingreso de datos incorrecto");
        errorDeIngreso.setContentText("Ha habido un error debido a un ingreso de datos incorrecto, del usuario o la contraseña." + "\n" + "Por favor, intente nuevamente.");
        errorDeIngreso.initStyle(StageStyle.UTILITY);
        java.awt.Toolkit.getDefaultToolkit().beep();
        errorDeIngreso.showAndWait();
    }
    
    @Override
    public Scene getScene() {
        return this.scene;
    }
    
    @Override
    public void lanzarMenuResponsableEstacionamiento() {
        this.controlador.lanzarMenuResponsableEstacionamiento();
    }
    
    @Override
    public void lanzarMenuCajero() {
        this.controlador.lanzarMenuCajero();
    }
}
