/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaextras;



import java.util.Scanner;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * 
 *
 * @author vaiop
 */
public class JavaEx1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos: ");
        int minutos = leer.nextInt();
        
        int dias, horas, min;
        
        dias = minutos/(60 * 24);
        horas = (minutos %(60 * 24))/60;
        min =(minutos %(60 * 24)) %60;
        
        System.out.println(minutos +" minutos, Son: " + dias +" dias "+ horas +" horas "+ min + " min");
        
        
    }
    
}