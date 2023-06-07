/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx9divisionRestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese primer número: ");
        int Num1 = leer.nextInt();
        System.out.println("Ingrese segundo número: ");
        int Num2 = leer.nextInt();
        
        int resto =0;
        int contador = 0;
        
        do{ 
            
            if(contador == 0){
                resto = Num1-Num2; 
                contador = contador +1;
                
            }else if(contador>=1){
            resto = resto-Num2; 
            contador = contador +1;
            }
            
        }while(resto >= Num2 );
                
        System.out.println("Cociente: " + contador);
        System.out.println("Residuo: " + resto);
    }
    
}
