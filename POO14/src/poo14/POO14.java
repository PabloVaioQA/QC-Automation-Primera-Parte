/*
 * Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 */
package poo14;

import Entidad.Movil;
import Servicios.ServiciosMovil;
import java.util.Arrays;

/**
 *
 * @author vaiop
 */
public class POO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosMovil sm = new ServiciosMovil();
        Movil movil = sm.cargarCelular();
        
        System.out.println(movil);
        System.out.println(Arrays.toString(movil.getCodigo()));
        
        
        
    }
    
}
