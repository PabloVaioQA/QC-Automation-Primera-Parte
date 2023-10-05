
package Entidades;


abstract public class Dispositivos {
    protected Double consumoEnergia;
    protected Boolean estaDaniado = false;

    public Dispositivos(Double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public Double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(Double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public Boolean getEstaDaniado() {
        return estaDaniado;
    }

    public void setEstaDaniado(Boolean estaDaniado) {
        this.estaDaniado = estaDaniado;
    }
}
