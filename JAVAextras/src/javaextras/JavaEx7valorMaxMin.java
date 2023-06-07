/*
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. con While
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx7valorMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de numeros: ");
        int N = leer.nextInt();
        int contador = 1;
        int suma = 0;
        int numeroMayor = 0;
        int numeroMenor = 100;
        
        while(contador <= N){
            System.out.println("ingrese numero: ");
            int numero = leer.nextInt();
            suma = suma + numero;
            
            if(numero > numeroMayor){
                numeroMayor = numero;
            }
            if(numero < numeroMenor){
                numeroMenor = numero;
            }
            
            contador++;
            
        }
        System.out.println("Numero menor: "+ numeroMenor);
        System.out.println("Numero Mayor: "+ numeroMayor);
        System.out.println("El promedio es: "+ suma/N);
    }
    
}
