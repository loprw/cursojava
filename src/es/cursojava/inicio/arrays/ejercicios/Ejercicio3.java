package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 3
 * 
 * Pedir cuantos números se van a guardar
 * Pedir los valores de cada número
 * Mostrar todos los números introducidos
 * Reordenar los números de manera inversa en el array
 * Mostrar de nuevo todos los números
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números a ingresar: ");
		int[] numeros = new int[scan.nextInt()];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indica el número en la posición " + (i + 1));
			numeros[i] = scan.nextInt();
		}
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		int numeroAInvertir = 0;
		
		for (int i = 0; i < numeros.length / 2; i++) {
			numeroAInvertir = numeros[numeros.length - i - 1];
			numeros[numeros.length - i - 1] = numeros[i];
			numeros[i] = numeroAInvertir;
		}
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
	}
}
