/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx8multiplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cantidad = 0;
        int pares = 0;
        int impares = 0; 
        int num;
        do{
            System.out.println("Ingrese numeros enteros: ");
            num = leer.nextInt();
            cantidad = cantidad+1;
            
            if(num%2 == 0){
                pares = pares+1;
            }else{ 
                impares = impares +1;
            }
            
        }while( num%5 != 0);
        System.out.println("Cantidad de numeros leidos: "+ cantidad);
        System.out.println("Cantidad de Impares: "+ impares);
        System.out.println("Cantidad de Pares: "+ pares);
    }
    
}
