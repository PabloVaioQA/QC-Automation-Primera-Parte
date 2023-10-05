/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class ServiciosMovil {
    Scanner leer = new Scanner(System.in);
    
public Movil cargarMovil(){
    
    Movil movil = new Movil();
    
    System.out.println("Ingrese la Marca: ");
    movil.setMarca(leer.nextLine());
    System.out.println("Ingrese el Modelo: ");
    movil.setModelo(leer.nextLine());
    return movil;

}

