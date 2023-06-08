/*
 *  Ejercicio 16
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
    las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx16programaPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer2 = new Scanner(System.in);
        int vueltas=0;
        String persona;
        
        System.out.println("Cantidad de personas: ");
        int N = leer2.nextInt();
            
        while(vueltas < N){
            
            System.out.println("Nombre: ");
            persona = leer2.nextLine();
            
            System.out.println("Edad:");
            int edad = leer2.nextInt();
            
            if(edad < 18){
                System.out.println(persona + "es MENOR");
            }else{
                System.out.println("es MAYOR");
            }
            vueltas++;
        }   
        
        
        
    }
    
}
