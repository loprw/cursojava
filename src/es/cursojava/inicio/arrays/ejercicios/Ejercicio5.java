package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5
==========================================================
+ Definir array bidimensional de enteros de 4x4
+ Pedir los valores de cada posición de una en una
+ Mostrar todos los datos en formato matriz con dos for anidados
+ Por cada fila mostrar la media de los numeros
+ Mostrar los números de la diagonal
 */
public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Indica un número entero para la posición " + (i + 1) + "," + (j + 1));
				int numero = scan.nextInt();
				matriz[i][j] = numero;
			}
		}
		System.out.println();
		
		for (int[] fila: matriz) {
			for (int numero: fila) {
				System.out.print(numero + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int suma;
		double media;
		for (int i = 0; i < matriz.length; i++) {
			suma = 0;
			for (int numero: matriz[i]) {
				suma += numero;
			}
			media = (double)suma / matriz[i].length;
			System.out.println("La media de la fila " + (i + 1) + " es: " + media);	
		}
		System.out.println();
		
		System.out.println("Los números de la diagonal son: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + "\t");
		}
	}
}
