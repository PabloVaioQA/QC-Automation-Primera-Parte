
package javarelacionesej001;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author vaiop
 */
public class JavaRelacionesEj001 {

 
    public static void main(String[] args) {
         
        Perro mascota1 = new Perro("Mila", "Beagle", 2, "Chico");
        Perro mascota2 = new Perro("Puru", "Ovejero Aleman", 7, "Grande");
        
        Persona p1 = new Persona("Pablo", "Vaio", 35000000, 32, mascota1);
        Persona p2 = new Persona("Joaquin", "Castro", 35555555, 30, mascota2);
        
        System.out.println( p1.toString());
        System.out.println( p2.toString());
       
    }
    
}
