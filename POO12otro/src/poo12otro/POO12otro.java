
package poo12otro;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class POO12otro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Persona p = new Persona();
        p.crearPersona();
        System.out.println(p.toString());
        System.out.println(" ");
        System.out.println(p.getFecha());
        p.calcularEdad(p);
        
        System.out.println("Ingrese la edad de la segunda Persona: ");
        int edad2 = leer.nextInt();
        
        p.menorQue(edad2, p);
        
        p.mostrarPersona(p);
        
    }
    
}
