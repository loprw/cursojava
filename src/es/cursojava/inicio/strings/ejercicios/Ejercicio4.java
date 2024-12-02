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
		boolean finTexto = false;

		while (!finTexto) {
			int indiceEspacio = texto.indexOf(" ");
			String palabra = "";

			if (indiceEspacio != -1) {
				palabra = texto.substring(0, indiceEspacio);
			} else {
				palabra = texto;
				finTexto = true;
			}
			if (palabra.length() > palabraMayor.length()) {
				palabraMayor = palabra;
			}
			texto = texto.substring(indiceEspacio + 1);

		}
		System.out.println("La palabra más grande que has escrito es " + palabraMayor + ", que tiene un total de " + palabraMayor.length() + " caracteres.");
	}
}