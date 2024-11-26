package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 1: Calcular el área de un rectángulo3
 * Crea un programa que:
 * 1- Tenga un valor de base y de altura del rectángulo.
 * 2- Calcule el área del rectángulo usando la fórmula base = area * rectangulo
 * 3- Muestre el resultado en pantalla
 */
public class Ejercicio1 {

	public static void main(String [] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Introduce un valor para la base");
		double base = scan1.nextDouble();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Introduce un valor para la altura");
		double altura = scan2.nextDouble();
//		double base = 6.5;//Indico un valor para la base
//		double altura = 4.1;//Indico un valor para la altura
		double area = base * altura;//Hallo el área con la fórmula indicada
		System.out.println("El área del rectángulo es " + area);//Pinto el área
	
		scan1.close();
		scan2.close();
	}
}