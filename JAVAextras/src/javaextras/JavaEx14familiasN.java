/*
 *  Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
    cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx14familiasN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int M = 0, edad;
        int suma = 0;
        int cont = 0;
        System.out.println("Ingrese la cantidad de Familias: ");
        int N = leer.nextInt();
        
        do{
            System.out.println("Ingrese la cantidad de hijos de la familia: ");
            M = leer.nextInt();
            cont = cont+1;
            
                for (int i = 1; i <= M; i++) {
                    System.out.println("Ingrese Edad de hijo "+ (i) +":");
                    edad = leer.nextInt();
                    suma = suma + edad; 
                }
                
        }while(cont != N);
        
        System.out.println("El promedio de edades es: "+ (suma/(N*M)) );
    }
    
}
