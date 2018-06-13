/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedor;

import java.util.HashMap;

/**
 *
 * @author utku33
 */
public class ProveedorFalso {
    private HashMap<String, String> usuariosRegistrados;

    
    public ProveedorFalso() {
        this.usuariosRegistrados = new HashMap();
    }
    
    
    public HashMap<String, String> getListaUsuario() {
        return this.usuariosRegistrados;
    }
}
