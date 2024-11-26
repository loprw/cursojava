package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 2:
 * Pedir dos números y pedir la operación que se quiere realizar ("suma" o "+", "resta" o "-", "multiplica" o * y "divide" o /.
 * Mostrar el resultado de la operación con los dos números
 */
public class Ejercicio2 {

	public static void main(String [] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Indica un número:");
		double num1 = scan1.nextDouble();
		
		System.out.println("Indica otro número:");
		double num2 = scan1.nextDouble();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Indica que operación quieres hacer:");
		String operacion = scan2.nextLine();
		
		if (operacion.equals("suma") || operacion.equals("+")) {
			System.out.println(num1 + num2);
		} else if (operacion.equals("resta") || operacion.equals("-")) {
			System.out.println(num1 - num2);
		} else if (operacion.equals("multiplica") || operacion.equals("*")) {
			System.out.println(num1 * num2);
		} else if (operacion.equals("divide") || operacion.equals("/")) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("Error al indicar operación");
		}
		scan1.close();
		scan2.close();		
	}
}
