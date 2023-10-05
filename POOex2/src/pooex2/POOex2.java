
package pooex2;

import Servicio.PuntosServicios;

/**
 *
 * @author vaiop
 */
public class POOex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PuntosServicios punServ = new PuntosServicios();
        punServ.crearPuntos();
        
        System.out.println(punServ.calcularDistancia());
        
    }
    
}
