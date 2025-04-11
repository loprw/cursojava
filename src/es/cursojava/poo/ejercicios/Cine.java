package es.cursojava.poo.ejercicios;

import es.cursojava.utils.Utilidades;

public class Cine {

	private String nombre;
	private Sala[] salas;

	public Cine(String nombre, Sala[] salas) {
		this.nombre = nombre;
		this.salas = salas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sala[] getSalas() {
		return salas;
	}

	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}

	public void mostrarPeliculas() {

		for (Sala sala : salas) {
			System.out.println("\t" + sala.getNumero() + ".- " + sala.getTituloPelicula());
		}
	}

	public void procesarEntradas(Espectador espectador) {

		final int OPCION_SALIDA = 0;
		int opcion;

		do {
			System.out.println("Bienvenido a " + getNombre()
					+ ", tu cine de confianza. Estas son las películas en nuestra cartelera:");
			mostrarPeliculas();
			opcion = Utilidades.pideDatoNumerico("Escoja el número de la película que desee ver. Pulse 0 para salir del menú:");
			int numSala = opcion - 1;

			switch (opcion) {

			case 0 -> System.out.println("Has salido del menú.");
			case 1, 2, 3  -> {
				
				int numEntradas = Utilidades.pideDatoNumerico("Indique la cantidad de entradas que quieres comprar:");
				boolean hayEntradas = getSalas()[numSala].comprobarButacasLibres(numEntradas);

				if (!hayEntradas) {
					continue;
				}

				getSalas()[numSala].escogerButacas(numEntradas, espectador);
				
				break;
			}
			
			default -> System.out.println("No has elegido una opción correcta.");
			}

		} while (opcion != OPCION_SALIDA);

	}

	public void mostrarOcupacion() {

		for (Sala sala : salas) {

			int totalButacasVacias = sala.contarButacasVacias();
			int totalButacas = sala.contarTotalButacas();
			

			double ocupacion = (1 - ((double) totalButacasVacias /(double) totalButacas)) * 100;
			System.out.println("La ocupación de la sala " + sala.getNumero() + " que proyecta la película "
					+ sala.getTituloPelicula() + ", es del " + ocupacion + "%.");
			
			sala.mostrarEspectadoresSala();
		}

	}
}
