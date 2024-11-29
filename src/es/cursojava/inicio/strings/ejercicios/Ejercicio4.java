package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 4
==============================
Escribe un programa que reciba un String con varias palabras separadas por espacios y determine cuál es la palabra más larga.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un texto con varias palabras separadas por espacios:");
		String texto = scan.nextLine();
		String palabraMayor = "";
		
		for (texto.length(); texto.length() > 0;) {
			int indiceEspacio = texto.indexOf("");
			String palabra = texto.substring(0, indiceEspacio);
			if (palabra.length() > palabraMayor.length()) {
				palabraMayor = palabra;
			texto = texto.substring(indiceEspacio + 1, texto.length());
			}
		}
	}

}
