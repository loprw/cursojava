package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 4: Verificar si un número es par o impar
 * Haz un programa que:
 * 1- Tenga un número entero.
 * 2- Determine si un número es par o impar utilizando el operador módulo (%).
 * 3- Muestre el resultado.
 */
public class Ejercicio4 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero:");
		int num1 = scan.nextInt();
//		int num1 = 3;//indico el número a comparar
		boolean esPar = num1 % 2 == 0;//resuelvo si es par
		//boolean esImpar = num1 % 2 != 0;
		System.out.println("¿El número " + num1 + " es par? " + esPar);//pinto si es par
		System.out.println("¿El número " + num1 + " es impar? " + !esPar);//pinto si es impar
		
		scan.close();
	}
}
