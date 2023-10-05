
package Entidades;

/**
 *
 * @author vaiop
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int documento;
    private int edad;
    
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int documento, int edad, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.mascota = mascota;
    }

    public Persona(String nombre, String apellido, int documento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad + ", mascota=" + mascota.toString() + '}';
    }
    
}
