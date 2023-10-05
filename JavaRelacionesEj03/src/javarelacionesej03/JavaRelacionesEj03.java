
package javarelacionesej03;

import Entidades.Baraja;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaRelacionesEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Baraja mazo = new Baraja();
        int opcion =0;
        
        do {
            System.out.println("MENU");
            System.out.println("Elija opcion: ");
            System.out.println("1- Barajar");
            System.out.println("2- Siguiente Carta");
            System.out.println("3- Mostrar Cartas disponibles");
            System.out.println("4- Dar cartas");
            System.out.println("5- Mostrar Cartas sacadas");
            System.out.println("6- Mostrar Baraja");
            System.out.println("7- Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    mazo.barajar();
                    break;
                case 2:
                    System.out.println(mazo.siguienteCarta());
                    break;
                case 3:
                    System.out.println("Le quedan " + mazo.cartasDisponibles() + " cartas disponibles");
                    break;
                case 4:
                    System.out.println("Cuantas cartas quiere dar? ");
                    int dar = leer.nextInt();
                    mazo.darCartas(dar);
                    break;
                case 5:
                    mazo.cartasMonton();
                    break;
                case 6:
                    mazo.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Gracias por Jugar a NicoJuegos.com");
                    break;
                default:
                    System.out.println("opcion incorrecta, ingrese numero valido");
                    break;
            }
        } while (opcion != 7);
        
    }
    
}
