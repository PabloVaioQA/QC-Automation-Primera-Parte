/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio08ochodigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        String frase;
        
        System.out.println("Por favor ingrese una frase o palabra: ");
        frase = leer3.nextLine();
        
        if(frase.length() == 8){
            System.out.println("¡¡Correcto!!");
        }else{ 
            System.out.println("Incorrecto :(");
        }
    }
    
}
