package mascotapp;

import mascotapp.servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {
        ServicioMascota sm = new ServicioMascota();

        System.out.println("-------------------------");
        sm.mostrarLista();
     
        System.out.println("-------------------------");
        sm.eliminarRazaIterator("Pug");
        sm.mostrarLista();
    }
    
}
