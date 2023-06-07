/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx3vocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       /* 
        System.out.println("Ingrese una Letra: ");
        char letra;
        letra = leer.next().charAt(0);
        
        if(letra == 'a'|| letra =='e'|| letra == 'i'|| letra == 'o'||letra == 'u'){
            System.out.println("La letra "+ letra + " es una VOCAL");
        }else{
            System.out.println("La letra " + letra + " NO es una vocal");
        }
        */
       
        System.out.println("Ingrese otra Letra: ");
        String letra2 = leer.nextLine();
        String vocal = "a";
        boolean esVocal = false;
        
        esVocal = letra2.equals(vocal);
        
        if(esVocal == true){
            System.out.println("Es vocal");
        }else{
            System.out.println("No es Vocal");
        }
        
        
        
    }
    
}
