/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo02;

import Entidades.Circunferencia;

/**
 *
 * @author vaiop
 */
public class POO02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia c = new Circunferencia(15);
        
        c.crearCircunferencia();
        c.area();
        c.perimetro();
        
    }
    
}
