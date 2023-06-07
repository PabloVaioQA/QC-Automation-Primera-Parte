/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio02nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        String Nombre;
        
        System.out.println("Ingrese su nombre: ");
        Nombre = leer3.nextLine();
        
        System.out.println("El nombre guardado es: " + Nombre);
        
    }
    
}
