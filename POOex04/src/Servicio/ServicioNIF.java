/*
 * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class ServicioNIF {
    Scanner leer = new Scanner(System.in);
    public NIF nif = new NIF();
    
    public void crearNif(){
        System.out.println("Ingrese su numero de DNI");
        nif.setDNI(leer.nextLong());
        
        long num = ((nif.getDNI())%23);
        buscarLetra(num);
    }
    
    public void buscarLetra(long num){
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        for (int i = 0; i < num; i++) {
            nif.setLetra(letras[i]);
        }
    
    }
    
    public void mostrar(){
        System.out.println(nif.getDNI() + "-" + nif.getLetra());
    }
}
