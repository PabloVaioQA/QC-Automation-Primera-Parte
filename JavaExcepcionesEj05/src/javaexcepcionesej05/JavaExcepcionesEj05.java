/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package javaexcepcionesej05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaExcepcionesEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rdn = new Random();
        Scanner leer = new Scanner(System.in);

        int user = 0, num = rdn.nextInt(499) + 1, intento = 0;
        
        System.out.println(num);
        
        do {
            try {
                System.out.print("Escriba un número: ");
                user = Integer.parseInt(leer.nextLine());
            } catch (NumberFormatException a) {
                System.out.print("Entrada NO válida. ");
            } finally {
                intento++;
            }
        } while (user != num);

        System.out.println("\nAdivinó el número" + "\nIntentos: " + intento);
    }
    
}
