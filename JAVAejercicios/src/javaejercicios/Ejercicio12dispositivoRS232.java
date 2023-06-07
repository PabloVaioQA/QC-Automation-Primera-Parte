/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio12dispositivoRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String lectura;
        int correctas = 0, total = 0;
        
        do {
            System.out.println("ingrese una cadena: ");
            lectura = scan.nextLine();
            if (lectura.length() == 5) {
                if (lectura.substring(0, 1).equals("X")) {
                    if (lectura.substring(4, 5).equals("O")) {
                        correctas++;
                    }
                }
            }
            total++;
        } while (!lectura.equals("&&&&&"));
        total--;
        System.out.println("total de lecturas: " + total);
        System.out.println("lecturas correctas: " + correctas);
        System.out.println("lecturas incorrectas: " + (total - correctas));
    }
}
    

