package Entidades;


public class Bota extends Dispositivos {
    private Boolean esDerecha;

    public Bota(Double consumoEnergia, Boolean esDerecha) {
        super(consumoEnergia);
        this.esDerecha = esDerecha;
    }

    public Boolean getEsDerecha() {
        return esDerecha;
    }

    public void setEsDerecha(Boolean esDerecha) {
        this.esDerecha = esDerecha;
    }
}
