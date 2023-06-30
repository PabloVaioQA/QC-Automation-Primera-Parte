
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class JavaPOO03oper {
    
    private double num1, num2;
    
    //a)
    public JavaPOO03oper(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //b)
    public JavaPOO03oper() {
    }
    
    
    //c)
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    //d)
    public void crearOperacion () {
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        //num1 = Leer.nextDouble();
        setNum1(Leer.nextDouble());
        System.out.println("Intruzca el segundo numero: ");
        //num2 = Leer.nextDouble();
        setNum2(Leer.nextDouble());
        
    }
    //e)
    public double suma(){
        
        return num1+num2;
    }
    //f)
    public double resta(){
        
        return num1-num2;
    }
    //g)
    public double multiplicar(){
        
        if (num1==0 || num2==0){
            System.out.println("Error");
            return 0;
        }else{
            return num1*num2;
        }
    }
    //h)
    public double dividir(){
        
        if(num2==0){
            System.out.println("Error");
            return 0;
        }else {
            return num1/num2;
        }
    
    }
    
    
}
