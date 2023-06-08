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
public class JavaEx12contadorNuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    if(i==3){
                    System.out.println("E"+"-"+j+"-"+k);
                    }
                    if(j==3){
                    System.out.println(i+"-"+"E"+"-"+ k);
                    }
                    if(k==3){
                    System.out.println(i+"-"+j+"-"+"E");
                    }
                    
                    System.out.println(i+"-"+j+"-"+k);
                    
                    
                }
            }
        }
    }
    
}
