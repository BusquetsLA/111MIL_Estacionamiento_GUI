/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedor;

import java.util.HashMap;
import modelos.AbonoPropietario;
import modelos.Propietario;

/**
 *
 * @author utku33
 */
public class FalsoProveedor implements ContratoFalsoProveedor {
    private HashMap<Propietario, AbonoPropietario> propietarios;
    
    public FalsoProveedor() {
        this.propietarios = new HashMap();
        
        Propietario propietario1 = new Propietario("JoseLuis", "Beas", 40683129);
        Propietario propietario2 = new Propietario("Santiago", "Salamandri", 60546781);
        
        AbonoPropietario abono1 = new AbonoPropietario();
        AbonoPropietario abono2 = new AbonoPropietario();
        
        this.propietarios.put(propietario1, abono1);
        this.propietarios.put(propietario2, abono2);
    }
    
    @Override
    public Propietario comprobarDNI(int dni) {
        for(Propietario propietario : this.propietarios.keySet()) {
            if(dni == propietario.getDni()) {
                return propietario;
            }
        }
        return null;
    }
    
    @Override
    public HashMap<Propietario, AbonoPropietario> getPropietarios() {
        return this.propietarios;
    }
}
