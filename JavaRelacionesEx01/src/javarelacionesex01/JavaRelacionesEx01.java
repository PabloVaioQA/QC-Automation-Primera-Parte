
package javarelacionesex01;

import Entidades.Perro;
import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author vaiop
 */
public class JavaRelacionesEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Perro mascota1 = new Perro("Mila", "Beagle", 2, "Chico");
        Perro mascota2 = new Perro("Puru", "Ovejero Aleman", 7, "Grande");
        Perro mascota3 = new Perro("Pelusa", "Callejero", 8, "Mediano");
        Perro mascota4 = new Perro("Toto", "San bernardo", 3, "Grande");
        
        
        Persona p1 = new Persona("Pablo", "Vaio", 35000000, 32);
        Persona p2 = new Persona("Joaquin", "Castro", 48555555, 16);
        Persona p3 = new Persona("Maria", "Fernandez", 30333000, 38);
        Persona p4 = new Persona("Camila", "Garcia", 42655555, 21);
        
        
        
        
        System.out.println( p1.toString());
        System.out.println( p2.toString());
        */
        PersonaServicio ps = new PersonaServicio();
        
        ps.crearPerros();
        ps.crearPersona();
        ps.adoptarPerro();
        ps.mostrarTodo();
    }
    
}
