/*
 *  Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
    comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
    elementos).
 */
package javaextras;

/**
 *
 * @author vaiop
 */
public class JavaEx19dosVectoresIguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = {12,15,22,45};
        int[] vector2 = {12,15,10,5};
        int[] vector3 = {12,15,22,45};
        
        
        System.out.println("Vector 1 ");
        for (int i = 0; i <=3; i++) {
            System.out.print("["+ vector1[i]+"]");
        }
        System.out.println("");
        System.out.println("Vector 2");
        for (int i = 0; i <=3; i++) {
            System.out.print("["+ vector2[i]+"]");
        }
        System.out.println("");
        System.out.println("Vector 3 ");
        for (int i = 0; i <=3; i++) {
            System.out.print("["+ vector3[i]+"]");
        }
        System.out.println(" ");
        
        
        boolean salida = false;
        //Comparo vector1 y vector2
        if (comparaVector(vector1, vector2)) {
            System.out.println("los vectores 1 y 2 son iguales");
        } else {
            System.out.println("los vectores 1 y 2 NO son iguales");
        }
        
        //Comparo vector1 y vector3
        if (comparaVector2(vector1, vector3)) {
            System.out.println("los vectores 1 y 3 son iguales");
        } else {
            System.out.println("los vectores 1 y 3 NO son iguales");
        }
        
       
    }
    
    
    private static boolean comparaVector(int[] vector1, int[] vector2) {
        boolean salida = true;
        for (int i = 0; i <=3; i++) {
            
            salida = salida && vector1[i] == vector2[i];
            if (!salida) return salida;
            
        }
        return salida;
    }
    
    private static boolean comparaVector2(int[] vector1, int[] vector3) {
        boolean salida = true;
        for (int i = 0; i <=3; i++) {
            
            salida = salida && vector1[i] == vector3[i];
            if (!salida) return salida;
            
        }
        return salida;
    }
   
}
