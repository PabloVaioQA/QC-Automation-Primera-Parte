package Entidades;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Persona {
    
    private String nombre, sexo;
    private int edad, peso, altura;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, int peso, int altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        String sexo;
        System.out.println("Ingrese su Nombre: ");
        setNombre(leer.nextLine());
        System.out.println("Ingrese su Edad: ");
        setEdad(leer.nextInt());
        System.out.println("Ingrese su peso: ");
        setPeso(leer.nextInt());
        System.out.println("Ingrese su Altura: ");
        setAltura(leer.nextInt());
        do{
            
            System.out.println("Ingrese su Sexo (H(hombre)/M(mujer)/O(otro)): ");
            sexo = leer.nextLine();
            if(sexo != "H" || sexo != "M" || sexo != "O" ) System.out.println("Ingrese una letra Correcta ");
           
        }while(sexo != "H" || sexo != "M" || sexo != "O" );
        
    }
    
    public int calcularIMC(){
        double IMC = peso/ Math.pow(altura, 2);
        
        if(IMC<20){
            System.out.println("Debajo de su Peso Ideal");
            return -1;
        }else if(IMC>20 && IMC<25){
            System.out.println("Su Peso es el Ideal");
            return 0;
        }else{
            System.out.println("Sobrepeso");
            return 1;
        }
     
    }
    
    public boolean esMayorDeEdad(){
        
        if(edad>=18){
            System.out.println("La Persona es mayor de edad");
            return true;
        }else{
            System.out.println("La Persona es Menor de edad");
            return false;
        }
    }
    
    
}
