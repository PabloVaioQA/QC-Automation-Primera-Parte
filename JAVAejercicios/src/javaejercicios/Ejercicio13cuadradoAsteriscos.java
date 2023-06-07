/*
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio13cuadradoAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer3 = new Scanner(System.in);
        
        int elementos;
        
        System.out.println("ingrese la cantidad de elementos por lado ");
        elementos = leer3.nextInt();
        
        for(int i=0; i< elementos; i++){
            
            for (int j=0 ; j< elementos; j++){
                
                if (i == 0 || j == 0 || i == elementos-1 || j == elementos-1) {
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println(" ");
            
        }
    }
    
}
