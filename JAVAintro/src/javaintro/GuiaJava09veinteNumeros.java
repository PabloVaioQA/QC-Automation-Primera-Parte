/*
 *  EJERCICIO 9
    Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
    bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
    el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
    Nota: recordar el uso de la sentencia break.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class GuiaJava09veinteNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        int suma = 0;
        int cont = 0;
        do{
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if (num != 0) {
                suma = suma + num;
                cont = cont + 1;
             }else { System.out.println("Se capturo el numero 0");
            break;
                   }
            
        } while (cont < 20);
        
        
                
        System.out.println("La suma de los numeros es:" + suma);
    }
    
    
}
