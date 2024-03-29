package Entidades;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Electrodoméstico {
    
    /*
    atributos: precio, color, consumo energÃ©tico (letras entre A y F) y peso
    */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected Double precio;
    protected Integer peso;
    protected String color;
    protected Character consumoEnergetico;

    public Electrodoméstico() {
    }

    public Electrodoméstico(Double precio, Integer peso, String color, Character consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = this.comprobarColor(color);
        this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    
    public void crearElectrodomestico(){
        String col;
        char consE, consumoEnerg;
        this.precio = 1000d;
        System.out.println("Color: ");
        col = leer.next();
        this.color = comprobarColor(col);
        System.out.println("Peso: ");
        this.peso = leer.nextInt();
        System.out.println("Consumo energetico (A-F): ");
        consE = leer.next().charAt(0);
        this.consumoEnergetico = comprobarConsumoEnergetico(consE);
        
    }   
    
    private char comprobarConsumoEnergetico(Character letra){
        
        if(letra >= 'A' && letra <= 'F' || letra >= 'a' && letra <= 'f'){
            return letra;
        }else
            return 'f';
    }
    
    private String comprobarColor(String color){
        
        String[] coloresDisponibles = {"blanco", "rojo", "negro", "azul", "gris"};
        
        for (String colores : coloresDisponibles) {
            if (colores.equalsIgnoreCase(color)) {
                return color;
            }
        }
        return "blanco";
    }
    
    public Double precioFinal(){
        Integer pes = this.peso;
        Double precioFinal = this.precio;
        
        if(pes >= 1 && pes <= 19){
            precioFinal += 100.0;
        } else if (pes <= 49) {
            precioFinal += 500.0;
        } else if (pes <= 79) {
            precioFinal += 800.0;
        } else {
            precioFinal += 1000.0;
        }
       
        switch (this.consumoEnergetico) {
            case 'a':
                precioFinal += 1000;
                break;
            case 'b':
                precioFinal += 800;
                break;
            case 'c':
                precioFinal += 600;
                break;
            case 'd':
                precioFinal += 500;
                break;
            case 'e':
                precioFinal += 300;
                break;
            case 'f':
                precioFinal += 100;
                break;
            default:
                break;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Precio: " + precio + "\nPeso: " + peso + "\nColor: " + color + "\nConsumo energetico: " + consumoEnergetico;
    }
    

}
