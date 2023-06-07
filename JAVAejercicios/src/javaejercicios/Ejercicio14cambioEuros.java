/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio14cambioEuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in); 
      
        System.out.println("Ingrese la cantidad de Euros a convertir: ");
        int euros =  leer.nextInt();
       
        System.out.println("A que moneda quiere convertir: ");
        System.out.println("1- Libra, 2- Dolar, 3- Yenes");
        int moneda = leer.nextInt();
        
        convertir(moneda,euros); 
    
        
    }
    
    public static void convertir(int eleccion, int valor){
        
        switch (eleccion) {
            case 1:
                System.out.println("La conversion a Libras es: " + valor * 0.86);
                break;
            case 2:
                System.out.println("La conversion a Dolar es: " + valor * 1.28611);
                break;
            case 3:
                System.out.println("La conversion a Yenes es: " + valor * 129.852);
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }
    
    }
    
}
    
    

