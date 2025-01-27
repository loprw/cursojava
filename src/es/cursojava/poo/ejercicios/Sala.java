package es.cursojava.poo.ejercicios;

import java.util.Scanner;

public class Sala {

	private int numero;
	private String tituloPelicula;
	private String[][] butacas;

	public Sala(int numero, String tituloPelicula, String[][] butacas) {
		this.numero = numero;
		this.tituloPelicula = tituloPelicula;
		this.butacas = butacas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public String[][] getButacas() {
		return butacas;
	}

	public void setButacas(String[][] butacas) {
		this.butacas = butacas;
	}

	public void iniciarDia() {

		for (int columna = 0; columna < butacas.length; columna++) {
			for (int filas = 0; filas < butacas[columna].length; filas++) {
				butacas[columna][filas] = "\tO";
			}
		}
	}

	public void mostrarButacas() {

		for (String[] columnas : butacas) {
			System.out.println();
			for (String fila : columnas) {
				System.out.print(fila);
			}
		}
	}

	public int contarButacasVacias() {

		int contadorButacasVacias = 0;

		for (String[] columnas : butacas) {
			System.out.println();
			for (String fila : columnas) {
				if (fila.equals("\tO")) {
					contadorButacasVacias++;
				}
			}
		}

		return contadorButacasVacias;
	}

	public int contarTotalButacas() {

		int totalButacas = 0;

		for (String[] columnas : butacas) {
			for (int i = 0; i < columnas.length; i++) {
				totalButacas++;
			}
		}

		return totalButacas;
	}

	public int pedirNumeroEntradas() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Indique la cantidad de entradas que quieres comprar:");
		int numeroEntradas = scan.nextInt();

		return numeroEntradas;
	}

	public boolean comprobarButacasLibres(int numEntradas) {

		int butacasVacias = contarButacasVacias();
		boolean hayEntradas;

		if (numEntradas <= butacasVacias) {
			System.out.println("Hay suficientes butacas en la sala.");
			hayEntradas = true;
		} else {
			System.out.println("No hay butacas suficientes para la cantidad de entradas demandadas.");
			hayEntradas = false;
		}

		return hayEntradas;
	}

	public void escogerButacas(int numeroEntradas) {

		Scanner scan = new Scanner(System.in);
		System.out.println("¿Desea escoger las butacas? s/n");
		String escogeButacas = scan.nextLine();
		int numButacas = numeroEntradas;

		if (escogeButacas.equals("s") || escogeButacas.equals("S")) {
			mostrarButacas();

			for (int i = 0; i < numeroEntradas; i++) {
				System.out.println("\n\nEscoja la fila de butacas para la entrada " + (i + 1) + ":");
				int numFila = scan.nextInt();
				System.out.println(
						"Escoja la butaca para la entrada" + (i + 1) + " (de izquierda a derecha, empezando por la 1):");
				int numButaca = scan.nextInt();
				
				if (numButaca > butacas.length) {
					System.out.println("Has escogido una butaca incorrecta.");
					i--;
					continue;
				} else {
					numButaca--;
				}
				
				if (numFila > butacas[numButaca].length) {
					System.out.println("Has escogido una fila incorrecta.");
					i--;
					continue;
				} else {
					numFila--;
				}
				
				if (butacas[numButaca][numFila].equals("\tO")) {
					butacas[numButaca][numFila] = "\tX";
				} else {
					System.out.println("Butaca ocupada, escoja otra");
					i--;
				}

			}
			
			System.out.println("Ha escogido todas las butacas.\n");

		} else if (escogeButacas.equals("n") || escogeButacas.equals("N")) {
			for (int columna = 0; columna < butacas.length; columna++) {
				for (int fila = 0; fila < butacas[columna].length; fila++) {
					if (butacas[columna][fila].equals("\tO")) {
						butacas[columna][fila] = "\tX";
						numButacas--;
					}
					if (numButacas == 0) {
						System.out.println("Se han seleccionado todas las butacas.\n");
						break;
					}
				}
			}
		} else {
			System.out.println("No ha escogido una opción válida:");
			escogerButacas(numeroEntradas);
		}
	}
}