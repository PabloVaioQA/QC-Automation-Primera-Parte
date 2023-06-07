/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio04gradosCF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer3 = new Scanner(System.in);
        double TempC, TempF;
        
        System.out.println("Ingrese la temperatura actual:(en °C) ");
        TempC = leer3.nextDouble();
        
        TempF = (32 + (9 * TempC / 5));
        System.out.println("La temperatura actual es: " + TempC + "°C");
        System.out.println("La temperatura en grados Fahrenheit es: " + TempF +"°F");
    }
    
}
