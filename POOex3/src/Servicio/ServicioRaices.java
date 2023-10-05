/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author vaiop
 */
public class ServicioRaices {
    
    Raices raices = new Raices();
    
    public double getDiscriminante(){
            
        double discriminante = ((Math.pow(raices.getB(), 2))-4*raices.getA()*raices.getC());
        return discriminante; 
    }
    
    public boolean tieneRaices( double getDiscriminante){
        boolean tieneRaices = true;
        if(getDiscriminante >= 0){
            return tieneRaices;
        }else{
            return !tieneRaices;
        }
    
    }
    
    public boolean tieneRaiz(double discriminante){
        if(discriminante == 0){
            return true;
        }else{
        return false;
        }
    
    }
    
    public void obtenerRaices(boolean tieneRaices, double discriminante){
        boolean obtenerRaices = true;
        if(tieneRaices == obtenerRaices){
            System.out.println((- raices.getB() + (Math.sqrt(discriminante)) /(2* raices.getA())));
            System.out.println((- raices.getB() - (Math.sqrt(discriminante)) /(2* raices.getA())));
           
        }
    
    }
    
    public void obtenerRaiz(boolean tieneRaiz, double discriminante){
        boolean obtenerRaiz = true;
        if(tieneRaiz == true){
            System.out.println((- raices.getB() + (Math.sqrt(discriminante)) /(2* raices.getA())));
            System.out.println((- raices.getB() - (Math.sqrt(discriminante)) /(2* raices.getA())));
           
        }else{
            System.out.println("No tiene Raiz");
        }
    
    }
    
    public void calcular(){
        double discriminante = getDiscriminante();
        
        if(tieneRaices(discriminante)) {
            obtenerRaices(tieneRaices(discriminante), discriminante);
        } else if(tieneRaiz(discriminante)) {
            obtenerRaiz(tieneRaiz(discriminante),discriminante);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        
        }
    }
    

