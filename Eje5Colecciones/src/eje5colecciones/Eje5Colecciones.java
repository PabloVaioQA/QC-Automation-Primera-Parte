/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje5colecciones;

import eje5colecciones.Servicios.PeliculasServicios;

/**
 *
 * @author Usuario
 */
public class Eje5Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PeliculasServicios p = new PeliculasServicios();
        p.CrearPelicula();
        p.MostrarLista();
        p.PeliculasMayor1();
        p.MayorMenor();
        p.MenorMayor();
        p.TituloAlf();
        p.DirectorAlf();
        
    }
    
}
