package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class ServicioCadena {
    Scanner leer = new Scanner(System.in);
    
    public Cadena creaCadena(){
        Cadena cad1 = new Cadena();
        System.out.println("Ingresa la frase: ");
        cad1.setCadena(leer.nextLine());
        cad1.setLongitud(cad1.getCadena().length());
        return cad1;
    
    }

    public int mostrarVocales(Cadena c){
        String frase = c.getCadena().toLowerCase();
        int contadorVocales=0;
        for(int i = 0; i < c.getLongitud(); i++){
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
            contadorVocales++;
            }
        }
        return contadorVocales;
    }
    
    public String invertirFrase(Cadena cad){
        String frase ="";
        
        for (int i = cad.getLongitud()-1 ; i >= 0; i--) {
            
            frase += cad.getCadena().charAt(i);
           
        }
        return frase;
    
    }
    
    public int vecesRepetidas(String letra, Cadena cad){
        int contador =0;
        
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getCadena().charAt(i) == letra.charAt(0)){
                contador++; 
            }
        }
        return contador;
    
    }
    
    public boolean compararLongitud(String frase1, Cadena cad){
        
        if(frase1.length()== cad.getLongitud()){
            return true;
        }else{ return false; }
        
    
    }
    
    public void unirFrases(String frase1, Cadena cad){
        System.out.println(cad.Cadena + frase1);
    
    }
    
    public void reemplazar(Cadena cad){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Caracter para remplazar la a: ");
        String simbolo = leer.nextLine(); 
        String copiaFrase = "";
        
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getCadena().charAt(i) == 'a'){
                copiaFrase += simbolo ;
            
            }else{
                copiaFrase += cad.getCadena().charAt(i);
            }
        }
        System.out.println(copiaFrase);
    }
    
    public boolean  contiene(Cadena cad, char letra){
        boolean validar = false;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getCadena().charAt(i) == letra){
                 validar = true; 
                 break;
            }
        }
        return validar;
        
    
    }
    
    
}
