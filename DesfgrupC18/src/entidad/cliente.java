/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author teenc
 */
public class cliente {
    private int id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;
    private double IMC;
    private rutina RUTINA;
    private static int generador =0;

    public cliente() {
        this.id = generador;
        generador++;
    }

    public cliente(int id, String nombre, int edad, double altura, double peso, String objetivo, double IMC, rutina RUTINA) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
        this.IMC = IMC;
        this.RUTINA = RUTINA;
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getIMC() {
        return  peso/Math.pow(altura, 2);
    }

    public rutina getRUTINA() {
        return RUTINA;
    }

    public void setRUTINA(rutina RUTINA) {
        this.RUTINA = RUTINA;
    }

    @Override
    public String toString() {
        return "cliente: " + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", objetivo=" + objetivo + ", IMC=" + (peso/(altura*altura)) + ", RUTINA=" + RUTINA ;
    }


    
    
    
}
