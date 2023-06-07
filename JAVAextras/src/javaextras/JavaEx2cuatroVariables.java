/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaextras;

/**
 *
 * @author vaiop
 */
public class JavaEx2cuatroVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 5;
        int B = 12;
        int C = 15;
        int D = 20;
        int X;
        
        System.out.println("Lo valores son: " );
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        X = B;
        B = C;
        C = A;
        A = D;
        D = X;
        
        System.out.println("Lo nuevos valores son: " );
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
    
}
