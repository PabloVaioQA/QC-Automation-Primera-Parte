/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio10valorLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        int limite, num;
        int suma = 0;
        
        System.out.println("Ingrese numero limite: ");
        limite = leer3.nextInt();
        
        do{
            System.out.println("Ingrese un numero a sumar:");
            num = leer3.nextInt();
            suma = suma + num;
            
        
        }while(suma < limite);
        System.out.println("Ha superado el limite: " + limite);
        System.out.println("La suma total es: "+ suma);
        System.out.println("Te pasaste por: "+ (suma-limite));
    }
    
}
