package Entidad;

import java.util.ArrayList;

public class Ahorcado {
	
	private String palabra[];
    private ArrayList<String> letrasEncontradas;
    private int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, ArrayList<String>  letrasEncontradas, int cantidadJugadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadas = cantidadJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public ArrayList<String>  getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(ArrayList<String>  letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

}
