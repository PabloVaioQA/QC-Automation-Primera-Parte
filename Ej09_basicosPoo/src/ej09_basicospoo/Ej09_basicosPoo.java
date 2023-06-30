/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set.  Deberá además implementar los siguientes métodos:  
 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores. 
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package ej09_basicospoo;

import Entidad.Matematica;
import Servicio.MatematicaServico;

public class Ej09_basicosPoo {

    public static void main(String[] args) {
       Matematica math = new Matematica();
       MatematicaServico mathServ = new MatematicaServico();
       
       double n = Math.random()*10;
       math.setNum1(n);
       n = Math.random()*10;
       math.setNum2(n);
        System.out.println("Num 1= " + math.getNum1());
        System.out.println("Num 2= " + math.getNum2());
       //double mayor = MatematicaServico.devolverMayor(math);
       
        System.out.println("El mayor es " +mathServ.devolverMayor(math));
       mathServ.calcularPotencia(math);
       mathServ.calculaRaiz(math);
       
    }
    
}
