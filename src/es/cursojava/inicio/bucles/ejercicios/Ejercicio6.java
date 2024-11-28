package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 6
 * Conjetura Collatz
 * Solicitar un numero:
 * +Si el numero es par, se divide entre dos
 * +Si es impar se multiplicar por 3 y se le suma 1
 * se repite hasta que el valor del numero es 1
 */
public class Ejercicio6 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica un número entero:");
		int num = scan.nextInt();
		scan.close();
		
		System.out.println("Has indicado el número " + num);
		
		while (num != 1) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num *= 3;
				num++;
			}
		}
		System.out.println("Se ha llegado al número " + num + ", demostrando la Conjetura de Collatz.");
	}
}