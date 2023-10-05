/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author VBehe
 */
public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private pistolitaAgua pistolita;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, pistolitaAgua pistolita) {
        this.jugadores = jugadores;
        this.pistolita = pistolita;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public pistolitaAgua getPistolita() {
        return pistolita;
    }

    public void setPistolita(pistolitaAgua pistolita) {
        this.pistolita = pistolita;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", pistolita=" + pistolita + '}';
    }
   
    
}
