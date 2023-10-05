package Entidades;

/**
 *
 * @author vaiop
 */
public class Polideportivo extends Edificio {
    private String Nombre;
    private Boolean TipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String Nombre, Boolean TipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.Nombre = Nombre;
        this.TipoInstalacion = TipoInstalacion;
    }

    public String getNombre() {
        return Nombre;
    }
    
    
    @Override
    public double calcularSuperficie() {
        double superficie = ancho * largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
      double volumen = ancho * largo * alto;
      return volumen;
    }
    
    @Override
    public String toString() {
        if (TipoInstalacion) {
            return "Es techado";
        } else {        
        return "No es techado";
        }
    }
    
    
    
}
