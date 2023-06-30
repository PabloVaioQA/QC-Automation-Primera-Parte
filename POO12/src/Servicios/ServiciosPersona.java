
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class ServiciosPersona {

    
    public static Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        
        System.out.println("Ingrese el Nombre de la Persona:");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese el dia ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes ");
        int mes = (leer.nextInt()-1);
        System.out.println("Ingrese el año ");
        int anio = (leer.nextInt()-1900);
        
        Date fechaNacimiento = new Date(anio,mes,dia);
        return new Persona(nombre,fechaNacimiento);
        
    }
    
    public static int calcularEdad(Persona p1){
        Date fechaActual = new Date();
        Date fechaP = p1.getFechaNacimiento();
        int anioP = fechaActual.getYear() - fechaP.getYear();
        int mesP = fechaActual.getMonth() - fechaP.getMonth();
        int diaP = fechaActual.getDay() - fechaP.getDay();
        
        if(mesP<0){
            anioP-=1;
        }
        else if(mesP == 0 && diaP<0){
            anioP-=1;
        }
        return anioP;
    }
    
    public static boolean menorQue(int edad, int anioP){
        boolean flag;
        if(edad > anioP ){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
    
    public static void mostrarPersona(Persona p1, int anioP){
        
        
        
    
    }
    
    
}
