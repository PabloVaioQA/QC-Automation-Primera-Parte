/*
 *  Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
    muestre la suma de sus elementos.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx22sumaMatrizNM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("ingrese la cantidad de filas: ");
        n = scan.nextInt();
        System.out.println("ingrese la cantidad de columnas: ");
        m = scan.nextInt();
        int[][] matriz = new int[n][m];
        
        //llenar matriz aleatoria
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
            }   
        }
        //mostrar matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]+" ");
            }   
            System.out.println("");
        }
        //suma
        int suma=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
    
}
