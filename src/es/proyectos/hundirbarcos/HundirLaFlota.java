package es.proyectos.hundirbarcos;

public class HundirLaFlota {

	public static void main(String[] args) {

		// crear el tablero visible para el jugador.
		String[][] tableroJugador = new String[8][8];

		// marcar todas las casillas visibles como interrogantes.
		for (int i = 0; i < tableroJugador.length; i++) {
			for (int j = 0; j < tableroJugador[i].length; j++) {
				tableroJugador[i][j] = "\t?";
			}
		}
		int contadorTurnos = 0;
		boolean finJuego = false;

		// dibujar el tablero.
		for (String[] linea : tableroJugador) {
			System.out.println();
			for (String casilla : linea) {
				System.out.print(casilla);
			}
			System.out.println();
		}

		// creación del tablero de la maquina.
		String[][] tableroMaquina = new String[8][8];

		// marcar todas las casillas visibles como guiones bajos.
		for (int i = 0; i < tableroMaquina.length; i++) {
			for (int j = 0; j < tableroMaquina[i].length; j++) {
				tableroMaquina[i][j] = "\t_";
			}
		}

		// colocacion de barcos:
		// 1 Barco de 4
		tableroMaquina[1][1] = "\t4";
		tableroMaquina[1][2] = "\t4";
		tableroMaquina[1][3] = "\t4";
		tableroMaquina[1][4] = "\t4";
		// 2 Barcos de 3
		tableroMaquina[5][6] = "\t3";
		tableroMaquina[6][6] = "\t3";
		tableroMaquina[7][6] = "\t3";
		tableroMaquina[5][2] = "\t3";
		tableroMaquina[5][3] = "\t3";
		tableroMaquina[5][4] = "\t3";
		// 3 Barcos de 2
		tableroMaquina[5][0] = "\t2";
		tableroMaquina[6][0] = "\t2";
		tableroMaquina[3][4] = "\t2";
		tableroMaquina[3][5] = "\t2";
		tableroMaquina[7][3] = "\t2";
		tableroMaquina[7][4] = "\t2";
		// 4 Barcos de 1
		tableroMaquina[3][0] = "\t1";
		tableroMaquina[3][2] = "\t1";
		tableroMaquina[0][7] = "\t1";
		tableroMaquina[2][7] = "\t1";

		System.out.println("\n\n");

		for (String[] linea : tableroMaquina) {
			System.out.println();
			for (String casilla : linea) {
				System.out.print(casilla);
			}
			System.out.println();
		}

		System.out.println(
				"¡Bienvenido a Hundir la Flota!\nEste juego trata de que hundas los barcos ocultos en el tablero en el "
						+ "menor número de turnos posibles.\nTienes que descubrir 1 barco de 4 espacios, 2 barcos de 3, "
						+ "3 de 2 y 4 de 1.\n\n¡Suerte!\n");

		do {
			System.out.println("Es el turno " + ++contadorTurnos + ".\nAsí está el tablero:");
			// dibujar el tablero.
			for (String[] linea : tableroJugador) {
				System.out.println();
				for (String casilla : linea) {
					System.out.print(casilla);
				}
				System.out.println();
			}
		} while (!finJuego);

		/*
		 * Leyenda: _ -> Casilla del tablero de la máquina vacía (agua). [Numero] ->
		 * Casilla del tablero de la máquina ocupada por una parte de un barco o un
		 * barco, indicando su tamaño. ? -> Casilla del tablero del jugador sin
		 * descubrir. 0 -> Casilla del tablero del jugador marcada como agua. T ->
		 * Casilla del tablero del jugador marcada como barco tocado. X -> Casilla del
		 * tablero del jugador marcada como barco tocado y hundido.
		 */

	}
}
