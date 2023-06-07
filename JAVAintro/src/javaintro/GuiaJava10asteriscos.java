/*
 *  EJERCICIO 10
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
    ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class GuiaJava10asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1,num2,num3,num4;
        int cont = 0;
       // System.out.println("Ingrese un numero de 1 a 20");
       // num1 = leer.nextInt();
        do{
            for(int i=1; i<=1; i++){
                System.out.println("Ingrese un numero de 1 a 20");
                num1 = leer.nextInt();
                System.out.print(num1);
                cont = cont+1;
                for(int j=1; j<=num1; j++){
                    System.out.print(" * ");
                    }
                System.out.println("");
                }
        }while (cont < 4); 
    }
    
}
