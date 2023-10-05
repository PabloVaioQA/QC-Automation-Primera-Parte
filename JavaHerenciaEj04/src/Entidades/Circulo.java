package Entidades;



/**
 *
 * @author vaiop
 */
public class Circulo implements calculosFormas{
     //PI * radio ^ 2 
    //PerÃ­metro circulo: PI * diÃ¡metro
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double calcularPerimetro() {
        return PI * this.radio * 2;
    }

    @Override
    public Double calcularArea() {
        return PI * this.radio * this.radio;
    }
}
