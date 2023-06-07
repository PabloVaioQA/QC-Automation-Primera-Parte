/*
 *  EJERCICIO 11
    Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
    en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
    reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
    vocales acentuadas) se mantienen sin cambios.
 */
package javaintro;

/**
 *
 * @author vaiop
 */
public class GuiaJava11caracteresYsimbolos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int largo;
        String frase = "Ayer, lunes, salimos a las once y 10.";
        String frase2= "";
        String letra;
        largo = frase.length();
        
        for(int i=0 ; i<largo; i++ ){
            
            letra = frase.substring(i,i+1);
            
            switch(letra){
                case "a":
                case "A":
                    frase2 = frase2.concat("@");
                    break;
                case "e":
                case "E":
                    frase2 = frase2.concat("#");
                    break;
                case "i":
                case "I":
                    frase2 = frase2.concat("$");
                    break;
                case "o":
                case "O":
                    frase2 = frase2.concat("%");
                    break;
                case "u":
                case "U":
                    frase2 = frase2.concat("*");
                    break;
                default:
                    frase2 = frase2.concat(letra);
            }
           
        }
        
        System.out.println(frase2);
    }
    
}
