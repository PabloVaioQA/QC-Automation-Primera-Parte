/*
 * Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 */
package javarelacionesex02;


import Entidades.Cine;
import Entidades.Espectador;
import Servicios.CineServicio;
import java.util.ArrayList;

/**
 *
 * @author vaiop
 */
public class JavaRelacionesEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        
        
        cs.crearSala();
        cs.crearEspectadores();
        
        /*
        ArrayList<Espectador> espectadores = new ArrayList<>();
        
        Espectador pers1 = new Espectador("Pablo", 32, 100);
        espectadores.add(pers1);
        Espectador pers2 = new Espectador("Valentina", 32, 1000);
        espectadores.add(pers2);
        Espectador pers3 = new Espectador("Emily", 27, 200);
        espectadores.add(pers3);
        Espectador pers4 = new Espectador("Jhuly", 29, 300);
        espectadores.add(pers4);
        Espectador pers5 = new Espectador("Pepe", 30, 10);
        espectadores.add(pers5);
        Espectador pers6 = new Espectador("Pablo", 57, 100);
        espectadores.add(pers6);
        Espectador pers7 = new Espectador("Valen", 10, 1000);
        espectadores.add(pers7);
        Espectador pers8 = new Espectador("Emilia", 28, 200);
        espectadores.add(pers8);
        Espectador pers9 = new Espectador("Julio", 23, 300);
        espectadores.add(pers9);
        Espectador pers10 = new Espectador("Pepito", 12, 10);
        espectadores.add(pers10);
        */
        
        
        
        
        
        
    }
    
}
