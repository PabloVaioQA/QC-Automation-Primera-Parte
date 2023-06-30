/*
 * Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 */
package poo13;

import Entidad.Curso;
import Servicio.ServicioCurso;
import java.util.Arrays;

/**
 *
 * @author vaiop
 */
public class POO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioCurso sc = new ServicioCurso();
        Curso curso = sc.crearCurso();
        
        System.out.println(curso);
        System.out.println(Arrays.toString(curso.getAlumnos()));
        System.out.println(" ");
        System.out.println("La ganancia semanal del curso es: " + sc.calcularGananciaSemanal(curso)); 
    }
    
}
