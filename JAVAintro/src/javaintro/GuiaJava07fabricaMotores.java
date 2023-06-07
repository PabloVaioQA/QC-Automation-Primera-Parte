/*
 *  EJERCICIO 07 
    Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
    que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor
    y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class GuiaJava07fabricaMotores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int motor;
        
        System.out.println("Ingrese el numero de tipo de Motor: (1,2,3 o 4)");
        motor = leer.nextInt();
        
        switch (motor){
            case 1: 
             System.out.println("(Motor 1) La bomba es una bomba de agua");
         break;
            case 2: 
             System.out.println("(Motor 2) La bomba es una bomba de gasolina");
         break;
            case 3:
             System.out.println("(Motor 3) La bomba es una bomba de hormigon");
         break;
            case 4:
             System.out.println("(Motor 4) La bomba es una bomba de pasta alimenticia");
         break;
            default:System.out.println("“No existe un valor válido para ese tipo de bomba”");
        }
        
    }
    
}
