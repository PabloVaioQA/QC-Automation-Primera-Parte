package poo10;

import static java.lang.Math.random;
import java.util.Arrays;

/**
 *
 * @author vaiop
 */
public class POO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        double random;
        
        for (int i = 0; i < arregloA.length; i++) {
            
            random = Math.random()*10;
            Arrays.fill(arregloA, i, i+1, random);
            System.out.print("["+ arregloA[i] +"]");
            
        }
        System.out.println(" ");
        
        Arrays.sort(arregloA);
        
        for (int i = 0; i < arregloA.length; i++) {
            
            System.out.print("["+ arregloA[i] +"]");
            
        }
        System.out.println(" ");
        
        for (int i = 0; i < 10; i++) {
            
            Arrays.fill(arregloB, i , i+1, arregloA[i]);
            
        }
        
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        
         for (int i = 0; i < arregloB.length; i++) {
            
            System.out.print("["+ arregloB[i] +"]");
            
        }
        System.out.println(" ");
    }
    
}
