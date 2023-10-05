/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.pistolitaAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VBehe
 */
public class jugadorServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    ArrayList <Jugador> jugadores = new ArrayList();
    
    public ArrayList<Jugador> crearJugadores () {
        
        int respuesta;
        
        System.out.println ("¿Cuántos jugadores van a jugar?");
        respuesta = leer.nextInt();
        
        for (int i = 1; i <= respuesta; i++) {
            
            Jugador p1 = new Jugador();
            
            jugadores.add(p1);
        }
        
        return jugadores;
    }
    
    public boolean disparo (pistolitaAgua p1) {
        
        pistolitaAguaServicio pa1 = new pistolitaAguaServicio();
        
        boolean disparo = pa1.mojar(p1);
        pa1.siguienteChorro(p1);
        if(disparo == true) {
            
            return true;
          
        } else { return false;}
    }
}
