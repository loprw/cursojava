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
			System.out.println(contador++ + ".- " + sala.getTituloPelicula());
		}
	}

	public void mostrarCartelera() {

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
				pedirNumeroEntradas();
			}
			case 2 -> {
				pedirNumeroEntradas();
			}
			case 3 -> {
				pedirNumeroEntradas();
			}
			default -> System.out.println("No has elegido una opción correcta.");
			}
				
		} while (opcion != OPCION_SALIDA);

	}
	
	public int mostrarOcupacion() {
		
		int totalButacasVacias = 0;
		int totalButacas = 0;
		
		for (Sala sala:salas) {
			totalButacasVacias += sala.contarButacasVacias();
			totalButacas += sala.contarTotalButacas();
		}
		
		int ocupacion = (totalButacasVacias / totalButacas) * 100;
	
		return ocupacion;
	}
	
	public void empezarDia() {
		for (Sala sala:salas) {
			sala.iniciarDia();
		}
	}
	
	public int pedirNumeroEntradas() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica la cantidad de entradas que quieres comprar:");
		int numeroEntradas = scan.nextInt();
		
		return numeroEntradas;
	}
}
