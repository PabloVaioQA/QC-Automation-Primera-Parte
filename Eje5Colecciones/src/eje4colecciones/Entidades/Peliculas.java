/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje4colecciones.Entidades;

/**
 *
 * @author Usuario
 */
public class Peliculas {
    
    String Titulo;
    String Director;
    Double Duracion;

    public Peliculas() {
    }

    public Peliculas(String Titulo, String Director, Double Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "Titulo=" + Titulo + ", Director=" + Director + ", Duracion=" + Duracion + '}';
    }
    
    
    
}
