package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 3
==============================
Crea un programa que cuente cuántas vocales (a, e, i, o, u) tiene un String. Ignora las mayúsculas y minúsculas.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un texto:");
		String texto = scan.nextLine();
		char caracter;
		texto = texto.toLowerCase().trim();
		int numeroVocales = 0;

		for (int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
//			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
//				numeroVocales++;
//			}
			//una manera más eficiente
			if ("aeiou".indexOf(caracter) != -1) {
				numeroVocales += 1;
			}
		}

		System.out.println("En el texto " + texto + " hay un total de " + numeroVocales + " vocales.");
	}
}
