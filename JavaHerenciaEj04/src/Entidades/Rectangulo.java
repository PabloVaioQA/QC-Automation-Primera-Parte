package Entidades;

/**
 *
 * @author vaiop
 */
public class Rectangulo implements calculosFormas{
      private Double base, altura;

    public Rectangulo() {
    }
    
    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public Double calcularPerimetro() {
       return (this.base + this.altura) * 2; 
    }

    @Override
    public Double calcularArea() {
        return this.base * this.altura;
    }
}
