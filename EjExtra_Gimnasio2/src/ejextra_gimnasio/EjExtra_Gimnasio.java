
package ejextra_gimnasio;

import entidades.Cliente;
import entidades.Rutina;
import java.util.ArrayList;
import servicios.ClienteServicio;
import servicios.RutinaServicio;


public class EjExtra_Gimnasio {


    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes1 = new ArrayList<>();
        ClienteServicio cs = new ClienteServicio();
        ArrayList<Rutina> rutinas1 = new ArrayList<Rutina>();
        RutinaServicio rs = new RutinaServicio();
        
        Cliente cliente1 = cs.registrarCliente(clientes1);
        Cliente cliente2 = cs.registrarCliente(clientes1);
        cs.obtenerClientes(clientes1);
        System.out.println("----------");
        cs.actualizarCliente(clientes1, "Daniel", 20, 1.7, 70, "Definicion");
        cs.obtenerClientes(clientes1);
        
        System.out.println("----------");
        Rutina rutina1 = rs.crearRutina(rutinas1);
        rs.obtenerRutinas(rutinas1);
        System.out.println("----------");
        rs.actualizarRutina(rutinas1, 1, "rutina2", 30, "media", "3 series");
        rs.obtenerRutinas(rutinas1);
    }
    
}
