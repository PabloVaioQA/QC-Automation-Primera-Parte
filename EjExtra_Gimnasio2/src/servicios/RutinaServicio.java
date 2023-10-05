package servicios;

import entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class RutinaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rutina crearRutina(ArrayList<Rutina> rutinas) {
        Rutina rutina = new Rutina();
        System.out.println("Ingrese el Id: ");
        rutina.setId(leer.nextInt());
        System.out.println("Ingrese el nombre de la rutina: ");
        rutina.setNombre(leer.next());
        System.out.println("Ingrese duracion de la rutina: ");
        rutina.setDuracion(leer.nextInt());
        System.out.println("Ingrese el nivel de dificultad de la rutina: ");
        rutina.setNivelDificultad(leer.next());
        System.out.println("Ingrese descripción de la rutina");
        rutina.setDescripcion(leer.next());
        rutinas.add(rutina);
        return rutina;
    }

    public void obtenerRutinas(ArrayList<Rutina> rutinas) {
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }
    }

    public void actualizarRutina(ArrayList<Rutina> rutinas, int id, String nombre, int duracion, String nivelDificultad, String descripcion) {

        int idEncontrado = buscarId(rutinas, id);
        rutinas.get(idEncontrado).setNombre(nombre);
        rutinas.get(idEncontrado).setDuracion(duracion);
        rutinas.get(idEncontrado).setNivelDificultad(nivelDificultad);
        rutinas.get(idEncontrado).setDescripcion(descripcion);
    }

    public void eliminarRutina(ArrayList<Rutina> rutinas, int id) {
        rutinas.remove(buscarId(rutinas, id));

    }

    public int buscarId(ArrayList<Rutina> rutinas, int id) {
        int idEncontrado = 0;
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                idEncontrado = i;
            }
        }
        return idEncontrado;
    }
}
