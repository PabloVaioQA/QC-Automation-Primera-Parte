
package Servicios;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class ServiciosMovil {
    Scanner leer = new Scanner(System.in);
    
    public Movil cargarCelular(){
        Scanner leer = new Scanner(System.in);
        Movil movil = new Movil();
        
        System.out.println("Ingrese la marca del Celular: ");
        movil.setMarca(leer.nextLine());
        System.out.println("Ingrese el Precio del Celular: ");
        movil.setPrecio(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingrese Modelo del Celular: ");
        movil.setModelo(leer.nextLine());
        System.out.println("Cantidad de memoria RAM ");
        movil.setMemoriaRam(Integer.parseInt(leer.nextLine()));
        System.out.println("Cantidad de Almacenamiento ");
        movil.setAlmacenamiento(Integer.parseInt(leer.nextLine()));
        
        IngresarCodigo(movil);
        return movil;
        
       
    }
    
    public void IngresarCodigo(Movil movil){
        int[] codigo = movil.getCodigo();
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el codigo de 7 numeros de su Celular, de a un digito ");
            System.out.println("Numero " + (i+1));
            codigo[i] = Integer.parseInt(leer.nextLine());
        }
    }
    
    
}
