package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/**
 * 2. Pedir 10 numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos de 5
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		int cantidadMult3 = 0;
		int cantidadMult5 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//mejor que vaya de 0 a 9 -10 números-, en vez de 1 a 10 -10 números tb-, para acostumbrarnos a arrays
		for (int i = 0; i < 10; i++) {

			System.out.println("Pide un número entero:");
			int num = scan.nextInt();
			
			if (num % 3 == 0) {
				cantidadMult3++;
			}
			
			if (num % 5 == 0) {
				cantidadMult5++;
			}
		}
		
		System.out.println("Hay " + cantidadMult3 + " múltiplos de 3 y " + cantidadMult5 + " múltiplos de 5.");

		scan.close();
	}
}