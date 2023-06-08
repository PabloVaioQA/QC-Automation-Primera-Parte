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
public class JavaEx12luc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String num1 = "";
        String num2 = "";
        String num3 = "";
        String e    = "3";
        for(int i = 0; i<=9; i++){
            for(int j=0; j<=9; j++){
                for(int m=0; m<=9;m++){
                    num1 = i + "";
                    num2 = j + "";
                    num3 = m + "";
                    if(num1.equalsIgnoreCase(e)){
                        num1 = "E";
                    }
                    if(num2.equalsIgnoreCase(e)){
                        num2 = "E";
                    }
                    if(num3.equalsIgnoreCase(e)){
                      num3 = "E";
                    }
                    System.out.println(num1+"-"+num2+"-"+num3);
                }
            }
        }
    }
}
/*    
public class Ejer12 {
    public static void main(String[] args) {
        String cE, dE, uE;
        for(int c = 0; c < 10;  c++){
            for (int d = 0; d < 10; d++) {
                for(int u = 0; u < 10; u++) {
                    cE = Integer.toString(c);
                    dE = Integer.toString(d);
                    uE = Integer.toString(u);
                    if(cE.equals("3"))
                        cE = "E";
                    if(dE.equals("3"))
                        dE = "E";
                    if(uE.equals("3"))
                        uE = "E";
                    System.out.println(cE +"-"+ dE + "-" + uE);
                }
            }
        }
    }
    
}
