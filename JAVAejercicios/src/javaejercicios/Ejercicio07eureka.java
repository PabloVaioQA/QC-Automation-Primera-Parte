/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio07eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        String Frase;
        
        
        System.out.println("Ingrese Frase: ");
        Frase = leer3.nextLine();
        
        if (Frase.equals("eureka")){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    
}
