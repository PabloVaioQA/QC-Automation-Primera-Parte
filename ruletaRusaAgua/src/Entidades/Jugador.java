/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author VBehe
 */
public class Jugador {
    
    private int ID;
    private String nombre;
    private boolean mojado;
    private static int contador = 0;

    public Jugador() {
    contador++;
    this.ID = contador;
    this.nombre = "Jugador " + ID;
    this.mojado = false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Jugador.contador = contador;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
    
}
