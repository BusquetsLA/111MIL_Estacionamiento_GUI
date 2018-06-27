/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroAbono;

import estacionamiento.ContratoControladorVistas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import static metodosUtiles.Metodos.validarNumero;
import modelos.AbonoPropietario;
import modelos.Propietario;
import modelos.Ticket;
import proveedorPropietarios.ContratoProveedorPropietarios;

/**
 *
 * @author utku33
 */
public class VistaCobroAbono implements ContratoVistaCobroAbono {
    private ContratoControladorVistas controlador;
    private ContratoPresentadorCobroAbono presentador;
    private Scene scene;

    
    public VistaCobroAbono(ContratoControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorCobroAbono(this);
        this.presentador.iniciar();
    }
    
    
    @Override
    public void generarVista() {
        /**
         * BOTTOM
         */
        // Elementos de contenedor inferior
        Button volverMenuRE = new Button("Volver");
        Button guardar = new Button("Guardar");
        Button cancelar = new Button("Cancelar");
        
        // Contenedor inferior
        HBox contenedorInferior = new HBox();
        contenedorInferior.setPadding(new Insets(10));
        contenedorInferior.setSpacing(15);
        contenedorInferior.setAlignment(Pos.BASELINE_RIGHT);
        
        contenedorInferior.getChildren().add(volverMenuRE);
        contenedorInferior.getChildren().add(guardar);
        contenedorInferior.getChildren().add(cancelar);
        
        /**
         * CENTER
         */
        // Elementos de contenedores terciarios
        // Fila 1
        Label nombreLugar = new Label("UNIVERSIDAD TECNOLOGICA");
        nombreLugar.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        
        // Fila 2
        Label fechaActual = new Label("Fecha Actual: ");
        Label fecha = new Label(new Date().toString());
        
        // Fila 3
        Label buscarPersona = new Label("Buscar Persona");
        buscarPersona.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
       
        // Fila 4
        Label dni = new Label("DNI:");
        TextField campoDNI = new TextField();
        String urlImagenBuscador = "/imagenes/buscador.png";
        ImageView imagenBuscador = new ImageView(urlImagenBuscador);
        imagenBuscador.setFitWidth(40);
        imagenBuscador.setFitHeight(40);
        Button buscar = new Button("", imagenBuscador);
        
        // Fila 5
        Label propietario = new Label("Propietario");
        propietario.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        
        // Fila 6
        Label apellido = new Label("Apellido: ");
        TextField campoApellido = new TextField();
        
        // Fila 7
        Label nombre = new Label("Nombre: ");
        TextField campoNombre = new TextField();
        
        // Fila 8
        Label estadoCuenta = new Label("Estado de cuenta");
        estadoCuenta.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        
        // Fila 9
        Label saldoActual = new Label("Saldo Actual: ");
        Label campoSaldoActual = new Label("242");
        
        // Fila 10
        Label ingresarImporte = new Label("Ingresar importe: ");
        TextField campoIngresarImporte = new TextField();
    
        
        // Contenedores terciarios
        // Elementos de contenedor secundario
        List<HBox> filas = new ArrayList();
        HBox fila1 = new HBox();
        
        HBox fila2 = new HBox();
        
        //
        HBox fila3 = new HBox();
        HBox fila4 = new HBox();
        VBox contenedorAuxiliar1 = new VBox();
        contenedorAuxiliar1.getChildren().add(fila3);
        contenedorAuxiliar1.getChildren().add(fila4);
        contenedorAuxiliar1.setAlignment(Pos.CENTER);
        contenedorAuxiliar1.setStyle("-fx-padding: 10;" + 
                                        "-fx-border-style: solid inside;" + 
                                        "-fx-border-width: 5;" +
                                        "-fx-border-insets: 5;" + 
                                        "-fx-border-radius: 5;" + 
                                        "-fx-border-color: #614B4B;");
        //
        
        
        //
        HBox fila5 = new HBox();
        HBox fila6 = new HBox();
        HBox fila7 = new HBox();
        VBox contenedorAuxiliar2 = new VBox();
        contenedorAuxiliar2.getChildren().add(fila5);
        contenedorAuxiliar2.getChildren().add(fila6);
        contenedorAuxiliar2.getChildren().add(fila7);
        contenedorAuxiliar2.setAlignment(Pos.CENTER);
        contenedorAuxiliar2.setStyle("-fx-padding: 10;" + 
                                        "-fx-border-style: solid inside;" + 
                                        "-fx-border-width: 5;" +
                                        "-fx-border-insets: 5;" + 
                                        "-fx-border-radius: 5;" + 
                                        "-fx-border-color: #614B4B;");
        //
        
        //
        HBox fila8 = new HBox();
        HBox fila9 = new HBox();
        HBox fila10 = new HBox();
        VBox contenedorAuxiliar3 = new VBox();
        contenedorAuxiliar3.getChildren().add(fila8);
        contenedorAuxiliar3.getChildren().add(fila9);
        contenedorAuxiliar3.getChildren().add(fila10);
        contenedorAuxiliar3.setAlignment(Pos.CENTER);
        contenedorAuxiliar3.setStyle("-fx-padding: 10;" + 
                                        "-fx-border-style: solid inside;" + 
                                        "-fx-border-width: 5;" +
                                        "-fx-border-insets: 5;" + 
                                        "-fx-border-radius: 5;" + 
                                        "-fx-border-color: #614B4B;");
        //
        
        filas.add(fila1);
        filas.add(fila2);
        filas.add(fila3);
        filas.add(fila4);
        filas.add(fila5);
        filas.add(fila6);
        filas.add(fila7);
        filas.add(fila8);
        filas.add(fila9);
        filas.add(fila10);
        
        for(HBox fila : filas) {
            fila.setPadding(new Insets(10));
            fila.setSpacing(15);
            fila.setAlignment(Pos.BASELINE_LEFT);
        }
        
        fila1.getChildren().add(nombreLugar);
        
        fila2.getChildren().add(fechaActual);
        fila2.getChildren().add(fecha);
        
        fila3.getChildren().add(buscarPersona);
        
        fila4.getChildren().add(dni);
        fila4.getChildren().add(campoDNI);
        fila4.getChildren().add(buscar);
        
        fila5.getChildren().add(propietario);
        
        fila6.getChildren().add(apellido);
        fila6.getChildren().add(campoApellido);
        
        fila7.getChildren().add(nombre);
        fila7.getChildren().add(campoNombre);
        
        fila8.getChildren().add(estadoCuenta);
        
        fila9.getChildren().add(saldoActual);
        fila9.getChildren().add(campoSaldoActual);
        
        fila10.getChildren().add(ingresarImporte);
        fila10.getChildren().add(campoIngresarImporte);
        
        
        // Contenedor Secundario
        VBox contenedorSecundario = new VBox();
        contenedorSecundario.setPadding(new Insets(10));
        contenedorSecundario.setSpacing(15);
        contenedorSecundario.setAlignment(Pos.CENTER);
        
        contenedorSecundario.getChildren().add(fila1);
        contenedorSecundario.getChildren().add(fila2);
        contenedorSecundario.getChildren().add(contenedorAuxiliar1);
        contenedorSecundario.getChildren().add(contenedorAuxiliar2);
        contenedorSecundario.getChildren().add(contenedorAuxiliar3);
        
        /**
         * Principal
         */
        BorderPane contenedorPrincipal = new BorderPane();
        contenedorPrincipal.setCenter(contenedorSecundario);
        contenedorPrincipal.setBottom(contenedorInferior);
        this.scene = new Scene(contenedorPrincipal, 800, 700);
    }
    
    @Override
    public Scene getScene() {
        return this.scene;
    }
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void mostrarVista() {
        System.out.println("");
        System.out.println("*** COBRO DE ABONO DE ESTACIONAMIENTO ***");
        System.out.println("Ingrese DNI:");
        int dni = validarNumero(10000000, 99999999);
        this.presentador.procesarDNI(dni);
    }
    
    @Override
    public ContratoProveedorPropietarios getProveedor() {
        return this.controlador.getProveedorPropietarios();
    }
    
    @Override
    public void solicitarMonto() {
        System.out.println("Ingrese monto a acreditar: ");
        Scanner scan = new Scanner(System.in);
        float monto = scan.nextFloat();
        
        this.presentador.procesarMonto(monto);
    }
    
    @Override
    public int pedirConfirmacion(float monto) {
        System.out.println("Monto acreditado: " + monto);
        System.out.println("¿Confirma el monto acreditado?");
        System.out.println("1. Si");
        System.out.println("2. No");
        
        int opcion = validarNumero(1, 2);
        return opcion;
    }
    
    @Override
    public void mostrarAcreditacionSaldos(float saldoAnterior, float saldoActual, float monto) {
        System.out.println(" ******* ");
        System.out.println("Saldo anterior: " + saldoAnterior);
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println("Monto acreditado: " + monto);
        System.out.println(" ******* ");
    }

    @Override
    public void mostrarDatosPropietario(Propietario propietario, AbonoPropietario abono) {
        float saldoPropietario = abono.getSaldoActual();
        
        System.out.println("");
        System.out.println("*** Datos del propietario ***");
        System.out.println("Nombre: " + propietario.getNombre());
        System.out.println("Apellido: " + propietario.getApellido());
        System.out.println("DNI: " + propietario.getDni());
        System.out.println("Saldo Actual: " + saldoPropietario);
    }
    
    @Override
    public void mostrarOperacionCancelada() {
        System.out.println("La operacion ha sido cancelada");
    }
    
    @Override
    public void mostrarPropietarioInexistente() {
        System.out.println("No existe ningun propietario registrado con este DNI");
        System.out.println("Debe crear un propietario para poder acreditar un monto.");
    }
    
    @Override
    public void lanzarMenuPrincipal() {
        this.controlador.lanzarMenuResponsableEstacionamiento();
    }
    
    @Override
    public void imprimirTicket(Ticket ticket) {
        System.out.println(ticket.toString());
    }
}
