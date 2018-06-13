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
public enum Modelo {
    
    CORSA_1(Marca.FIAT, 33),
    POLO_2(Marca.AUDI, 45);
    
    private Marca marca;
    private int codigo;
    
    Modelo(Marca marca, int codigoModelo) {
        this.marca = marca;
        this.codigo = codigoModelo;
    }
    
}
