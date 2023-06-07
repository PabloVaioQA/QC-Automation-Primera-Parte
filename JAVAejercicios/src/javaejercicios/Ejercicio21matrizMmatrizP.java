/*
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package javaejercicios;

/**
 *
 * @author vaiop
 */
public class Ejercicio21matrizMmatrizP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int[][] matrizM = new int[10][10] = {{1,26,36,47,5,6,72,81,95,10},{11,12,13,21,41,22,67,20,10,61},{56,78,87,90,09,90,17,12,87,67},{41,87,24,56,97,74,87,42,64,35},{32,76,79,1,36,5,67,96,12,11},{99,13,54,88,89,90,75,12,41,76},{67,78,87,45,14,22,26,42,56,78},{98,45,34,23,32,56,74,16,19,18},{24,67,97,46,87,13,67,89,93,24},{21,68,78,98,90,67,12,41,65,12}};
        int[][] matrizM = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,36,5,67,0,0,0},{0,0,0,0,89,90,75,0,0,0},{0,0,0,0,14,22,26,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        int[][] matrizP = {{36,5,67},{89,90,75},{14,22,26}};
        
        //Mostrar MatrizM
        System.out.println("MATRIZ M");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizM[i][j]+"  ");
            }
            System.out.println(" ");
        }
        //Mostrar MatrizP
        System.out.println("MATRIZ P");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(matrizP[i][j]+"  ");
            }
            System.out.println("  ");
        }
        
        
        //Buscar coordenada de coincidencia
        for (int i = 0; i <= 7 ; i++) {
            
            for (int j = 0; j <= 7; j++) {
                
                if(matrizM[i][j] == matrizP[0][0]){
                    System.out.println("Coordenadas: i: " + i+" j: "+ j);
                    int x = i;
                    int y = j;
                    //validarMatriz(x,y,matrizM,matrizP);
                    
                    
                }     
            }
        }
        
        //Validar coincidencia matrizM y MatrizP
        /*
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if(matrizM[i + x][j + y] = matrizP[i][j]){
                    boolean validar = verdadero;
                    
                }   
            }
        }
*/
        validarMatriz(x,y,matrizM,matrizP);
        if(validar){
            System.out.println("La matrizP esta contenida dentro de la MatrizM! En las coordenadas"+ x +y);  
        }else{
            System.out.println("La matrizP NO esta");
        }
    }
        
    
    
    //Validar MatrizM con MatrizP   
    public static boolean validarMatriz(int x,int y,int[][] matrizM, int[][] matrizP){
    boolean validar = false;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if(matrizM[i + x][j + y] == matrizP[i][j]){
                    boolean validar = true;
                    
                }   
            }
        }
            
    
    
    
    
 
    
    

    }
}