/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedorPropietarios;

import java.util.HashMap;
import modelos.AbonoPropietario;
import modelos.Marca;
import modelos.Modelo;
import modelos.Propietario;
import modelos.TipoVehiculo;
import modelos.Vehiculo;

/**
 *
 * @author utku33
 */
public class ProveedorPropietarios implements ContratoProveedorPropietarios {
    private HashMap<Propietario, AbonoPropietario> propietarios;
    
    public ProveedorPropietarios() {
        this.propietarios = new HashMap();
        
        // Modelos
        Modelo modeloAudiR8 = new Modelo(Marca.AUDI, "R8");
        Modelo modeloPeugeot206 = new Modelo(Marca.PEUGEOT, "206");
        Modelo modeloPeugeotPartner = new Modelo(Marca.PEUGEOT, "Partner");
        Modelo modeloFordFocus = new Modelo(Marca.FORD, "Focus");
        Modelo modeloToyotaCorola = new Modelo(Marca.TOYOTA, "Corola");
        
        // Tipos de vehiculo
        TipoVehiculo tipoAudiR8 = new TipoVehiculo("Audi R8, Edicion Limitada, Alemania 2005, industrias Kaiser", "Audi R8 Edicion Limitada");
        TipoVehiculo tipoPeugeot206 = new TipoVehiculo("Audi R8, Edicion Limitada, Alemania 2005, industrias Kaiser", "Audi R8 Edicion Limitada");
        TipoVehiculo tipoPeugeotPartner = new TipoVehiculo("Audi R8, Edicion Limitada, Alemania 2005, industrias Kaiser", "Audi R8 Edicion Limitada");
        TipoVehiculo tipoFordFocus = new TipoVehiculo("Audi R8, Edicion Limitada, Alemania 2005, industrias Kaiser", "Audi R8 Edicion Limitada");
        TipoVehiculo tipoToyotaCorola = new TipoVehiculo("Audi R8, Edicion Limitada, Alemania 2005, industrias Kaiser", "Audi R8 Edicion Limitada");
        
        // Vehiculos
        Vehiculo rodrigoFederer1 = new Vehiculo("kfj 224", tipoAudiR8, modeloAudiR8);
        Vehiculo rodrigoFederer2 = new Vehiculo("hkl 637", tipoPeugeotPartner, modeloPeugeotPartner);
        Vehiculo juanGonzalez1 = new Vehiculo("utk 757", tipoPeugeot206, modeloPeugeot206);
        Vehiculo juanGonzalez2 = new Vehiculo("sds 112", tipoFordFocus, modeloFordFocus);
        
        Propietario joseBeas = new Propietario("Jose", "Beas", 40683129);
        Propietario juanGonzalez = new Propietario("Juan", "Gonzalez", 41683129);
        juanGonzalez.agregarVehiculo(juanGonzalez1);
        juanGonzalez.agregarVehiculo(juanGonzalez2);
        Propietario marisaEstevez = new Propietario("Marisa", "Estevez", 42683129);
        Propietario rodrigoFederer = new Propietario("Rodrigo", "Federer", 43683129);
        rodrigoFederer.agregarVehiculo(rodrigoFederer1);
        rodrigoFederer.agregarVehiculo(rodrigoFederer2);
        
        AbonoPropietario abono1 = new AbonoPropietario();
        AbonoPropietario abono2 = new AbonoPropietario();
        
        this.propietarios.put(joseBeas, abono1);
        this.propietarios.put(juanGonzalez, abono2);
        this.propietarios.put(marisaEstevez, null);
        this.propietarios.put(rodrigoFederer, null);
        
    }
    
    
    @Override
    public HashMap<Propietario, AbonoPropietario> getPropietarios() {
        return this.propietarios;
    }
}
