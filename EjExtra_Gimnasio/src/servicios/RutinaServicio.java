
package servicios;

import entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;


public class RutinaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rutina crearRutina(ArrayList<Rutina> rutinas){
        Rutina rutina = new Rutina();
        
        System.out.println("Ingrese el Id: ");
        rutina.setId(leer.nextInt());
        
        System.out.println("Ingrese rutina");
        rutina.setNombre(leer.next());
        
        System.out.println("Ingrese Duracion");
        rutina.setDuracion(leer.nextInt());
        
        System.out.println("Ingrese Nivel de Dificultad");
        rutina.setNivelDificultad(leer.next());
        
        System.out.println("Ingrese Descripcion");
        rutina.setDescripcion(leer.next());
        
        rutinas.add(rutina);
        return rutina;
    }
    
    public void obtenerRutinas(ArrayList<Rutina> rutinas){
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
            
        }
    }
    
    public void actualizarRutina(ArrayList<Rutina> rutinas, String nombre, int duracion, String nivelDificultad, String descripcion){
        
        System.out.println("Ingrese id de la rutina a actualizar");
        int id=leer.nextInt();
        
        for (Rutina rutina : rutinas) {
            if(rutina.getId() == id){
                rutina.setNombre(nombre);
                rutina.setDuracion(duracion);
                rutina.setNivelDificultad(nivelDificultad);
                rutina.setDescripcion(descripcion);
                break;
            }
        }
    }
    
    public int eliminarRutina(ArrayList<Rutina> rutinas,int id){
        int idEncontrado = 0;
        for (int i = 0; i < rutinas.size(); i++) {
            if(rutinas.get(i).getId() == id){
                idEncontrado = i;
            } 
        }
        return idEncontrado;
    }
    
    public int buscarId(ArrayList<>){
        
    
    
    }
}
