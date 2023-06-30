
package Entidades;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Cuenta {
    
    private int numeroCuenta, saldoActual, interes;
    private long DNI;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int saldoActual, int interes, long DNI) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.interes = interes;
        this.DNI = DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void crearCuenta(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su numero de cuenta: ");
        setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese su DNI ");
        setDNI(leer.nextInt());
        
        System.out.println("Cual es su saldo actual?: ");
        setSaldoActual(leer.nextInt());
    }
    
    public void Ingresar(double ingreso){
        saldoActual += ingreso;
    
    }
    
    public void Retirar(double retiro){
        
        if(retiro>saldoActual){
            setSaldoActual(0);
        }else{
            saldoActual -= retiro;
        }
    }
    
    public void extraccionRapida(double retiro){
        if(retiro> (0.2*saldoActual)){
            System.out.println("Su retiro excede el 20% de su Saldo Actual");
        }else{
            saldoActual -= retiro;
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: "+ saldoActual);
    }
    
    public void consultarDatos(int numeroCuenta){
        
        System.out.println("Numero de cuenta: "+ numeroCuenta);
        System.out.println("DNI: "+ DNI);
        System.out.println("Saldo Actual: "+ saldoActual);
        
    }
    
}
