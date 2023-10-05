package Entidades;


public class Guante extends Dispositivos {
    private Boolean esDerecha;

    public Guante(Double consumoEnergia, Boolean esDerecha) {
        super(consumoEnergia);
        this.esDerecha = esDerecha;
    }
}
