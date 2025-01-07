package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 6
==========================================================
De una matriz 4x4
Pedir los datos de la matriz
Sacar los números de la diagonal
Invertir la diagonal y mostrar la matriz
 */
 
public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Indique el número para la posición " + (i + 1) + "," + (j + 1));
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Los número en la diagonal son :");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + "/t");
				}
			}

		}
		
		//también se puede hacer
//		
//		for (int i = 0; i < matriz.length; i++) {
//			System.out.println(matriz[i][i]);
//		}
		
		System.out.println("\n");
		
		int areaIntercambio = 0;
		for (int i = 0; i < matriz.length / 2; i++) {
			for (int j = 0; j < matriz[i].length / 2; j++) {
				if (i == j) {
					areaIntercambio = matriz[matriz.length - 1 - i][matriz.length - 1 - j];
					matriz[matriz.length - 1 - i][matriz.length - 1 - j] = matriz[i][j];
					matriz[i][j] = areaIntercambio;
				}
			}
		}
		
		System.out.println("La nueva matriz es: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int numero: matriz[i]) {
				System.out.print(numero + "\t");
			}
			System.out.println("\n");
		}
	}

}