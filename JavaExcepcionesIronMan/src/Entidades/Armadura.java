
package Entidades;

import java.util.ArrayList;


public class Armadura {
     private String colorPrimario;
    private String colorSecundario;
    private Integer nivelResistencia;
    private Integer nivelSalud;
    private Generador generador;

    ArrayList <Dispositivos> dispositivos;

    public Armadura(String colorPrimario,
                    String colorSecundario,
                    Integer nivelResistencia,
                    float cargaMaxima,
                    Double consumoEnergiaBota,
                    Double consumoEnergiaGuante,
                    Double consumoEnergiaConsola,
                    Double consumoEnergiaSintetizador)
    {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = 100;
        this.generador = new Generador(cargaMaxima);
        Bota bota = new Bota(consumoEnergiaBota, true);
        dispositivos.add(bota);
        Bota bota2 = new Bota(consumoEnergiaBota, false);
        dispositivos.add(bota2);
        dispositivos.add(new Guante(consumoEnergiaGuante, true));
        this.dispositivos.add(new Guante(consumoEnergiaGuante, false));
        this.dispositivos.add(new Consola(consumoEnergiaConsola));
        this.dispositivos.add(new Sintetizador(consumoEnergiaSintetizador));
    }

    public Integer getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(Integer nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public Integer getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(Integer nivelSalud) {
        this.nivelSalud = nivelSalud;
    }
    public void caminar(int tiempo) {
        buscarDispositivo("Bota");

    }

    public void buscarDispositivo(String dispositivo) {
        for (Object aux: dispositivos) {
            if (aux.getClass().getSimpleName().equals(dispositivo)){
                System.out.println("encontrado");
                System.out.println(aux);
            }
        }
    }
}
