/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package javaextras;

/**
 *
 * @author vaiop
 */
public class JavaEx2unaVariableAux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //una sola variable auxiliar X
        int A = 5;
        int B = 12;
        int C = 15;
        int D = 20;
        int X;
        
        System.out.println("Lo valores son: " );
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        X = B;
        B = C;
        C = A;
        A = D;
        D = X;
        
        System.out.println("Lo nuevos valores son: " );
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
    
}
