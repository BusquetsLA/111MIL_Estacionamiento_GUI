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

    
    public Vehiculo(String dominio, TipoVehiculo tipoVehiculo, Modelo modelo) {
        this.dominio = dominio;
        this.tipoVehiculo = tipoVehiculo;
        this.modelo = modelo;
    }

    public Vehiculo() {
        this.tipoVehiculo = new TipoVehiculo();
    }
    
    
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    public String conocerModelo() {
        return "Dominio del vehiculo: " + this.dominio;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Dominio: " + this.dominio + " Tipo Vehiculo: " + this.tipoVehiculo.getNombre() + " " + this.modelo.toString();
    }
}
