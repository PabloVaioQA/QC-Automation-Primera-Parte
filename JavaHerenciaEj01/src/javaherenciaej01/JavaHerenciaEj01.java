
package javaherenciaej01;

/**
 *
 * @author vaiop
 */
public class JavaHerenciaEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    //Declaracion del objeto Perro
    Animal perro1= new Perro("Stitch", "carnivoro", 15, "Doberman");
    perro1.mostrarAlimento();

    // Declaracion de otro objeto perro
    Animal perro2= new Perro("Teddy", "Croquetas", 10, "Chihuahua");
    perro2.mostrarAlimento();

    // Declaracion objeto gato
    Animal gato1= new Gato("Pelusa", "Galletas", 15, "siames", null);
    gato1.mostrarAlimento();

    // Declaracion del objeto caballo
    Animal caballo1= new Caballo("Sparks", "pasto", 25, "Fino");
    caballo1.mostrarAlimento();
    }
    
}
