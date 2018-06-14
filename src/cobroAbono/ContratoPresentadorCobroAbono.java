/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobroAbono;

/**
 *
 * @author utku33
 */
public interface ContratoPresentadorCobroAbono {
 
    public void iniciar();
    public void procesarDNI(int dni);
    public void procesarMonto(float monto);
    
}
