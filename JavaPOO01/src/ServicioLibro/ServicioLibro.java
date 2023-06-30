
package ServicioLibro;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class ServicioLibro {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro  crearLibro() {
    
        System.out.println("Ingrese numero de ISBN del Libro");
        int ISBN = leer.nextInt();
        
        System.out.println("Ingrese titulo: ");
        String titulo = leer.next();
        
        System.out.println("Ingrese Autor: ");
        String autor = leer.next();
        
        System.out.println("Ingrese cantidad de paginas: ");
        int numPaginas = leer.nextInt();
        
        return new Libro(ISBN, titulo, autor, numPaginas);
        
        
    }
    
    
}
