/*
 *  EJERCICIO 6 (Mano a la obra)
    Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
    alguno de ellos es mayor a 25.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class GuiaJava06dosNum25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        num2 = leer.nextInt();
        
        if(num1>25 && num2>25) { 
            
            System.out.println("Ambos numeros son mayores a 25");
            
        }else if (num1>25 || num2>25){
            
            System.out.println("Uno de los numeros es mayor a 25");
        }
    }
    
}
