package es.cursojava.poo.ejercicios;

import es.cursojava.utils.Utilidades;

public class Sala {

	private int numero;
	private String tituloPelicula;
	private Espectador[][] butacas;

	public Sala(int numero, String tituloPelicula, Espectador[][] butacas) {
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

	public Espectador[][] getButacas() {
		return butacas;
	}

	public void setButacas(Espectador[][] butacas) {
		this.butacas = butacas;
	}

	public void mostrarButacas() {

		for (Espectador[] filas : butacas) {
			for (int i = 0; i < filas.length; i++) {
				System.out.println("Fila " + (i + 1));
				if (filas[i] == null) {
					System.out.print("\tO");
				} else {
					System.out.print("\tX");
				}
			}
			System.out.println();
		}
	}

	public int contarButacasVacias() {

		int contadorButacasVacias = 0;

		for (Espectador[] columnas : butacas) {
			System.out.println();
			for (Espectador fila : columnas) {
				if (fila == null) {
					contadorButacasVacias++;
				}
			}
		}

		return contadorButacasVacias;
	}

	public int contarTotalButacas() {

		int totalButacas = 0;

		for (Espectador[] columnas : butacas) {
			for (int i = 0; i < columnas.length; i++) {
				totalButacas++;
			}
		}

		return totalButacas;
	}

	public void mostrarEspectadoresSala() {

		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				Espectador[][] espectador = getButacas();
				System.out.println();
				if (butacas[i][j] != null) {
					System.out.println("/tLa butaca " + (j + 1) + " en la fila " + (i + 1) + "está reservada por "
							+ espectador[i][j].getNombre() + ",con DNI " + espectador[i][j].getDni() + ".");
				}
			}
		}
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

	public void escogerButacas(int numeroEntradas, Espectador espectador) {

		String escogeButacas = Utilidades.pideDatoCadena("¿Desea escoger las butacas? s/n");
		int numButacas = numeroEntradas;

		if (escogeButacas.equals("s") || escogeButacas.equals("S")) {
			mostrarButacas();

			for (int i = 0; i < numeroEntradas; i++) {

				int numFila = Utilidades
						.pideDatoNumerico("\n\nEscoja la fila de butacas para la entrada " + (i + 1) + ":");
				if (numFila > butacas.length || numFila <= 0) {
					System.out.println("Has escogido una butaca incorrecta.");
					i--;
					continue;
				} else {
					numFila--;
				}

				int numButaca = Utilidades.pideDatoNumerico("Escoja la butaca para la entrada" + (i + 1)
						+ " (de izquierda a derecha, empezando por la 1):");

				if (numButaca > butacas[numFila].length || numButaca <= 0) {
					System.out.println("Has escogido una fila incorrecta.");
					i--;
					continue;
				} else {
					numButaca--;
				}

				if (butacas[numFila][numButaca] == null) {
					butacas[numFila][numButaca] = espectador;
				} else {
					System.out.println("Butaca ocupada, escoja otra");
					i--;
				}

			}

			System.out.println("\nHa escogido todas las butacas.\n");

		} else if (escogeButacas.equals("n") || escogeButacas.equals("N")) {

			do {
				int numFila = Utilidades.pideDatoNumerico("Indique la fila de butacas donde desea sentarse:");

				for (int columna = 0; columna < butacas.length; columna++) {
					if (numFila > butacas[columna].length || numFila <= 0) {
						System.out.println("Ha escogido una fila incorrecta");
						columna--;
						continue;
					} else {
						if (butacas[columna][numFila] == null) {
							butacas[columna][numFila] = espectador;
							numButacas--;
						}
					}
				}
				if (numButacas != 0) {
					System.out.println("Se han escogido todas las butacas de la fila " + (numFila + 1)
							+ ", pero aún quedan " + numButacas + "entradas sin butaca asignada.");
				} else {
					System.out.println("\nSe han escogido todas las butacas.\n");
				}
			} while (numButacas != 0);

//			for (int columna = 0; columna < butacas.length; columna++) {
//				for (int fila = 0; fila < butacas[columna].length; fila++) {
//					if (butacas[columna][fila] == null) {
//						butacas[columna][fila] = espectador;
//						numButacas--;
//					}
//					if (numButacas == 0) {
//						System.out.println("Se han escogido todas las butacas.\n");
//						break;
//					}
//				}
//			}
		} else {
			System.out.println("No ha escogido una opción válida:");
			escogerButacas(numeroEntradas, espectador);
		}
	}
}