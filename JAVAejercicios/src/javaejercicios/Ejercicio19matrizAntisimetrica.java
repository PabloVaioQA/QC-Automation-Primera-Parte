/*
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaejercicios;

/**
 *
 * @author vaiop
 */
public class Ejercicio19matrizAntisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matrizA = {{0,-2,4},{2,0,2},{-4,-2,0}};
        boolean validador = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!(matrizA[i][j] == matrizA[j][i])){
                    validador = false;
                    break;
                }
                
            }
           
        }
        if(validador){
                System.out.println("La matriz es antisimetrica");
            }else{
                System.out.println("La matriz NO es antisimetrica");
        }
        
    }
    
    
}
