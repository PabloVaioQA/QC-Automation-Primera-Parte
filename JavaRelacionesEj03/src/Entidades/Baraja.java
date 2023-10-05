package Entidades;

import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author vaiop
 */
public class Baraja {
    
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> sacadas = new ArrayList();

    public Baraja() {
        baraja = new ArrayList<>();
        
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) { 
                    baraja.add(new Carta(numero, palo));
                }
            }    
        }    
    }
   
    public void barajar() {
        Collections.shuffle(baraja);
    }

    public Carta siguienteCarta() {
        if (!baraja.isEmpty()) {
            sacadas.add(baraja.get(0));
            return baraja.remove(0);
        } else {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }

    }

    public int cartasDisponibles() {
        return baraja.size();
    }

    public void darCartas(int cantidad) {
        if (cantidad <= baraja.size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println(siguienteCarta().toString());

            }
        } else {
            System.out.println("No hay suficientes cartas en la baraja.");
        }

    }

    public void cartasMonton() {
        if (sacadas.size() > 0) {
            for (Carta sacada : sacadas) {
                System.out.println(sacada);
            }
        } else {
            System.out.println("Aun no  se ha sacado ni una sola carta ");
        }

    }

    public void mostrarBaraja() {
        for (Carta cartas : baraja) {
            System.out.println(cartas);
        }
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }


}
