/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package javaejercicios;

/**
 *
 * @author vaiop
 */
public class Ejercicio15numEnteros100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        
        for(int i=1; i < 101; i++) {
            vector[i-1] = i;
        }
        
        for(int i=99; i >= 0; i--) {
            System.out.println("["+vector[i]+"]");
        }
    }
    
}
