/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author vaiop
 */
public class Vehiculo {
    
    private String marca, modelo, tipo;
    private int anio; 
    private double metros = 0;
    private double distancia = 0;
    
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String tipo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        if(tipo.equals("Automovil")||tipo.equals("Motocicleta")||tipo.equals("Bicicleta")){  
        }
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
    
    
    public void Moverse(String tipo, double tiempo){
        
        if(tipo == "Automovil"){
            this.metros = tiempo * 3; 
        }else if(tipo == "Motocicleta"){
            this.metros = tiempo *2;
        }else{
            this.metros = tiempo *1;
        }
        System.out.println("La cantidad de metros recorrida en " + tiempo + " es: " + metros);
    }
    
    public void Frenar(String tipo, double metros){
        
        if(tipo == "Automovil"){
            this.distancia = metros + 2;
        }else if(tipo == "Motocicleta"){
            this.distancia = metros + 2;
        }else{
            this.distancia = metros;
        }
        System.out.println("La distancia final es " + distancia);
    
    }
    
    
}
