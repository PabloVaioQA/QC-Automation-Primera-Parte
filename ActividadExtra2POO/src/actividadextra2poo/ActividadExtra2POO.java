
package actividadextra2poo;

import Entidades.Figuras;

/**
 *
 * @author vaiop
 */
public class ActividadExtra2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figuras F1 = new Figuras(); 
        Figuras F2 = new Figuras();
        
        F1.Triangulo(10, 5);
        System.out.println("El Area del triangulo es: " + F1.getArea());
        System.out.println("El Perimetro del triangulo es: " + F1.getPerimetro());
        
        F2.Hexagono(5, 4);
        System.out.println("El Area del Hexagono es: " + F2.getArea());
        System.out.println("El Perimetro del Hexagono es: " + F2.getPerimetro());
        
    }
    
}
