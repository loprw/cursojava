package es.cursojava.poo.ejercicios;

import java.util.Scanner;

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

		int contador = 1;
		for (Sala sala : salas) {
			System.out.println("\t" + contador++ + ".- " + sala.getTituloPelicula());
		}
	}

	public void mostrarCartelera(Espectador espectador) {

		final int OPCION_SALIDA = 0;
		int opcion;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Bienvenido a " + getNombre()
					+ ", tu cine de confianza. Estas son las películas en nuestra cartelera:");
			mostrarPeliculas();
			System.out.println("Escoja el número de la película que desee ver. Pulse 0 para salir del menú:");
			opcion = scan.nextInt();

			switch (opcion) {

			case 0 -> System.out.println("Has salido del menú.");
			case 1 -> {
				int numEntradas = getSalas()[0].pedirNumeroEntradas();
				boolean hayEntradas = getSalas()[0].comprobarButacasLibres(numEntradas);

				if (!hayEntradas) {
					continue;
				}

				getSalas()[0].escogerButacas(numEntradas, espectador);
				
				break;
			}
			case 2 -> {
				int numEntradas = getSalas()[1].pedirNumeroEntradas();
				boolean hayEntradas = getSalas()[1].comprobarButacasLibres(numEntradas);

				if (!hayEntradas) {
					continue;
				}

				getSalas()[1].escogerButacas(numEntradas, espectador);
				
				break;
			}
			case 3 -> {
				int numEntradas = getSalas()[2].pedirNumeroEntradas();
				boolean hayEntradas = getSalas()[2].comprobarButacasLibres(numEntradas);

				if (!hayEntradas) {
					continue;
				}

				getSalas()[2].escogerButacas(numEntradas, espectador);
				
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
		}

	}
}
