package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 4: Ahorcado
==========================================================
En un array guardar una palabra. (Cada letra en una posición del array)
El usuario tendrá 6 vidas.
Empieza el juego
	+ Preguntar al usuario por las letras. (Se le preguntará hasta que acierte o se quede sin vidas)
		+ Si acierta una letra mostrar las letras descubiertas
		+ Si no acierta, se le indica que ha fallado y se le quita una vida
	+ Si acierta la palabra entera antes de perder todas las vidas habrá ganado
	+ Si pierde todas las vidas sin acertar la palabra habrá perdido
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		String[] palabra = {"a", "n", "a", "c", "o", "n", "d", "a"};
		String[] palabraOculta = new String[palabra.length];
		for (int i = 0; i < palabraOculta.length; i++) {
			palabraOculta[i] = "_";
		}
		int vidas = 6;
		
		System.out.println("\nBienvenido al juego del Ahorcado!\n\nDeberas encontrar la palabra misteriosa antes de que pierdas"
				+ "todas tus vidas. Cada fallo al pedir una letra te quitará una... ¡cuidado! Solo tienes " + vidas + "vidas!");
		

		do {
			System.out.println("\nLa palabra oculta es\n");
			for (String letra : palabraOculta) {
				System.out.print(letra);
			}

			Scanner scan = new Scanner(System.in);
			System.out.println("\n\nIndica una letra que creas que pueda estar presente en la palabra misteriosa: ");
			String letra = scan.nextLine();
			letra = letra.toLowerCase();
			boolean contieneLetra = false;
			for (int i = 0; i < palabra.length; i++) {
				if (palabra[i].contains(letra)) {
					contieneLetra = true;
				}
			}
			if (!contieneLetra) {
				vidas--;
				System.out.println("¡Vaya! La letra " + letra
						+ " no está presente.\nPierdes una vida: ¡ya solo te quedan " + vidas + " vidas!");
			} else {
				for (int j = 0; j < palabra.length; j++) {
					if (palabra[j].contains(letra)) {
						palabraOculta[j] = letra;
					}
				}
				System.out.println("¡Bien! La letra " + letra + "está presente en la palabra oculta!\n");
			}

			if (palabraOculta.equals(palabra)) {
				System.out.println("¡Enhorabuena! Has logrado descubrir la palabra oculta.");
				break;
			}

		} while (vidas != 0);
		
		System.out.println("¡Vaya! No has logrado adivinar la palabra oculta.");
	}
}
