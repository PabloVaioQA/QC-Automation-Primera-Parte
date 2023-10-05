/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desfgrupc18;

import entidad.cliente;
import entidad.rutina;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import service.servicecliente;
import service.servicerutina;

/**
 *
 * @author teenc
 */
public class DesfgrupC18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<cliente> clientes = new ArrayList<>();  
        List<rutina> rutinas = new ArrayList<>();
       servicerutina svr= new servicerutina();
       servicecliente svc= new servicecliente();
       for (int i=0;i<1;i++){
       rutinas.add(svr.crearRutina());
       }
        for (int i=0;i<1;i++){
            clientes.add(svc.crearCliente(rutinas));
        }
        svr.obtenerRutina(rutinas);
        svc.obtenerCliente(clientes);
        svr.actualizarRutina(rutinas);
        svc.actualizarCliente(clientes, rutinas);
        svr.obtenerRutina(rutinas);
        svc.obtenerCliente(clientes);
        svc.borrarCliente(clientes);
        svr.borrarRutina(rutinas);
        svr.obtenerRutina(rutinas);
        svc.obtenerCliente(clientes);
    }
    
}
