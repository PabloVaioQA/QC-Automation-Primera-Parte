/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.cliente;
import entidad.rutina;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class servicecliente {
    private Scanner impr = new Scanner(System.in).useDelimiter("\n");
    servicerutina svr = new servicerutina() ;
    public cliente crearCliente(List<rutina> rutinas){
        int e=0;
    cliente r = new cliente();
        System.out.println("Ingrese el nombre de cliente ");
        r.setNombre(impr.nextLine());
        System.out.println("Ingrese la edad");
        r.setEdad(Integer.parseInt(impr.nextLine()));
        System.out.println("Ingrese altura en mts");
        r.setAltura(Double.parseDouble(impr.nextLine()));
        System.out.println("Ingrese el peso en kg");
        r.setPeso(Double.parseDouble(impr.nextLine()));
        System.out.println("Ingrese el objetivo");
        r.setObjetivo(impr.nextLine());
        svr.obtenerRutina(rutinas);
        do{
        System.out.println("Ingrese la ID de la rutina que quiere");
      int a =  Integer.parseInt(impr.nextLine());
      if (verifID(rutinas, a)){
        r.setRUTINA(rutinas.get(a));
        e=1;
      }
        }while(e==0);
      return r;
    }
    public void obtenerCliente(List<cliente> rutinas){
        System.out.println("Clientes");
    for(cliente r:rutinas){
        System.out.println(r.toString());
    }
    }
    public boolean verifID(List<rutina> rutinas, int val){
    int ids;
        int salir = 0;
        if (val >= rutinas.size())
        {
            System.out.println("Ingrese un nuevo valor");
            return false;
        }else
        {
        return true;
        
        }
    }
    
    
    
    public void actualizarCliente(List<cliente> rutinas, List<rutina>rutinini){
        int ids = conseguirId(rutinas);
        int salir = 0;
        
        cliente r = rutinas.get(ids);
        do{
        System.out.println("Que desea modificar?");
        System.out.println("1-Nombre");
        System.out.println("2-Altura");
        System.out.println("3-Peso");
        System.out.println("4-Objetivo");
        System.out.println("5-Rutina");
        System.out.println("6-Salir");


        int opcion = Integer.parseInt(impr.nextLine());
        switch(opcion){
            case 1:
                System.out.println("Ingrese el nuevo nombre");
                r.setNombre(impr.nextLine());
                break;
            case 2:
                System.out.println("Ingrese altura");
                r.setAltura(Integer.parseInt(impr.next()));
                break;
            case 3:
                System.out.println("Ingrese el nuevo peso");
                r.setPeso(Integer.parseInt(impr.next()));
                break;
            case 4:
                System.out.println("Ingrese nuevo objetivo");
                r.setObjetivo(impr.nextLine());
                break;
            case 5:
                svr.obtenerRutina(rutinini);
            System.out.println("Ingrese la ID de la rutina que quiere");
            r.setRUTINA(rutinini.get(Integer.parseInt(impr.nextLine())));
                break;
            case 6:
                salir = 1;
                break;
            default:
                System.out.println("Escribime la opcion correcta ");
        }
        }while (salir !=1);
        
    }
    
    public int conseguirId(List<cliente> rutinas){
    int ids;
        int salir = 0;
        do{
        System.out.println("Ingrese el id con el que desea interactuar");
        ids = Integer.parseInt(impr.nextLine());
        }while( ids > rutinas.size());
        return ids;
    }
    
    public void borrarCliente(List<cliente> rutinas){
    int ids = conseguirId(rutinas);
        System.out.println("Estas seguro que queres eliminarlo? S/N");
        String elim = impr.nextLine();
        if (elim.equalsIgnoreCase("s")){
    rutinas.remove(ids);
        }
    }
}
