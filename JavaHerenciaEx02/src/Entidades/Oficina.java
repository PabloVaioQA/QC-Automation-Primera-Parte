package Entidades;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Oficina extends Edificio{
    
    private Integer NumOficinas;
    private Integer Personas;
    private Integer pisos;
    
    public Oficina() {
    }

    public Oficina(Integer NumOficinas, Integer Personas, Integer pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.NumOficinas = NumOficinas;
        this.Personas = Personas;
        this.pisos = pisos;
    }

    @Override
    public double calcularSuperficie() {
        double superficie = ancho * largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = ancho * largo * alto;
      return volumen;
    }
    
   
    public void cantPersonas(){
        
        System.out.println("Cantidad total de Personas: " + Personas * pisos * NumOficinas);
    }
    
    
    
}
