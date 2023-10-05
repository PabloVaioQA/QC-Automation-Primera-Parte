
package Entidad;

/**Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el
 *
 * @author vaiop
 */
public class Ahorcado {
    
    private String[] palabra;
    private int cantidad;
    private int jugMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidad, int jugMax) {
        this.palabra = palabra;
        this.cantidad = cantidad;
        this.jugMax = jugMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantidad=" + cantidad + ", jugMax=" + jugMax + '}';
    }
    
    
    
    
}
