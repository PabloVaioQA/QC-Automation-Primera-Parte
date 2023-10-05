package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class PersonaServicio {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> listaPersonas;
        ArrayList<Perro> listaPerros;

    public PersonaServicio() {
        listaPersonas = new ArrayList();
        listaPerros = new ArrayList();
    }
           
    public void crearPersona(){
        Persona p1 = new Persona("Pablo", "Vaio", 35000000, 32);
        listaPersonas.add(p1);
        Persona p2 = new Persona("Joaquin", "Castro", 48555555, 16);
        listaPersonas.add(p2);
        Persona p3 = new Persona("Maria", "Fernandez", 30333000, 38);
        listaPersonas.add(p3);
        Persona p4 = new Persona("Camila", "Garcia", 42655555, 21);
        listaPersonas.add(p4);
        
        
    }
    
    public void crearPerros(){
        
        Perro mascota1 = new Perro("Mila", "Beagle", 2, "Chico",false);
        listaPerros.add(mascota1);
        Perro mascota2 = new Perro("Puru", "Ovejero Aleman", 7, "Grande",false);
        listaPerros.add(mascota2);
        Perro mascota3 = new Perro("Pelusa", "Callejero", 8, "Mediano",false);
        listaPerros.add(mascota3);
        Perro mascota4 = new Perro("Toto", "San bernardo", 3, "Grande",false);
        listaPerros.add(mascota4);
    }
    
    public void adoptarPerro(){
        String opc;
        for (Persona Persona : listaPersonas) {
            System.out.println("Hola " + Persona.getNombre());
            System.out.println("Que Perro quieres adoptar?");
            
            for (Perro Perro : listaPerros) {
                if(!Perro.isAdoptado())
                System.out.println(Perro.getNombre());
            }
            opc = leer.nextLine();
            
            for (Perro Perro : listaPerros) {
                if(Perro.getNombre().equals(opc)){
                Persona.setMascota(Perro);
                Perro.setAdoptado(true);
                }else{
                System.out.println("No hay perro con ese Nombre");
            }
        }
    }
    
    public void mostrarTodo(){
        for (Persona Persona : listaPersonas) {
            System.out.println(Persona.toString());
        }
    }
    
}
