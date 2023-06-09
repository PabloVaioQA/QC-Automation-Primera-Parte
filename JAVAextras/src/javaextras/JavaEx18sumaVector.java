/*
 *  Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
    N, con los valores ingresados por el usuario.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx18sumaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño deseado de Vector[]");
        int N= leer.nextInt();
        int[] vector;
        vector = new int[N];
        int suma = 0;
        
        for (int i = 0; i <= N-1; i++) {
            System.out.println("Ingrese valor para VECTOR ["+i+"]");
            vector[i]= leer.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("La suma de los valores del Vector[N] es:" + suma);
    }
    
}
