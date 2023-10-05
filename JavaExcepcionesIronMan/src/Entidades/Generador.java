package Entidades;


public class Generador {
    private float cargaMaxima;
    private float cargaActual;

    public Generador(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = this.cargaMaxima;
    }

    public float getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(float cargaActual) {
        this.cargaActual = cargaActual;
    }
}
