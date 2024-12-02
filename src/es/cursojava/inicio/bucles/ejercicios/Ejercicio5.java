package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 5
 * 
 * Solicitar por consola el numero de alumnos de un aula. 
 * Pedir para cada alumno su nota
 * Indicar la nota media de todos los alumnos del aula.
 */
public class Ejercicio5 {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica el número de alumnos en el aula");
		int numAlumnos = scan.nextInt();
		double  totalNotas = 0;
		
		//Mejor empezar en el 0 y poner < numAlumnos; en vez de i = 1 e i <= numAlumnos
		//no es necesario declarar una variable local en el for para tomar las notas, podemos sumar a totalNotas el scan
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Indica la nota del alumno " + i);
			totalNotas = scan.nextDouble();
		}
		
		double mediaGlobal = totalNotas / numAlumnos;
		System.out.println("La nota media del aula es "+ mediaGlobal);
		
		scan.close();
	}
}