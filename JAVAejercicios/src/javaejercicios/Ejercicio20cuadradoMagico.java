/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package javaejercicios;

/**
 *
 * @author vaiop
 */
public class Ejercicio20cuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] numeros = {{2,7,6},{9,5,1},{4,3,8}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + " ");
                
            }
            System.out.println(" ");
        }
        
        
        
        int suma = 15;
        boolean algo = true;
        
        for (int i = 0; i < numeros.length; i++) {
            int validador = 0;
            
            for (int j = 0; j < numeros.length; j++) {
                validador += numeros[i][j];
            }
            if (!(validador == suma)){
            algo = false;
            break;
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            int validador = 0;
            
            for (int j = 0; j < numeros.length; j++) {
                validador += numeros[j][i];
            }
            if (!(validador == suma)){
            algo = false;
            break;
            }
        }
        
        int validador2 = 0;
        for (int i = 0; i < numeros.length; i++) {
            
            
           validador2 +=numeros[i][i];
        }
        
        if (!(validador2 == suma)){
        algo = false;
        
        }
        
        int validador3 = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            validador2 += numeros[i][2-i];
            
        }
        
        if (!(validador2 == suma)){
        algo = false;
        
        }
        
        
        if (algo == false){
            System.out.println("La matriz es mágica ");
        }else{
            System.out.println("La matriz NO es mágica");
        }
    }
    
}
