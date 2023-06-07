/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio01sumaEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        int num1,num2,suma;
        
        System.out.println("Ingrese un número entero: ");
        num1 = leer3.nextInt();
        System.out.println("Ingrese el número entero a sumarle: ");
        num2 = leer3.nextInt();
        
        suma = num1 + num2 ;
        System.out.println("La suma es: " + suma);
    }
    
}
