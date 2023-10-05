package mascotapp.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioMascota {

    private Scanner leer;
    private ArrayList<String> razasArrayList;
    Iterator<String> iterador ;

    public ServicioMascota() {
        leer = new Scanner(System.in).useDelimiter("\n");
        razasArrayList = new ArrayList<>();
        
        
        razasArrayList.add("Pug");
        razasArrayList.add("Caniche");
        razasArrayList.add("Ovejero");
        razasArrayList.add("Ave");
        razasArrayList.add("Pointer");
        razasArrayList.add("Pug");
        razasArrayList.add("Pug");
        
    }

    public void agregarRaza() {
        String opcion;
        do {
            System.out.print("Ingrese raza de mascota: ");
            razasArrayList.add(leer.next());
            System.out.println("Desea continuar agregando razas a la lista? s/n ");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("n"));
    }
    
    public void mostrarLista(){
        System.out.println("El tamaño de la lista es:" + razasArrayList.size() + "\n");
        System.out.println("Los elementos de la lista son: ");
        for (String string : razasArrayList) {
            System.out.println(string);
        }
    }
    
    public void eliminarRaza(String raza){
    
        if (razasArrayList.contains(raza)) {
            razasArrayList.remove(raza);
            Collections.sort(razasArrayList);
        }else{
            System.out.println("La raza no estaba en la lista");
        }
    }
    
    public void eliminarRazaIterator(String raza){
        iterador = razasArrayList.iterator();
        while (iterador.hasNext()) {
            String next = iterador.next();
            if (next.equals(raza)) {
                iterador.remove();
            }
        }
        Collections.sort(razasArrayList);
    } 
}
