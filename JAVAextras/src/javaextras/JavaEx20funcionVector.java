/*
 *  Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
    parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx20funcionVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("ingrese la dimensión del vector: ");
        n = scan.nextInt();
        int[] vector = new int[n];
        vectorAleatorio(vector);
        mostrarVector(vector);
    }

    private static void vectorAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 10);
        }
    }

    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
   
}
