/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
package poo11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class POO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia;
        int mes;
        int anio;
        Date fechaUsuario = new Date();
        Date fechaActual = new Date();
        
        System.out.println("Ingrese el dia ");
        fechaUsuario.setDate(leer.nextInt());
        System.out.println("Ingrese el mes ");
        fechaUsuario.setMonth(leer.nextInt()-1);
        System.out.println("Ingrese el año ");
        fechaUsuario.setYear(leer.nextInt()-1900);
        
       
        System.out.println(fechaUsuario);
        //fecha.compareTo(fechaActual);
        
        int diferencia = (fechaActual.getYear())- (fechaUsuario.getYear());
        System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es: " + diferencia);
    }
    
}
