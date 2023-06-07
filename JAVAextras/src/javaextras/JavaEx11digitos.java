/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx11digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero entero: ");
        int num = leer.nextInt();
        int contador = 0;
        
        
        while(num > 0){
            
           num = num/10;
           contador = contador + 1;
        }
        
        System.out.println("El numero posee "+ contador +" digitos");
    }
    
}
