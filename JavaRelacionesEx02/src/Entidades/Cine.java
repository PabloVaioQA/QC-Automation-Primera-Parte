package Entidades;

import java.util.Map;

/**
 *
 * @author vaiop
 */
public class Cine {
    
    private Pelicula pelicula;
    private Map<Integer, String> butacas;
    private int precio;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Map<Integer, String> butacas, int precio) {
        this.pelicula = pelicula;
        this.butacas = butacas;
        this.precio = 100;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Map<Integer, String> getMap() {
        return butacas;
    }

    public void setMap(Map<Integer, String> butacas) {
        this.butacas = butacas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", butacas=" + butacas + ", precio=" + precio + '}';
    }
    
    
    
}
