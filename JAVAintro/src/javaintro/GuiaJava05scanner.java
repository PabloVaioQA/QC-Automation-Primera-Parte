/*
 * EJERCICIO 5(Manos a las obras)
    Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
    Scanner.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class GuiaJava05scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean estado ; 
        double num ;
        char letra ;  
        
        System.out.println("Ingrese valor") ;
        estado = scan.nextBoolean();
        System.out.println("Ingrese numero con coma ") ;
        num = scan.nextDouble();
        System.out.println("Ingrese una letra") ;
        letra = scan.nextLine();
    }
    
}
