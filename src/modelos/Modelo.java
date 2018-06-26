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
public class Modelo {
    private Marca marca;
    private String modelo;
    
    
    public Modelo(Marca marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
    @Override
    public String toString() {
        return "Marca: " + this.marca.name() + " Modelo: " + this.modelo;
    }
}