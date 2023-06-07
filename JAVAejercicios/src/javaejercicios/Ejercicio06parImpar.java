/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio06parImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        int N;
        
        System.out.println("Ingrese un Número: ");
        N = leer3.nextInt();
        
        if( N%2 == 0 ){
            System.out.println("El número " + N + " es Par");
        }else{
            System.out.println("El número " + N + " es Impar");
        }
    }
    
}
