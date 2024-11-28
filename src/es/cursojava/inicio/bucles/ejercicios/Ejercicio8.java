package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 8
 * 8. Numero tenistas en el top 10 --> 
 * + Pedir por teclado la cantidad de tenistas que se apuntan a un torneo, 
 * + por cada uno de ellos preguntar en que puesto de la ATP se encuentran. 
 * + Indicar cuantos tenistas estarían entre los diez primeros.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica la cantidad de tenistas en el torneo:");
		int numTenistas = scan.nextInt();
		int posicionATP = 0;
		int top10 = 0;
		
		for (int i = 1; i <= numTenistas; i++) {

			System.out.println("Indica la posición ATP del tenista " + i);
			posicionATP = scan.nextInt();
			if (posicionATP <= 10) {
				top10++;
			}
		}
		
		scan.close();
		
		System.out.println("En el torneo hay un total de " + top10 + " tenistas en el top 10 de la ATP.");
	}
}
