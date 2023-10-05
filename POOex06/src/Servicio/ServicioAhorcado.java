package Servicio;

import Entidad.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class ServicioAhorcado {
    
    Scanner leer = new Scanner(System.in);
    ArrayList letrasIngresadas = new ArrayList();
    
    public Ahorcado crearJuego(){
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingrese palabra a buscar: ");
        String palabra = leer.nextLine();
        String[] palabra2 = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            palabra2[i] = palabra.substring(i, i+1);
            System.out.print(palabra2[i]);        
        }
        ahorcado.setPalabra(palabra2);
        System.out.println(" ");
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            
            System.out.print("["+ahorcado.getPalabra()[i]+"]");        
        } 
        
        System.out.println("Ingrese cantidad de intentos: ");
        ahorcado.setJugMax(leer.nextInt());
        ahorcado.setCantidad(0);
        return ahorcado;
    }
    
    
    public void longitud(Ahorcado ahorcado){
        System.out.println("La palabra a buscar tiene " + ahorcado.getPalabra().length + "letras");
    }
    
    
    public boolean buscar(String letra, Ahorcado ahorcado){
        String[] palabra = ahorcado.getPalabra();
        boolean encontrado = false;
        
        for (int i = 0; i < palabra.length; i++) {
            if(palabra[i].equalsIgnoreCase(letra) ){
                letrasIngresadas.add(letra);
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("La letra >" + letra + "< ESTA en la palabra ");
        }else{
            System.out.println("La letra >" + letra + "< NO esta en la palabra ");
        }
        return encontrado;
    }
    
    
    public boolean encontradas(String letra, Ahorcado ahorcado){
        
        boolean encontrado = buscar(letra,ahorcado);
        
        if(encontrado){
            System.out.println("Numero de letras(encontradas, faltantes):("+ letrasIngresadas.size() + "," + (ahorcado.getPalabra().length - letrasIngresadas.size())+")");    
        }
        return false;
        
    
    }
    
    public void intentos(Ahorcado ahorcado, boolean encontrado ){
        int intentos = ahorcado.getJugMax();
        
        if(!encontrado){
            intentos --;
            ahorcado.setCantidad(intentos);
        }
    }
    
    public void juego(){
        Ahorcado ahorcado = crearJuego();
        String letra;
        do{
            
            System.out.println("Ingrese una letra: ");
            letra = leer.nextLine();
            
            longitud(ahorcado);
            boolean encontrado = encontradas(letra, ahorcado);
            intentos(ahorcado, encontrado);
        }while(ahorcado.getCantidad()>0 && ahorcado.getPalabra().length != letrasIngresadas.size());
        
    }
    
   // private List<Character> letrasIngresadas = new ArrayList<>();
}
