/*
 *  17. Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx17numPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        
        if (Primo(num)) {
            System.out.println("el número " + num + " es primo");
        } else {
            System.out.println("el número " + num + " no es primo");
        }
        
    }
    
    
    private static boolean Primo(int num) {
        boolean salida = true;
        for (int i = 2; i < num / 2; i++) {
            salida = salida && num % i != 0;
            if (!salida) return salida;
        }
        return salida;
    }
    
}
