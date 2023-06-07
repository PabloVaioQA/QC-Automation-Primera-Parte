/*
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio09primeraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        String frase;
        
        System.out.println("Por favor ingrese una frase o palabra: ");
        frase = leer3.nextLine();
        
        String letra = frase.substring(0,1);
        
        if(letra.equals("A") ){
            System.out.println("Correcto! La primera letra es una A");
        }else{
            System.out.println("Incorrecto");}
    }
    
}
