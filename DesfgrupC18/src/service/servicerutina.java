/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.rutina;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author teenc
 */
public class servicerutina {
    private Scanner impr = new Scanner(System.in).useDelimiter("\n");

    public rutina crearRutina(){
    rutina r = new rutina();
        System.out.println("Ingrese el nombre de rutina ");
        r.setNombre(impr.nextLine());
        System.out.println("Ingrese la dificultad");
        r.setDificulatd(impr.nextLine());
        System.out.println("Ingrese descripcion");
        r.setDescripc(impr.nextLine());
        System.out.println("Ingrese la duracion  de la misma (en semanas)");
        r.setDuracion(Integer.parseInt(impr.nextLine()));
        return r;
    }
    public void obtenerRutina(List<rutina> rutinas){
        System.out.println("Rutinas");
    for(rutina r:rutinas){
        System.out.println(r.toString());
    }
    }
    
    public void actualizarRutina(List<rutina> rutinas){
        int ids = conseguirId(rutinas);
        int salir = 0;
        
        rutina r = rutinas.get(ids);
        do{
        System.out.println("Que desea modificar?");
        System.out.println("1-Nombre");
        System.out.println("2-Dificultad");
        System.out.println("3-Descripcion");
        System.out.println("4-Duracion");
        System.out.println("5-Salir");

        int opcion = Integer.parseInt(impr.nextLine());
        switch(opcion){
            case 1:
                System.out.println("Ingrese el nuevo nombre");
                r.setNombre(impr.nextLine());
                break;
            case 2:
                System.out.println("Ingrese nueva dificultad");
                r.setDificulatd(impr.nextLine());
                break;
            case 3:
                System.out.println("Ingrese la nueva descripcion");
                r.setDescripc(impr.nextLine());
                break;
            case 4:
                System.out.println("Ingrese nueva duracion");
                r.setDuracion(Integer.parseInt(impr.nextLine()));
                break;
            case 5:
                salir = 1;
                break;
            default:
                System.out.println("Escribime la opcion correcta ");
        }
        }while (salir !=1);
        
    }
    
    public int conseguirId(List<rutina> rutinas){
    int ids;
        int salir = 0;
        do{
        System.out.println("Ingrese el id con el que desea interactuar");
        ids = Integer.parseInt(impr.nextLine());
        }while( ids > rutinas.size());
        return ids;
    }
    
    public void borrarRutina(List<rutina> rutinas){
    int ids = conseguirId(rutinas);
        System.out.println("Estas seguro que queres eliminarlo? S/N");
        String elim = impr.nextLine();
        if (elim.equalsIgnoreCase("s")){
    rutinas.remove(ids);
        }
    }
    
}
