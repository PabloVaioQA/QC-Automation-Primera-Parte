
package javapoo03;

import Operaciones.JavaPOO03oper;

/**
 *
 * @author vaiop
 */
public class JavaPOO03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JavaPOO03oper Operaciones = new JavaPOO03oper();
        
        Operaciones.crearOperacion();
        
        System.out.println("La suma es: " + Operaciones.suma());
        
        System.out.println("La resta es: "+ Operaciones.resta());
        
        System.out.println("La multiplicacion es: "+ Operaciones.multiplicar() );
        
        System.out.println("La division es: "+ Operaciones.dividir());
        
    }
    
}
