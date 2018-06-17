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
 * @author utku36
 */
public interface ContratoProveedorPropietarios {
    
    public HashMap<Propietario, AbonoPropietario> getPropietarios();
    
}
