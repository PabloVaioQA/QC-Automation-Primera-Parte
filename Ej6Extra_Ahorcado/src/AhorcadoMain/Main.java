package AhorcadoMain;

import java.util.Scanner;

import Entidad.Ahorcado;
import Servicios.AhorcadoServicios;

public class Main {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		AhorcadoServicios ahoServi = new AhorcadoServicios();
		
		
		Ahorcado ahorcado = new Ahorcado();
		
		ahoServi.juego(ahorcado);

	}
	


}
