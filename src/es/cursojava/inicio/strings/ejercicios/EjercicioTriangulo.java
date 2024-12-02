package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

//Reto: Dibuja un triángulo

public class EjercicioTriangulo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Indica el número de líneas del triángulo");
		int altura = scan.nextInt();

//		for (int i = 1; i <= altura; i++) {
//			System.out.println("\n");
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//				
//			}
//		}

//		String impresion = "";
//
//		for (int i = 1; i <= altura; i++) {
//			impresion = impresion + " ";
//		}


		for (int i = 0; i < altura; i++) {
	
			System.out.print("\n");
			
			for (int j = 0; j < altura * 2; j++) {

				if (j == i || i == 0 || j == 2 * altura - i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}
