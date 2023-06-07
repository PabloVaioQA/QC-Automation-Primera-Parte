/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente.
 * 
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx10multAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int Num1 = (int) (Math.random() * 10);
        int Num2 = (int) (Math.random() * 10);
        int multiplicacion = Num1*Num2; 
        //System.out.println("Num1 * Num2= " +multiplicacion);
        int resultado;
        do{
            
            System.out.println("Ingrese posible resultado");
            resultado = leer.nextInt();
        
        }while(multiplicacion != resultado);
        
        if(resultado == multiplicacion){
            System.out.println("CORRECTO!! "+Num1+" * "+Num2+" = "+multiplicacion);
        }
    }
    
}
