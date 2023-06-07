/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
package javaextras;

/**
 *
 * @author vaiop
 */
public class JavaEx12contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(reemplaza(i,3) + " - " + reemplaza(j,3) + " - " + reemplaza(k,3));
                }
            }
        }
    }

    private static String reemplaza(int i, int valor) {
        String salida = ((Integer)i).toString();
        if (i == valor) {
            salida = "E";
        }
        return salida;
    }
    
}
