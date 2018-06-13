/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utku33
 */
public class Marca {
    private String nombre;
    // Atributos agregados
    private List<Modelo> modelos;
    
    
    public Marca(String nombre) {
        this.nombre = nombre;
        this.modelos = new ArrayList();
    }
    
    
    public String conocerModelo() {
        return "Nombre: " + this.nombre;
    }
}
