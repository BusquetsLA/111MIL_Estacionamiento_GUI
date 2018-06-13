/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author utku33
 */
public class Vehiculo {
    private String dominio;
    // Atributos agregados
    private TipoVehiculo tipoVehiculo;
    private Modelo modelo;

    
    public Vehiculo(String dominio) {
        this.dominio = dominio;
        this.tipoVehiculo = new TipoVehiculo();
        this.modelo = new Modelo();
    }

    public Vehiculo() {
        this.tipoVehiculo = new TipoVehiculo();
        this.modelo = new Modelo();
    }
    
    
    public String conocerModelo() {
        return "Dominio del vehiculo: " + this.dominio;
    }
}
