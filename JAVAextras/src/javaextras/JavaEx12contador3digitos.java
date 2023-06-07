/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
package javaextras;

/**
 *
 * @author vaiop
 */
public class JavaEx12contador3digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 000;
        int num1 =0;
        int num2 =0;
        int num3 =0;
        
        do{
            System.out.println(num1+"-"+num2+"-"+num3);
            if(num3==9){
            num3 = 0;
            num2 = num2+1;
            }else{
            num3=num3+1;
            }
            if(num2==9){
            num2 = 0;
            num1 = num1+1;
            }
            
            
        }while(num3 != 1);
    }
    
}
