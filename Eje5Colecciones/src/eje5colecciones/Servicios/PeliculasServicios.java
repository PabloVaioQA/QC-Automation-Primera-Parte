/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje5colecciones.Servicios;

import eje4colecciones.Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class PeliculasServicios {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Peliculas> ListaPeliculas = new ArrayList();

    public void CrearPelicula() {
        String Respuesta;
        do {
            Peliculas p = new Peliculas();
            System.out.println("Ingrese el nombre de la pelicula");
            p.setTitulo(Leer.next());
            System.out.println("Ingrese el nombre del director");
            p.setDirector(Leer.next());
            System.out.println("Ingrese la duracion de la Pelicula");
            p.setDuracion(Leer.nextDouble());
            ListaPeliculas.add(p);
            System.out.println("Desea agregar otra Peli?:) (s/n)");
            Respuesta = Leer.next();
        } while (Respuesta.equalsIgnoreCase("S"));

    }

    public void MostrarLista() {

        System.out.println("\n LA LISTA DE PELICULAS ES: \n");

        for (Peliculas ListaPelicula : ListaPeliculas) {
            System.out.println("Titulo:" + ListaPelicula.getTitulo());
            System.out.println("Director:" + ListaPelicula.getDirector());
            System.out.println("La duracion es de " + ListaPelicula.getDuracion());
        }

    }

    public void PeliculasMayor1() {

        System.out.println("\n LAS PELICULAS DE MAS DE UNA HORA SON : \n");
        for (Peliculas ListaPelicula : ListaPeliculas) {
            if (ListaPelicula.getDuracion() > 1) {
                System.out.println("Titulo:" + ListaPelicula.getTitulo());
                System.out.println("Director:" + ListaPelicula.getDirector());
                System.out.println("La duracion es de " + ListaPelicula.getDuracion());
            }

        }
    }

    public void MayorMenor() {

        System.out.println("\n LAS PELICULAS DE MAYOR A MENOR DURACION SON: \n");
        Collections.sort(ListaPeliculas, (Peliculas p1, Peliculas p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));

        for (Peliculas ListaPelicula : ListaPeliculas) {
            System.out.println("Titulo:" + ListaPelicula.getTitulo());
            System.out.println("La duracion es de " + ListaPelicula.getDuracion());

        }
    }

    public void MenorMayor() {

        System.out.println("\n LAS PELICULAS DE MENOR A MAYOR DURACION SON: \n");
        Collections.sort(ListaPeliculas, (Peliculas p1, Peliculas p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));

        for (Peliculas ListaPelicula : ListaPeliculas) {
            System.out.println("Titulo:" + ListaPelicula.getTitulo());
            System.out.println("La duracion es de " + ListaPelicula.getDuracion());

        }
    }

    public void TituloAlf() {

         System.out.println("\n ALF POR TITULO: \n");
        Collections.sort(ListaPeliculas,Comparator.comparing(Peliculas::getTitulo) );
        for (Peliculas ListaPelicula : ListaPeliculas) {
            System.out.println("Titulo:" + ListaPelicula.getTitulo());
            System.out.println("La duracion es de " + ListaPelicula.getDuracion());
        }
    }

    public void DirectorAlf() {

        System.out.println("\n ALF POR DIRECTOR: \n");
        Collections.sort(ListaPeliculas,Comparator.comparing(Peliculas::getDirector) );
        for (Peliculas ListaPelicula : ListaPeliculas) {
            System.out.println("Titulo:" + ListaPelicula.getTitulo());
            System.out.println("Director:" + ListaPelicula.getDirector());
            System.out.println("La duracion es de " + ListaPelicula.getDuracion());
        }
    }

}
