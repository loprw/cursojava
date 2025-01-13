package es.proyectos.tresenraya;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {

		String[] opciones = { "Piedra", "Papel", "Tijera" };
		boolean repetir = true;
		String eleccionJugador;
		int victoriasMaquina = 0;
		int victoriasJugador = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("\nVamos a jugar al Tres en Raya:\nGana quien venza 3 rondas del juego. Cada ronda "
				+ "consiste en elegir Piedra, Papel o Tijera, y comparar con lo que elige la máquina:\n\tEn caso de "
				+ "que ambos saquéis la misma opción, se repite.\n\tLa piedra gana a la tijera, pero pierde contra"
				+ " el papel.\n\tEl papel gana a la piedra, pero pierde contra la tijera.\n\tLa tijera gana al papel"
				+ ", pero pierde contra la piedra.\n\n¡Mucha suerte!\n\n");

		do {
			System.out.println("Escoge Piedra, Papel o Tijera:");
			eleccionJugador = scan.nextLine();
			eleccionJugador = eleccionJugador.trim().toLowerCase();

			int azar = (int) (Math.random() * 3);
			String eleccionMaquina = opciones[azar].toLowerCase();

			switch (eleccionJugador) {
			case "piedra" -> {
				System.out.println("\nHas escogido Piedra.");
				if (eleccionJugador.equals(eleccionMaquina)) {
					System.out.println("\n¡Ambos habéis elegido Piedra, debéis volver a escoger!");
					continue;
				} else if (eleccionMaquina.equals("papel")) {
					System.out.println("\n¡La máquina escogió Papel! Has perdido esta ronda.");
					victoriasMaquina += 1;
				} else {
					System.out.println("\n¡La máquina escogió Tijera! Has ganado esta ronda.");
					victoriasJugador += 1;
				}
			}
			case "papel" -> {
				System.out.println("\nHas escogido Papel.");
				if (eleccionJugador.equals(eleccionMaquina)) {
					System.out.println("\n¡Ambos habéis elegido Papel, debéis volver a escoger!");
					continue;
				} else if (eleccionMaquina.equals("tijera")) {
					System.out.println("\n¡La máquina escogió Tijera! Has perdido esta ronda.");
					victoriasMaquina += 1;
				} else {
					System.out.println("\n¡La máquina escogió Piedra! Has ganado esta ronda.");
					victoriasJugador += 1;
				}
			}
			case "tijera" -> {
				System.out.println("\nHas escogido Tijera.");
				if (eleccionJugador.equals(eleccionMaquina)) {
					System.out.println("\n¡Ambos habéis elegido Tijera, debéis volver a escoger!");
					continue;
				} else if (eleccionMaquina.equals("piedra")) {
					System.out.println("\n¡La máquina escogió Piedra! Has perdido esta ronda.");
					victoriasMaquina += 1;
				} else {
					System.out.println("\n¡La máquina escogió Papel! Has ganado esta ronda.");
					victoriasJugador += 1;
				}
			}
			default -> {
				System.out.println("Has escogido una opción incorrecta, vuelve a elegir.");
				continue;
			}
			}
			if (victoriasJugador == 3) {
				System.out.println(
						"¡Enhorabuena! Has ganado a la máquina " + victoriasJugador + " a " + victoriasMaquina);
				repetir = false;
			} else if (victoriasMaquina == 3) {
				System.out.println(
						"¡Has perdido! La máquina te ha ganado " + victoriasMaquina + " a " + victoriasJugador);
				repetir = false;
			} else {
				System.out.println("Ha acabado esta ronda, llevas " + victoriasJugador + " "
						+ ((victoriasJugador == 1) ? "victoria" : "victorias") + " y la máquina lleva "
						+ victoriasMaquina + " " + ((victoriasMaquina == 1) ? "victoria" : "victorias") + ".");
			}
		} while (repetir);
	}
}