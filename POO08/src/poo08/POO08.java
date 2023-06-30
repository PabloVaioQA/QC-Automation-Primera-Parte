/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo08;

import Entidades.Cadena;
import Servicios.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class POO08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCadena sc = new ServicioCadena();
        
        Cadena cad1;
        
        cad1 = sc.creaCadena();
        System.out.println(sc.mostrarVocales(cad1));
        System.out.println(sc.invertirFrase(cad1));
        
        System.out.println("Ingrese letra a Buscar: ");
        String letra = leer.nextLine();
        System.out.println(sc.vecesRepetidas(letra, cad1));
        
        System.out.println("Ingrese una frase: ");
        String frase3 = leer.nextLine();
        System.out.println(sc.compararLongitud(frase3, cad1));
        
        sc.unirFrases(frase3, cad1);
        sc.reemplazar(cad1);
        
        System.out.println("Ingrese letra a buscar");
        char Letra = leer.next().charAt(0);
        System.out.println(sc.contiene(cad1, Letra));
        
        
    }
    
}
