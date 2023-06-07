/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio11menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer3 = new Scanner(System.in);
        int num1,num2;
        int opc = 0;
        System.out.println("Ingrese su primer numero: ");
        num1 = leer3.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        num2 = leer3.nextInt();
        
        System.out.println("MENU: ");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        System.out.println("5. Salir ");
        //System.out.println("Elija una opcion: ");
        //int opc = leer3.nextInt();
        
        do {
            System.out.println("Elija una opcion: ");
            opc = leer3.nextInt(); 
            
            switch(opc){
                case 1:
                    System.out.println("La suma es: " + (num1 + num2) );
                    break;
                case 2:
                    System.out.println("La resta es: "+ (num1 - num2) );
                    break;
                case 3:
                    System.out.println("La Multiplicacion es: "+(num1 * num2));
                    break;
                case 4:
                    System.out.println("La Division es: "+ (num1/num2));
                    break;
                case 5:
                    System.out.println("Muchas gracias!! vuelva pronto ^^ ");
                    break;

                default: System.out.println("Elija una opcion valida");
                    break;

            }
        } while(opc != 5);
    }
    
}
