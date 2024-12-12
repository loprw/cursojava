package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5
==========================================================
+ Definir array bidimensional de enteros de 2x3
+ Dar los valores de cada posición de una en una
+ Mostrar todos los datos en formato matriz con dos for anidados
+ Hacer los mismo con 2 foreach
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int [][] matriz = new int[2][3];
		
		Scanner scan = new Scanner(System.in);
			
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Indique el número para la posición " + (i + 1) + "," + (j+1));
				matriz[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int numero: matriz[i]) {
				System.out.print(numero + " ");
			}
			System.out.println("\n");
		}
	}
}
