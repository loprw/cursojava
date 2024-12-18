package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

/*3
 * Ejercicio 8
==========================================================
Preguntar cuantas aulas tiene un colegio, 
Suponiendo que en cada aula caben 5 alumnos

1. Pedir datos
	+ Por cada mesa vacía de un aula solicitar el nombre del alumno
2. Mostrar alumnos por aula
	+ Mostrar por cada aula los nombres de los alumnos
3. Buscar alumno
	+ Pedir nombre del alumno a buscar
	+ Indicar en qué aula se encuentra
4. Borrar alumnos
	+ Confirmar borrado
5. Salir

Selecciona una opción
 */
public class Ejercicio7 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica el número de aulas que tiene el colegio:");
		int aulas = scan.nextInt();
		int alumnosAula = 5;
		String [][] nombresAlumnos = new String [aulas][alumnosAula];
		int opcion = 0;
		
		do {
			System.out.println("\n1. Pedir datos.\n2. Mostrar alumnos por aula.\n3. Buscar alumno.\n4. Borrar alumno.\n5. Salir.\n");
			opcion = scan.nextInt();
			
			if (opcion ==1) {
				for (int aula = 0; aula < aulas; aula++) {
					for (int alumno = 0; alumno < alumnosAula; alumno++) {
						if (nombresAlumnos[aula][alumno] == null) {
							scan = new Scanner(System.in);
							System.out.println("Indica el nombre del alumno o alumna situado en el aula " + (aula + 1) +
									" y la mesa " + (alumno + 1) + ":");
							String nombre = scan.nextLine();
							nombresAlumnos[aula][alumno] = nombre;
						}
					}
				}
			} else if (opcion == 2) {
				System.out.println("Listado de alumnos por aula:");
				for (int aula = 0; aula < aulas; aula++) {
					for (int alumno = 0; alumno < alumnosAula; alumno++) {
						if (nombresAlumnos[aula][alumno] != null) {
							System.out.println("El alumno " + nombresAlumnos[aula][alumno] + "está en el aula " + (aula + 1));
						}
					}
				}
			} else if (opcion == 3) {
				scan = new Scanner(System.in);
				System.out.println("Indica el nombre del alumno a buscar: ");
				String alumnoABuscar = scan.nextLine();
				for (int aula = 0; aula < aulas; aula++) {
					for (int alumno = 0; alumno < alumnosAula; alumno++) {
						if (nombresAlumnos[aula][alumno].equalsIgnoreCase(alumnoABuscar)) {
							System.out.println("El alumno buscado," + alumnoABuscar + ", está en el aula " + (aula + 1));
						}
					}
				}
			} else if (opcion == 4) {
				scan = new Scanner(System.in);
				System.out.println("Indica el nombre del alumno a borrar: ");
				String alumnoABorrar = scan.nextLine();
				for (int aula = 0; aula < aulas; aula++) {
					for (int alumno = 0; alumno < alumnosAula; alumno++) {
						if (nombresAlumnos[aula][alumno].equalsIgnoreCase(alumnoABorrar)) {
							scan = new Scanner(System.in);
							System.out.println("¿Está seguro de querer borrar a " + alumnoABorrar + ", que está en el aula "
									+ (aula + 1) + "?\nIndique Si o No");
							boolean borrar;
						} else {
							System.out.println("El alumno que desea borrar no se ecuentra en ningún aula");
						}
					}
				}
			} else if (opcion == 5) {
				System.out.println("Adiós!");
			} else {
				System.out.println("Has indicado una opción incorrecta, pide una correcta.");
			}
			
		} while (opcion != 5);		
		
	}
}
