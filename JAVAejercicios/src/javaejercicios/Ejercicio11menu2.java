/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio11menu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, op = 0;
        System.out.println("ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero: ");
        num2 = leer.nextInt();
        
        do {
            mostrarMenu();
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la multiplicación es: " + num1 * num2);
                    break;
                case 4:
                    System.out.println("la división es: " + num1 * 1.0 / num2);
                    break;
                case 5:
                    System.out.println("bye");
                    break;
            }
        } while (op != 5);
        
    }

    private static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opción: ");
    }
    
}
    
    

