package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 2
==============================
Escribe un programa que determine si un String ingresado por el usuario es un palíndromo (se lee igual de izquierda a derecha
que de derecha a izquierda, ignorando mayúsculas y espacios).

 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica una palabra: ");
		String texto = scan.nextLine();
		texto = texto.trim().replace(" ","");
		String textoInverso = "";

		for (int i = 0; i < texto.length(); i++) {
			textoInverso = texto.charAt(i) + textoInverso;
		}
		
		if (texto.equalsIgnoreCase(textoInverso)) {
			System.out.println("La palabra es un palíndromo.");
		} else {
			System.out.println("La palabra no es un palíndromo.");
		}
		
		//Otra manera
//		boolean esPalindromo = true;
//
//		for (int i = 0; i < texto.length() / 2; i++) {
//			if (texto.charAt(i) != texto.charAt(texto.charAt(texto.length() - 1 - i))) {
//				System.out.println("No es palíndromo.");
//				esPalindromo = false;
//				break;
//			}
//		}
//
//		if (esPalindromo) {
//			System.out.println("Es palíndromo.");
//		}
	}
}
