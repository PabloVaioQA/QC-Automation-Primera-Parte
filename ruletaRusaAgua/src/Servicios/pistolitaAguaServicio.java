/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.pistolitaAgua;
import java.util.Random;

/**
 *
 * @author VBehe
 */
public class pistolitaAguaServicio {
    
    public pistolitaAgua llenarRevolver () {
        
        pistolitaAgua p1 = new pistolitaAgua();
        
        return p1;
    }
    
    public boolean mojar(pistolitaAgua p1) {
        
        if (p1.getPosicionActual() == p1.getPosicionAgua()) {
            
            return true;
        } else { return false; }
    }
    
    public void siguienteChorro (pistolitaAgua p1) {
        
        if(p1.getPosicionActual() == 4) {
            
            p1.setPosicionActual(0);
        } else { p1.setPosicionActual(p1.getPosicionActual()+1);
    }
        
    
}}
