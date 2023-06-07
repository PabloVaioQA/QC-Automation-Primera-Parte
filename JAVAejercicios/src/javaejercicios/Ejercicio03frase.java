/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio03frase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        String Frase;
        
        System.out.println("Ingrese una frase corta: ");
        Frase = leer3.nextLine();
        
        String FraseMay = Frase.toUpperCase();
        System.out.println(FraseMay);
        
        String FraseMin = Frase.toLowerCase();
        System.out.println(FraseMin);
    }
    
}
