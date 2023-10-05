/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 */
package pooex04;

import Servicio.ServicioNIF;

/**
 *
 * @author vaiop
 */
public class POOex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioNIF sn = new ServicioNIF();
        
        sn.crearNif();
        sn.mostrar();
    }
    
}
