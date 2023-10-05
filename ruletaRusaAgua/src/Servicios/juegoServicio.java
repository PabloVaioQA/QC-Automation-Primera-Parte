/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.pistolitaAgua;
import java.util.ArrayList;

/**
 *
 * @author VBehe
 */
public class juegoServicio {
    
    Juego j1 = new Juego (); 
    
    public void llenarJuego(ArrayList<Jugador> jugadores, pistolitaAgua p1) {
        
        j1.setJugadores(jugadores);
        j1.setPistolita(p1);
    }
    
    public void ronda () {
        
        jugadorServicio js = new jugadorServicio();
        boolean salir = true;
        
        while (salir) {
        for (Jugador aux : j1.getJugadores()) {
           js.disparo(j1.getPistolita());
           System.out.println ("Alguien se disparó" + aux);
           if (js.disparo(j1.getPistolita())) {
               aux.setMojado(true);
               System.out.println ("Te moriste igual que yo mientras hacia este programa :v");
               System.out.println ("El jugador perdedor es: " + aux.toString());
               salir = false;
               break;
           }
           
           
        }
    } 
    
} }
