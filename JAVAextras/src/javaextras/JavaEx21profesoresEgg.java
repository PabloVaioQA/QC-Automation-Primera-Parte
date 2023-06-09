/*
 *  Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
    desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
    trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx21profesoresEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] notas = new int[10][4];
        double suma=0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("ingrese nota " + (j+1) + " de Alumno " + (i+1) );
                notas[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(notas[i][j]);
            }
            System.out.println(" ");
        }
        
        
        
    }
    
}
