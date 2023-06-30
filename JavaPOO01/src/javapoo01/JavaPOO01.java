/*
*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*
*/

package javapoo01;

import Entidades.Libro;
import ServicioLibro.ServicioLibro;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaPOO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioLibro sm =  new ServicioLibro();
        
        Libro L1 = sm.crearLibro();
        
        System.out.println(L1.toString());
        
        Libro L2 = sm.crearLibro();
        
         System.out.println(L2.toString());
        
        
    }
    
}
