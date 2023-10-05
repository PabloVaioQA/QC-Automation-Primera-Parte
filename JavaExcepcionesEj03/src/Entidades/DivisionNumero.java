
package Entidades;

/**
 *
 * @author vaiop
 */
public class DivisionNumero {
    private int num1;
    private int num2;

    public DivisionNumero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double dividir(){
        double res = (double) num1/num2;
        
        return res;
    }
}
