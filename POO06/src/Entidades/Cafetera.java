
package Entidades;

/**
 *
 * @author vaiop
 */
public class Cafetera {
    
    private int capacidadMaxima = 100;
    private int cantidadActual;

    //Constructores
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //metodos getter y Setter

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    public void llenarCafetera(){
        setCantidadActual(capacidadMaxima);
    
    }
    
    public void servirTaza(int taza){
        if(cantidadActual<taza){
            taza=cantidadActual;
            System.out.println("No se lleno la taza, se agrego: " + taza);
            cantidadActual = 0;
        }else{
            cantidadActual-=taza;
            System.out.println("Se lleno la taza "+taza);
            System.out.println("Cantidad restante de café " + cantidadActual);
        }
    }
    
    public void vaciarCafetera(){
        setCantidadActual(0);
        System.out.println("La cafetera tiene: "+ cantidadActual);
    }
    
    public void agregarCafe(int cafe){
        
        if(cantidadActual == capacidadMaxima || cafe+cantidadActual > capacidadMaxima){
            cafe = capacidadMaxima - cantidadActual;
        }
        
        System.out.println("Se pudo agregar " + cafe + "ml de café.");
        cantidadActual += cafe;
    }
}
