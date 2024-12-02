package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
 * 7. Solicitar por consola el numero de números de la serie 
 * de Fibonacci que se quieren mostrar
 * Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,....
 */
public class Ejercicio7 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica un número entero");
		int num = scan.nextInt();
		scan.close();
		
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int i = 1;
		
		if (num <= 0) {
			System.out.println("Si no quieres ver ningún número de la Serie de Fibonacci, no haber empezado el programa!");
		} else if (num == 1) {
			System.out.println("Vamos a ver el primer " + num + " número de la serie de Fibonacci:");
			System.out.println(num1);
		} else {
			System.out.println("Vamos a ver los primeros " + num + " números de la serie de Fibonacci:");
			System.out.println(num1);
			do {
				System.out.println(num2);
				num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
				i++;
			} while (i < num);
		}
	}
}
