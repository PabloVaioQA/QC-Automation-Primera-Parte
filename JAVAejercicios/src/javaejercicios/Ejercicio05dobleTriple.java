/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio05dobleTriple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        int Num;
        
        System.out.println("Ingrese un número entero: ");
        Num = leer3.nextInt();
        
        int Doble = (Num * 2);
        int Triple = (Num * 3);
        
        System.out.println("Doble: " + Doble);
        System.out.println("Triple: "+ Triple);
        System.out.println("Raiz Cuadrada:"+ Math.sqrt(Num));
    }
    
}
