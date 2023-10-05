package Servicios;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class CineServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cine cine = new Cine();
    
    public void crearSala(){
        
        
        Pelicula peli = new Pelicula("Tiburon 12", "Steven Spielverg", 135, 14);
        String aux ="";
        String aux2 = "";
        int contador = 1;
        HashMap<Integer, String> butacas = new HashMap<>();
           
        do {
            for (int i = 8; i > 0; i--) {
                aux2 = String.valueOf(i);

                for (int j = 0; j < 6; j++) {

                    if (j == 0) {
                        aux = "A";

                    } else if (j == 1) {
                        aux = "B";

                    } else if (j == 2) {
                        aux = "C";

                    } else if (j == 3) {
                        aux = "D";

                    } else if (j == 4) {
                        aux = "E";

                    } else if (j == 5) {
                        aux = "F";
                    }
                    contador++;
                    butacas.put(contador, aux2 + aux +"  ");
                }
                
            }
            
        } while (contador <= 48);
        
        
        cine.setMap(butacas);
        cine.setPelicula(peli);
        cine.setPrecio(100);
        mostrarCine(cine);
        
    }
    
    public void mostrarCine(Cine cine){
        
        for (HashMap.Entry<Integer,String> entry: cine.getMap().entrySet() ) {
            
            Integer clave = entry.getKey();
            String valor = entry.getValue();
            if(entry.getKey()== 7 ||entry.getKey()== 13 ||entry.getKey()== 19||entry.getKey()== 25|| entry.getKey()== 31 || entry.getKey()== 37 ||entry.getKey()== 43){
            System.out.println(valor);
            }else{
            System.out.print(valor);
            }
        }
    }
    
    public void crearEspectadores(){
        ArrayList<Espectador> espectadores = new ArrayList<>();
        
        Espectador pers1 = new Espectador("Pablo", 32, 100);
        espectadores.add(pers1);
        Espectador pers2 = new Espectador("Valentina", 32, 1000);
        espectadores.add(pers2);
        Espectador pers3 = new Espectador("Emily", 27, 200);
        espectadores.add(pers3);
        Espectador pers4 = new Espectador("Jhuly", 29, 300);
        espectadores.add(pers4);
        Espectador pers5 = new Espectador("Pepe", 30, 10);
        espectadores.add(pers5);
        Espectador pers6 = new Espectador("Pablo", 57, 100);
        espectadores.add(pers6);
        Espectador pers7 = new Espectador("Valen", 10, 5);
        espectadores.add(pers7);
        Espectador pers8 = new Espectador("Emilia", 28, 200);
        espectadores.add(pers8);
        Espectador pers9 = new Espectador("Julio", 23, 300);
        espectadores.add(pers9);
        Espectador pers10 = new Espectador("Pepito", 12, 10);
        espectadores.add(pers10);
        
        System.out.println("");
        comprarEntrada(espectadores);
        
    }
    
    
    public void comprarEntrada( ArrayList<Espectador> espectadores){
       
        
        for (Espectador espectador : espectadores) {
            
            if(cine.getPelicula().getEdadMin() <= espectador.getEdad() || espectador.getDinero() >= cine.getPrecio()){
                System.out.println(espectador);
                Random x = new Random(47);
                
                System.out.println("OK, Se compro la entrada/Butaca " + x);
            }else{
                System.out.println("El espectador no cumple con la edad permitida o tiene dinero insuficiente ");
            }
        }
    
    }
    
}
