/*
 *  EJERCICIO 8(Manos a la obra)
    Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
    pedirá de nuevo hasta que la nota sea correcta.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class GuiaJava08validarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int nota;
        
        System.out.println("Ingrese la nota de su examen nota: ");
        nota = leer.nextInt();
        
        while (nota > 10 ) {
            System.out.println("Nota no valida! , Ingrese la nota de su examen nota: ");
        nota = leer.nextInt();
        }
        
        System.out.println("Su nota es: " + nota );
    }
    
    
}
