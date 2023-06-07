/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx6alturas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vueltas=1;
        System.out.println("Ingrese cantidad de personas: ");
        int N = leer.nextInt();
        int M = 0;
        double suma = 0;
        double suma2 = 0;
        
        do{
            System.out.println("Ingrese altura de la persona " + vueltas);
            double altura = leer.nextDouble();
            suma = suma + altura;
            
            if (altura < 1.60){
            suma2 = suma2 + altura;
            M++;
            }
            
            vueltas = vueltas+1;
            
        }while(vueltas <= N);
        
        
        System.out.println("El promedio de estatura menor a 1.60 es: "+ suma2/M);
        System.out.println("El promedio de altura total es: " + suma/N);
    }
    
}
