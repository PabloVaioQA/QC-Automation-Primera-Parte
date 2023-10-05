
package javaexcepcionesej03;

import Entidades.DivisionNum;
import Entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaExcepcionesEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        /*
        System.out.println("Ingrese un numero");
        String n1 = leer.nextLine();
        System.out.println("Ingrese otro numero");
        String n2 = leer.nextLine();
        
        
        try{
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        
        DivisionNumero dn = new DivisionNumero(num1, num2);
        System.out.println(dn.dividir());
        
        } catch(InputMismatchException e){
            System.out.println("Ingreso erroneo");
            
        }catch(NumberFormatException e){
            System.out.println("Debe ingresar números");
            
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
        */
       
        
        /*
        try{
            String b = leer.next();
            int num1 = leer.nextInt();
            int num2 = Integer.parseInt(b);
        
        DivisionNumero dn = new DivisionNumero(num2, num1);
        System.out.println(dn.dividir());
        
        } catch(InputMismatchException e){
            System.out.println("Ingreso erroneo");
            
        }catch(NumberFormatException e){
            System.out.println("Debe ingresar números");
            
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
        */
        
        
        DivisionNum dn = new DivisionNum();
        
        int x = 0, y = 0;
        String num1;

        // Método 1
        System.out.print("Escriba el número 1: ");
        num1 = leer.nextLine();
        try {
            x = Integer.parseInt(num1);
        } catch (NumberFormatException a) {
            System.out.println("Lo que ingreso para el primer número no corresponde a un número.");
        }
        System.out.print("Escriba el número 2: ");
        try {
            y = leer.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Error por intentar ingresar letras en un campo de número.");
        }
        try {
            System.out.println("El resultado es: " + dn.DivisionNum(x, y));
        } catch (ArithmeticException a) {
            System.out.println("No se pueden dividir esos números.");
        }
        /*
        //Método 2
        try {
            dn.DivisionNum(Integer.parseInt(leer.nextLine()), leer.nextInt());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("no es posible la división entre cero");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("no se puede convertir a numero");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("el valor ingresado no es un entero");
        }
        */
        
        
       
    }
    
}
