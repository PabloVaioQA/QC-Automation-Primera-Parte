/*
 *  EJERCICIO 14
    Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class GuiaJava14bucleForEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Elizabeth,Pablo,Juana,Brian,Julieta,Jhuly,Alejandro,Erick
        
        String [] vectorEquipo = new String[8];
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese un Nombre de Compañero de Equipo: ");
            vectorEquipo[i] = leer.nextLine();
            
        }
        
        System.out.println("----------");
        
        
        for(int i=0; i < 7; i++){
            System.out.print("[" + vectorEquipo[i] +"]");
        }            
    }
    
}
