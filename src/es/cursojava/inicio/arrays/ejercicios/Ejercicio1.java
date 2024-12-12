package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 1
 * Pedir número de alumnos
 * Crear array de String con el número de alumnos indicado
 * Pedir para cada alumno su nombre y guardarlo en el array
 * Mostrar el nombre de todos los alumnos (con for)
 * Mostrar el nombre de todos los alumnos que empiecen por A (con for each)
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica el número de alumnos:");
		int alumnos = scan.nextInt();
		String[] nombresAlumnos = new String[alumnos];
		
		for (int i = 0; i < alumnos; i++) {
			scan = new Scanner(System.in);
			System.out.println("Indica el nombre del alumno " + (i + 1));
			String nombre = scan.nextLine();
			nombresAlumnos[i] = nombre;			
		}
		
		for (int i = 0; i < nombresAlumnos.length; i++) {
			System.out.println(nombresAlumnos[i]);
		}
		
		for (String nombre: nombresAlumnos) {
			if (nombre.toLowerCase().startsWith("A")) {
				System.out.println(nombre);
			}
		}
		
		String [] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z"};
		
		for (String nombre: nombresAlumnos) {
			for (String letra: alfabeto) {
				System.out.println("Nombres que empiezan por la letra " + letra.toUpperCase());
				if (nombre.toLowerCase().startsWith(letra)) {
					System.out.println(nombre);
				}
			}
		}
	}

}
