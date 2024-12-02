package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 4
 * 
 * Mostrar todas las tablas de multiplicar hasta el número que solicitéis al usuario
 */

public class Ejercicio4 {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica un número:");
		int tabla = scan.nextInt();
		
		for (int i = 0; i <= tabla; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 0; j <= 10; j++) {
				System.out.println("\t" + i + " x " + j + " = " + (i * j));
			}
		}
		
		scan.close();
	}
}
