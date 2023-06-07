/*
 *  EJERCICIO 12
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
    que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
    segundo, sino informe que no lo son.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class GuiaJava12esMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Escriba el primer numero:");
        num1 = leer.nextInt();
         System.out.println("Escriba el segundo numero:");
        num2 = leer.nextInt();
        
        esMultiplo(num1,num2);
    }
    
    public static void esMultiplo(int num1, int num2){
        
        if( num1%num2 == 0){
            System.out.println("el primer numero ES múltiplo del segundo");
        }else{
            System.out.println("el primer numero NO es múltiplo del segundo");
        }
        
    }
    
}
