/*
 * 16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package javaejercicios;

/**
 *
 * @author vaiop
 */
public class Ejercicio16vectornAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.util.Scanner leer3 = new java.util.Scanner(System.in);
        
        int N = 5 ;
        int[] vector;
        vector = new int[N];
        int Num;
        int contador = 0;
        
        //llenamos el vector con numeros aleatorios
        for (int i = 0; i < N ;i++){
            vector[i]= (int) Math.floor(Math.random()*10);
        }
        
        //Pedimos numero a buscar
        System.out.println("Ingrese numero a buscar: ");
        Num = leer3.nextInt();
        
        //mostrar vector
        for(int i=0; i < 4; i++) {
            System.out.println("["+vector[i]+"]");
        }
        
        //Buscamnos el numero
        for(int i = 0; i < 4; i++) {
            if(vector[i] == Num){
                System.out.println("El numero "+ Num +" se encuentra en posicion: "+ i + " del vector");
                contador = contador + 1;
            } 
        }
        if (contador == 0){
            System.out.println("El numero no se encuentra dentro del vector");
        }else{
            System.out.println("El numero se encuentra " + contador + " veces en el vector");}
        
        }
    }
    

