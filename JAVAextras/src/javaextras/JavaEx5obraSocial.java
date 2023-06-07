/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
 Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.

 * 
 */
package javaextras;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaEx5obraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese Clase de Socio(A, B o C)");
        String letra = leer.nextLine();
        System.out.println("Ingrese monto de tratamiento: ");
        int monto = leer.nextInt();
        
        switch(letra){
            case "A":
            case "a":
                System.out.println("Usted es Socio "+ letra);
                System.out.println("Su monto a pagar es: "+ monto/2);
                break;
            case "B":
            case "b":
                System.out.println("Usted es Socio "+ letra);
                System.out.println("Su monto a pagar es: "+ (monto/100)*65);
                break;
                
            case "C":
            case "c":
                System.out.println("Usted es Socio "+ letra);
                System.out.println("Usted no tiene descuento, su monto a pagar es: "+ monto);
                break;
            default: 
                System.out.println("Letra de Socio no valida. Vuelva Pronto");
        }    
    }
    
}
