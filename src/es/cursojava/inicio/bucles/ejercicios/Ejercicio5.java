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
		double numAlumnos = scan.nextInt();
		double  notaGlobal = 0;
		
		for (int i = 1; i <= numAlumnos; i++) {
			System.out.println("Indica la nota del alumno " + i);
			int nota = scan.nextInt();
			notaGlobal += nota;
		}
		
		double mediaGlobal = notaGlobal / numAlumnos;
		System.out.println("La nota media del aula es "+ mediaGlobal);
		
		scan.close();
	}
}