/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Meses {
    
    private String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
   
    private String mesSecreto;

    public Meses() {
        
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = meses[0];
    }

    public void adivinarMes(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el mes secreto.\n Introduzca el nombre del mes en minúsculas: ");
        String mes = leer.nextLine();
        String mes2 = getMesSecreto();
        
        do{        
            if(mes != mes2){
            
            System.out.println("Incorrecto.Ingrese otro mes: ");
            mes = leer.nextLine();
            break;
            }else{
            System.out.println("Correcto, Ha acertado! ");  
            break;
            }
        }while(mes != mes2);
    }
    
    
}
