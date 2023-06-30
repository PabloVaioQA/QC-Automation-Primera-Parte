package Entidades;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Rectangulo {
    
    private int base, altura;
    

    public Rectangulo() {
    }

    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese Base");
        setBase(leer.nextInt());
        System.out.println("Ingrese Altura");
        setAltura(leer.nextInt());
        
    }
    public void superficie(){
        System.out.println("La superficie es: "+ base*altura);
    }
    
    public void perimetro(){
        System.out.println("El perimetro es: "+ 2*(base*altura));
    }
    
    public void dibujar(){
    
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if( i==0 || i==altura-1 || j==0 || j==base-1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
