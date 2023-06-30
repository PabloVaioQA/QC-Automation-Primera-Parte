
package actividadextra1poo;

import Entidades.Vehiculo;

/**
 *
 * @author vaiop
 */
public class ActividadExtra1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Vehiculo V1 = new Vehiculo("Fiat", "600" , "Automovil" , 1986);
        Vehiculo V2 = new Vehiculo("Yamaha", "XTZ", "Motocicleta", 2020);
        Vehiculo V3 = new Vehiculo("Speedo", "TF", "Bicicleta", 2023);
        
        
        V1.Moverse(V1.getTipo(), 5);
        V1.Moverse(V1.getTipo(), 10);
        V1.Moverse(V1.getTipo(), 60);
        
        V2.Moverse(V1.getTipo(), 5);
        V2.Moverse(V1.getTipo(), 10);
        V2.Moverse(V1.getTipo(), 60);
        
        V3.Moverse(V1.getTipo(), 5);
        V3.Moverse(V1.getTipo(), 10);
        V3.Moverse(V1.getTipo(), 60);
        
        V1.Moverse(V1.getTipo(), 300);
        V1.Frenar(V1.getTipo(), V1.getMetros());
        System.out.println(V1.getDistancia());
        
        V2.Moverse(V2.getTipo(), 300);
        V2.Frenar(V2.getTipo(), V2.getMetros());
        System.out.println(V2.getDistancia());
        
        V3.Moverse(V3.getTipo(), 300);
        V3.Frenar(V3.getTipo(), V3.getMetros());
        System.out.println(V3.getDistancia());
        
        if(V1.getDistancia() > V2.getDistancia() && V1.getDistancia() > V3.getDistancia()){
            
            System.out.println("El vehiculo que llego mas lejos es: " + V1.getTipo() + " Y recorrio: " + V1.getDistancia() + " metros");
        }
        if(V2.getDistancia() > V1.getDistancia() && V2.getDistancia() > V3.getDistancia()){
            
            System.out.println("El vehiculo que llego mas lejos es: " + V2.getTipo() + " Y recorrio: " + V2.getDistancia() + " metros");
        }
        if(V3.getDistancia() > V1.getDistancia() && V3.getDistancia() > V2.getDistancia()){
            
            System.out.println("El vehiculo que llego mas lejos es: " + V3.getTipo() + " Y recorrio: " + V3.getDistancia() + " metros");
        }
        
        
        
    }
    
    
}
