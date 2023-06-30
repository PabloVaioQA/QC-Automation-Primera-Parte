package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class ServicioCurso {
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(Curso curso){
        String[] alumnos = curso.getAlumnos();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero del Alumno" + (i+1));
            alumnos[i] = leer.nextLine();
        }
      
    }
    
    public Curso crearCurso(){
        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso: ");
        curso.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese el turno del curso (mañana/tarde): ");
        curso.setTurno(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas");
        curso.setCantidadHorasPorDia(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese la cantidad de dias por semana");
        curso.setCantidadDiasPorSemana(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el precio por hora del curso");
        curso.setPrecioPorHora(Double.parseDouble(leer.nextLine()));
        cargarAlumnos(curso);
        return curso;
        
    }
    
    public double calcularGananciaSemanal(Curso curso){
    
        return (curso.getCantidadDiasPorSemana()*curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getAlumnos().length);
    
    }
    
    
    
    
    
}
