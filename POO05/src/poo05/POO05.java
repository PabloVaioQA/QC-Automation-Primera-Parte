
package poo05;

import Entidades.Cuenta;


/**
 *
 * @author vaiop
 */
public class POO05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta c = new Cuenta();
        
        c.crearCuenta();
        c.Ingresar(200);
        c.Retirar(50);
        c.consultarSaldo();
        c.consultarDatos(01);
        
        
        
        
        
    }
    
}
