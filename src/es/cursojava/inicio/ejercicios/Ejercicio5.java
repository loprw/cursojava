package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5: Conversión de grados Celsius a Fahrenheit
 * Escribe un programa que:
 * 1- Tenga un valor de temperatura en grados Celsius.
 * 2- Convierta la temperatura a Fahrenheit utilizando la fórmula: F = C x 9 / 5 + 32.
 * 3- Muestre el resultado en pantalla.
 */
public class Ejercicio5 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un valor de temperatura en grados Celsius:");
		double tempC = scan.nextDouble();
//		int tempC = 23;
		double tempFahr= tempC * 9.0 / 5.0 + 32;//si se pone 9 y 5, falsea el cálculo pq realiza sumas enteras en vez de reales
		System.out.println(tempC + " grados Celsius es igual a " + tempFahr + " grados Fahrenheit.");
		
		scan.close();
	}
}