package Servicios;

import java.util.*;

import Entidad.Ahorcado;

public class AhorcadoServicios {

	Scanner leer = new Scanner(System.in);
	private ArrayList<String> letrasIngresadas = new ArrayList<>();

	public void crearJuego() {

		Ahorcado aho = new Ahorcado();

		System.out.println("JUGADOR 1: ");
		System.out.println("Ingrese la palabra: ");
		String palabraIngresada = leer.nextLine();
		String palabraIn[] = new String[palabraIngresada.length()];
		System.out.println("Ingrese la cantidad de jugadas máxima: ");
		aho.setCantidadJugadas(leer.nextInt());

		for (int i = 0; i < palabraIn.length; i++) {

			palabraIn[i] = palabraIngresada.substring(i, i + 1);

		}

		aho.setPalabra(palabraIn);

		for (int i = 0; i < palabraIn.length; i++) {

			System.out.print(palabraIn[i] + " ");

		}

	

	}

	public void longitud(Ahorcado ahorcado) {

		System.out.println("La longitud de la palabra es " + ahorcado.getPalabra().length);

	}

	public boolean buscarLetra(String letra, Ahorcado ahorcado) {

		String[] palabra = ahorcado.getPalabra();

		boolean encontrado = false;

		for (int i = 0; i < palabra.length; i++) {
			if (palabra[i].equalsIgnoreCase(letra)) {
				letrasIngresadas.add(letra);
				encontrado = true;

			}
		}

		ahorcado.setLetrasEncontradas(letrasIngresadas);

		if (encontrado) {
			// letrasIngresadas.add(letra);
			System.out.println("La letra pertenece a la palabra ");
		} else {
			System.out.println("La letra NO esta en la palabra ");
		}

		System.out.println(ahorcado.getLetrasEncontradas());

		return encontrado;
	}

//	Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//	cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//	devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//	busque una letra que no esté, se le restará uno a sus oportunidades.

	public boolean encontradas(String letra, Ahorcado ahorcado) {

		boolean encontrado = buscarLetra(letra, ahorcado);

		if (encontrado) {
			System.out.printf("Número de letras (encontradas, faltantes): (%S,%S) \n", letrasIngresadas.size(),
					(ahorcado.getPalabra().length - letrasIngresadas.size()));
			
		}

		return encontrado;
	}
	
	public void intentos(Ahorcado ahorcado, boolean encontrado) {
		
		int intentos  = ahorcado.getCantidadJugadas();
		if(!encontrado) {
			intentos --;
			ahorcado.setCantidadJugadas(intentos);
		}
		
	}
	
	public void juego(Ahorcado ahorcado) {
		String letra;
		crearJuego();
		
		while(ahorcado.getCantidadJugadas()> 0 && ahorcado.getPalabra().length != letrasIngresadas.size() ) {
			System.out.println("Ingresa una letra");
			letra = leer.next();
			
			longitud(ahorcado);
			boolean encontrado = encontradas(letra, ahorcado);
			intentos( ahorcado, encontrado);
		}
		
	}

}
