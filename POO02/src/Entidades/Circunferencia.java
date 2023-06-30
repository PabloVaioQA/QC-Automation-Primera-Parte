
package Entidades;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Circunferencia {
    
    private float radio;
    private double pi = 3.1415;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese radio: ");
        radio = leer.nextFloat();
    }
    
    public void area(){
        System.out.println("El area es: "+ pi *(radio*radio));
    }
    
    public void perimetro(){
        System.out.println("El perimetro es: " + (2 * pi * radio) );
    }
}
