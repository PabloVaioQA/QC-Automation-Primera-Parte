package javaherenciaex02;

import Entidades.Edificio;
import Entidades.Oficina;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaHerenciaEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Edificio> listaEdificios = new ArrayList();
        
        Edificio p1 = new Polideportivo("SanLorenzo", Boolean.FALSE, 2, 3, 5);
        listaEdificios.add(p1);
        Edificio p2 = new Polideportivo("Boca", Boolean.TRUE, 3, 6, 5);
        listaEdificios.add(p2);
        
        System.out.println("Cantidad de personas en Oficina 1: ");
        int pers = leer.nextInt();
        System.out.println("Cantidad de pisos en Oficina 1: ");
        int pisos = leer.nextInt();
        Edificio o1 = new Oficina(pisos, pers, pisos, 4, 25, 7);
        listaEdificios.add(o1);
        
        System.out.println("Cantidad de personas en Oficina 2: ");
        int pers2 = leer.nextInt();
        System.out.println("Cantidad de pisos en Oficina 2: ");
        int pisos2 = leer.nextInt();
        Edificio o2 = new Oficina(pisos2, pers2, pisos2, 5, 15, 8);
        listaEdificios.add(o2);
        
        
        for (Edificio ed : listaEdificios) {
            
            if (ed instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) ed;
                System.out.println("La superficie de "+ ((Polideportivo) ed).getNombre() + " es: "+ ed.calcularSuperficie());
                System.out.println("El Volumen de "+ ((Polideportivo) ed).getNombre() + " es: "+ed.calcularVolumen());
                System.out.println(ed.toString());
            }
            
            if (ed instanceof Oficina) {
                Oficina object = (Oficina) ed;
                System.out.println("La superficie de la ofican es: "+ ed.calcularSuperficie());
                System.out.println("El Volumen de la oficina es: "+ ed.calcularVolumen());
                
                ((Oficina) ed).cantPersonas();
           }
        }
    }
}
