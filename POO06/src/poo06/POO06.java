package poo06;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class POO06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        
        Cafetera c = new Cafetera();
        
        do{
            System.out.println("Que desea hacer: ");
            System.out.println("1: Llenar Cafetera" );
            System.out.println("2: Servir Taza de café" );
            System.out.println("3: Vaciar Cafetera" );
            System.out.println("4: Agregar Cafe" );
            System.out.println("5: Salir" );
            opc = leer.nextInt();
        
        
            switch(opc){
                case 1:
                    c.llenarCafetera();
                    System.out.println("La cafetera tiene: " + c.getCantidadActual() );
                    break;
                case 2:
                    c.servirTaza(25);
                    c.getCantidadActual();
                    break;
                case 3:
                    c.vaciarCafetera();
                    c.getCantidadActual();
                    break;
                case 4:
                    c.agregarCafe(50);
                    c.getCantidadActual();
                    break;
                case 5:
                    System.out.println("Gracias por usar Nespresso");
                    break;
                default:
                    System.out.println("Opcion incorrecta, seleccione otra opción");
                    break;
               
            }
        }while(opc != 5);
    }
    
}

