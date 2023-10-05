/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author teenc
 */
public class rutina {
    private int id;
    private String nombre;
    private String dificulatd;
    private int duracion;
    private String descripc;
    private static int generador=0;
    public rutina() {
        
        this.id = generador;
        generador++;
    }

    public rutina(int id, String nombre, String dificulatd, int duracion, String descripc) {
        this.id = id;
        this.nombre = nombre;
        this.dificulatd = dificulatd;
        this.duracion = duracion;
        this.descripc = descripc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDificulatd() {
        return dificulatd;
    }

    public void setDificulatd(String dificulatd) {
        this.dificulatd = dificulatd;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripc() {
        return descripc;
    }

    public void setDescripc(String descripc) {
        this.descripc = descripc;
    }

    @Override
    public String toString() {
        return "rutina:" + "id " + id + ", nombre= " + nombre + ", dificulatd= " + dificulatd + ", duracion= " + duracion + ", descripcion=" + descripc;
    }
        
}
