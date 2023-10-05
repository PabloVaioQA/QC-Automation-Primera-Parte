
package ruletarusaagua;

import Entidades.Jugador;
import Entidades.pistolitaAgua;
import Servicios.juegoServicio;
import Servicios.jugadorServicio;
import Servicios.pistolitaAguaServicio;
import java.util.ArrayList;

/**
 *
 * @author VBehe
 */
public class RuletaRusaAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        jugadorServicio js = new jugadorServicio();
        pistolitaAguaServicio pa1 = new pistolitaAguaServicio ();
        pistolitaAgua p1 = new pistolitaAgua();
        juegoServicio jservice = new juegoServicio();
        ArrayList<Jugador> jugadores = new ArrayList();
        
        jugadores = js.crearJugadores();
        p1 = pa1.llenarRevolver();
        jservice.llenarJuego(jugadores, p1);
        jservice.ronda();
        
        
        
    }
    
}
