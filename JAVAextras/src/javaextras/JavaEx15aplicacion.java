/*
 *  Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
    matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx15aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int opc;
        
        
        
        do{    
            System.out.println("Que desea hacer:");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("la suma es: " + suma(num1, num2));
                    break;
                case 2: 
                    System.out.println("la resta es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("la multiplicación es: " + multiplica(num1, num2));
                    break;
                case 4:
                    System.out.println("la división es: " + division(num1, num2));
                    break;
                case 5: 
                    System.out.println("Nos vemos!");
                    break;
                default:
                    System.out.println("ingrese una opción válida.");
                    break;
            }
        }while (opc != 5);
        
    }
    
    private static int suma(int num1, int num2) {
        return num1 + num2;
    }

    private static int resta(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    private static double division(int num1, int num2) {
        return num1 * 1.0 / num2;
    }
    
}
