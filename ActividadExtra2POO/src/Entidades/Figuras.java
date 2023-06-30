
package Entidades;

/**
 *
 * @author vaiop
 */
public class Figuras {
    
    
    private double perimetro, area;
    
    public Figuras() {
    }

    public Figuras(double perimetro, double area) {
        
        this.perimetro = perimetro;
        this.area = area;
    }

    
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    
    //CALCULOS DE LAS FIGURAS
    
    public void Cuadrado(double base, double altura){
        
        perimetro = (base + altura)*2;
        area = base*altura;
        
    }
    
    public void Rectangulo(double base, double altura){
        perimetro = (base + altura)*2;
        area = base*altura;
        
    }
    
    public void Triangulo(double base, double altura){
        
        perimetro = (base + altura)*2;
        area = (base*altura)/2;
    }
    
    public void Circulo(double radio){
        
        perimetro = (2 * Math.PI ) * radio;
        area = Math.PI * ( radio*2);
    }
    
    public void Hexagono(double lado, double apotema){
        perimetro = 6*lado;
        area = 3 * apotema * lado;
    }
    
    public void Pentagono(double lado, double apotema){
        perimetro = 5*lado;
        area = (5*lado*apotema)/2;
    }
    
    public void Rombo(double lado, double D, double d){
        perimetro = lado*4;
        area = (D * d)/2;
    }
     
    
    
}



