package javaherenciaej02;

import Entidades.Electrodoméstico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author vaiop
 */
public class JavaHerenciaEj02 {

    public static void main(String[] args) {
        ArrayList<Electrodoméstico> listaElectrodomesticos = new ArrayList();
        Lavadora l1,l2;
        Televisor t1,t2;
        Double precioTotal = 0d;
        Double precio;
        
        l1 = new Lavadora(35, 1000d, 50, "gris", 'd');
        l2 = new Lavadora(30, 1000d, 60, "negro", 'b');
        t1 = new Televisor(720, true , 1000d, 25, "negro", 'c');
        t2 = new Televisor(1080, false , 1000d, 30, "rojo", 'e');
        //t1 = new Televisor(Integer.SIZE, color, Character.MIN_SURROGATE, Integer.SIZE, 0, true);
        //t2 = new Televisor();
        
        listaElectrodomesticos.add(l1);
        listaElectrodomesticos.add(l2);
        listaElectrodomesticos.add(t1);
        listaElectrodomesticos.add(t2);
        
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
            listaElectrodomesticos.get(i).precioFinal();
            precio = listaElectrodomesticos.get(i).getPrecio();
            System.out.println("Precio "+i+": "+precio);
            precioTotal += precio;
        }
        System.out.println("El precio total de todos los electrodomesticos es: " + precioTotal);
        
        
    }
    
}
