package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 3: Calculadora básica
 * Crea un programa que:
 * 1- Tenga dos números.
 * 2- Realice las operaciones +, -, * y /.
 * 3- Escriba las operaciones.
 */
public class Ejercicio3 {

	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Introduce un número");
		double num1 = scan1.nextDouble();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Introduce otro número");
		double num2 = scan2.nextDouble();
		
		double suma = num1 + num2;
		System.out.println("El resultado de la suma es " + suma);
		double resta = num1 - num2;
		System.out.println("El resultado de la resta es " + resta);
		double multiplicacion = num1 * num2;
		System.out.println("El resultado de la multiplicación es " + multiplicacion);
		double division = num1 / num2;
		System.out.println("El resultado de la división es " + division);
		
		scan1.close();
		scan2.close();
		
//		int num1 = 24;//indico un primer número
//		int num2 = 12;//indico un segundo número
//		int suma = num1 + num2;//realizo la suma de ambos
//		int resta = num1 - num2;//realizo la resta de ambos
//		int multiplicacion = num1 * num2;//realizo la multiplicación de ambos
//		int division = num1 / num2;//realizo la división de ambos
//		
//		System.out.println("El resultado de la suma es " + suma);//Pinto la suma de los números
//		System.out.println("El resultado de la resta es " + resta);//Pinto la resta de los números
//		System.out.println("El resultado de la multiplicación es " + multiplicacion);//Pinto la multiplicación de los números
//		System.out.println("El resultado de la división es " + division);//Pinto la resta de los números
	}
}
