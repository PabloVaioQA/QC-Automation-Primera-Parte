
package javaexcepcionesironman;

import Entidades.Armadura;

/**
 *
 * @author vaiop
 */
public class JavaExcepcionesIronMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armadura armadura = new Armadura("rojo",
                "amarillo",
                1000,
                500f,
                50d,
                50d,
                100d,
                60d);
        armadura.caminar(100);
    }
    
}
