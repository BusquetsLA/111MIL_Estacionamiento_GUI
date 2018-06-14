/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import proveedor.ContratoFalsoProveedor;

/**
 *
 * @author utku33
 */
public interface ContratoControladorVistas {
    
    public void lanzarMenuPrincipal();
    public void lanzarCobroDeAbono();
    public ContratoFalsoProveedor getProveedor();
    
}
