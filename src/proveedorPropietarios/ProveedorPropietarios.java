/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedorPropietarios;

import java.util.HashMap;
import modelos.AbonoPropietario;
import modelos.Propietario;

/**
 *
 * @author utku33
 */
public class ProveedorPropietarios implements ContratoProveedorPropietarios {
    private HashMap<Propietario, AbonoPropietario> propietarios;
    
    
    public ProveedorPropietarios() {
        this.propietarios = new HashMap();
        
        Propietario joseBeas = new Propietario("Jose", "Beas", 40683129);
        Propietario juanGonzalez = new Propietario("Juan", "Gonzalez", 41683129);
        Propietario marisaEstevez = new Propietario("Marisa", "Estevez", 42683129);
        Propietario rodrigoFederer = new Propietario("Rodrigo", "Federer", 43683129);
        
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
