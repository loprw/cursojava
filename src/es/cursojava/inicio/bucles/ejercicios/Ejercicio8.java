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
		//Variables mejor con todo texto
		int topTen = 0;
		
		//Es mejor inicializar i en 0 en vez de 1 y la condición dejarla en < en vez de <=
		//para acostumbranos a trabajar con Strings y arrays, cuya primera posición es siempre 0
		for (int i = 0; i < numTenistas; i++) {

			//para evitar que los valores negativos nos den falsos resultados
			do {
			//es i + 1 porque hemos igualado i a 0
			System.out.println("Indica la posición ATP del tenista " + (i + 1));
			posicionATP = scan.nextInt();
			} while (posicionATP <= 0);
			
			if (posicionATP <= 10) {
				topTen++;
			}
		}
		
		scan.close();
		
		System.out.println("En el torneo hay un total de " + topTen + " tenistas en el top 10 de la ATP.");
	}
}
