
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Persona {
    private String Nombre;
    private Date fecha;
    private int edad;

    public Persona() {
    }

    public Persona(String Nombre, Date fecha, int edad) {
        this.Nombre = Nombre;
        this.fecha = fecha;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", fecha=" + fecha + ", edad=" + edad + '}';
    }
    
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre: ");
        this.Nombre = leer.nextLine();
        
        System.out.println("Ingrese fecha de nacimiento, Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt()-1;
        System.out.println("Año: ");
        int anio = leer.nextInt()-1900;
        
        this.fecha = new Date (anio,mes,dia);
       
    } 
    
    public void calcularEdad(Persona p){
        Date fechaAc = new Date();
        Date fechaP = p.getFecha();
        
        int anioP = fechaAc.getYear()- fechaP.getYear();
        int mesP =  fechaAc.getMonth() - fechaP.getMonth();
        int diaP =  fechaAc.getDay() - fechaP.getDay();
        
        if(mesP<0){
            anioP-=1;
        }
        else if(mesP == 0 && diaP<0){
            anioP-=1;
        }
        p.setEdad(anioP);
        System.out.println(p.Nombre + " tiene " + anioP + " años");
    }
    
    public boolean menorQue(int edad2, Persona p){
        boolean flag;
        
        if(edad2 > p.getEdad()){
            flag = true;
            System.out.println(flag + " Sos mayor a " + p.getNombre());
        }else{
            flag = false;
            System.out.println(flag + " Sos menor a " + p.getNombre());
        }
        return flag;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: " + p.Nombre);
        System.out.println("Fecha de Naciemiento: " + p.getFecha());
        System.out.println("Edad de " + p.getNombre() +":" + p.getEdad());
    
    }
  
    
    
    
    
    
}
