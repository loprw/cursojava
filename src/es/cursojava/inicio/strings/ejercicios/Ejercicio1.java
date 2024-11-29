package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 1
==============================
Escribe un programa que reciba un String y devuelva el texto invertido.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un texto: ");
		String texto = scan.nextLine();
		String textoInvertido = "";
		
		for (int i = 0; i < texto.length(); i++) {
			textoInvertido = texto.charAt(i) + textoInvertido;
		}
		
		System.out.println(textoInvertido);
	}

}
