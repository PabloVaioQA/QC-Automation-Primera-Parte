/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

public class MatematicaServico {
    
    public double devolverMayor(Matematica math){
        return Math.max(math.getNum1(), math.getNum2());
        
//        if (math.getNum2() < math.getNum1()) {
//            return math.getNum1();
//        }else if(math.getNum1() < math.getNum2()){ //si el primer if es verdadero no entra al segundo, si es falso entra el segundo if. para el caso de else if
//            return math.getNum2();
//        }else{
//            return 0;
//        }      
    }
    public void calcularPotencia(Matematica math){
        double absNum2 = Math.round(math.getNum2());
        double absNum1 = Math.round(math.getNum1());
        
        System.out.println("La potencia del num mayor es " +Math.pow(Math.max(absNum1, absNum2), Math.min(absNum1, absNum2)));
        
//        
//         if (math.getNum2() < math.getNum1()) {
//             System.out.println("La potencia es " +Math.pow(absNum1, absNum2));
//         }else{
//             System.out.println("La potencia es " +Math.pow(absNum2, absNum1));
//         }
    }
    public void calculaRaiz(Matematica math){
        double absNum2 = Math.round(math.getNum2());
        double absNum1 = Math.round(math.getNum1());
        
         System.out.println("La raiz cuadrada del num menor es " + Math.sqrt(Math.min(absNum1, absNum2)));
         
//        if (math.getNum2() < math.getNum1()) {
//             System.out.println("La raiz cuadrada es " + Math.sqrt(absNum1, absNum2));
//         }else{
//             System.out.println("La raiz cuadrada es " + Math.sqrt(absNum2, absNum1));
//         }
    }
}
