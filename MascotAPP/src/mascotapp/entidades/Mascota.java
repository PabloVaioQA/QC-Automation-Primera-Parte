package mascotapp.entidades;

public class Mascota {
    
    private String Raza;

    public Mascota() {
    }

    public Mascota(String Raza) {
        this.Raza = Raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "Raza=" + Raza + '}';
    }
}
