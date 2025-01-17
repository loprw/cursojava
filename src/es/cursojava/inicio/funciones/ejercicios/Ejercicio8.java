package es.cursojava.inicio.funciones.ejercicios;

import es.cursojava.inicio.funciones.Utilidades;

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
public class Ejercicio8 {

	public static void main(String[] args) {

		int aulas = Utilidades.pideDatoNumerico("Indica el número de aulas que tiene el colegio:");
		int alumnosAula = 5;
		String[][] nombresAlumnos = new String[aulas][alumnosAula];
		final int OPCION_SALIDA = 5;
		int opcion = 0;
		String[] menu = { "\n1. Pedir datos.", "\n2. Mostrar alumnos por aula", "\n3. Buscar alumno",
				"\n4. Borrar alumno", "\n5. Salir\n" };
		boolean alumnoEncontrado = false;

		do {
			Utilidades.pintaMenu(menu);

			opcion = Utilidades.pideDatoNumerico("");

			if (opcion == 1) {

				pedirAlumnos(aulas, alumnosAula, nombresAlumnos);

			} else if (opcion == 2) {

				mostrarAlumnosAula(aulas, alumnosAula, nombresAlumnos);

			} else if (opcion == 3) {

				String alumnoABuscar = Utilidades.pideDatoCadena("\nIndica el nombre del alumno a buscar: ");

				buscarAlumno(aulas, alumnosAula, nombresAlumnos, alumnoABuscar, alumnoEncontrado);

			} else if (opcion == 4) {

				String alumnoABorrar = Utilidades.pideDatoCadena("\nIndica el nombre del alumno a borrar: ");
				alumnoABorrar = alumnoABorrar.toLowerCase();

				borrarAlumno(aulas, alumnosAula, nombresAlumnos, alumnoABorrar, alumnoEncontrado);

			} else if (opcion == 5) {
				System.out.println("\nAdiós!");
			} else {
				System.out.println("\nHas indicado una opción incorrecta, pide una correcta.");
			}
		} while (opcion != OPCION_SALIDA);
	}

	private static void pedirAlumnos(int aulas, int alumnosAula, String[][] nombresAlumnos) {

		for (int aula = 0; aula < aulas; aula++) {
			for (int alumno = 0; alumno < alumnosAula; alumno++) {
				if (nombresAlumnos[aula][alumno] == null) {
					String nombre = Utilidades.pideDatoCadena("Indica el nombre del alumno o alumna situado en el aula "
							+ (aula + 1) + " y la mesa " + (alumno + 1) + ":");
					nombresAlumnos[aula][alumno] = nombre;
				}
			}
		}
	}

	private static void mostrarAlumnosAula(int aulas, int alumnosAula, String[][] nombresAlumnos) {

		System.out.println("\nListado de alumnos por aula:\n");
		for (int aula = 0; aula < aulas; aula++) {
			System.out.println("Los alumnos que están en el aula " + (aula + 1) + " son: ");
			for (int alumno = 0; alumno < alumnosAula; alumno++) {
				if (nombresAlumnos[aula][alumno] != null) {
					System.out.println("\t" + nombresAlumnos[aula][alumno]);
				}
			}
		}
	}

	private static void buscarAlumno(int aulas, int alumnosAula, String[][] nombresAlumnos, String alumnoABuscar,
			boolean alumnoEncontrado) {

		for (int aula = 0; aula < aulas; aula++) {
			for (int alumno = 0; alumno < alumnosAula; alumno++) {
				if (nombresAlumnos[aula][alumno] != null
						&& nombresAlumnos[aula][alumno].equalsIgnoreCase(alumnoABuscar)) {
					System.out.println("\nEl alumno buscado, " + alumnoABuscar + ", está en el aula " + (aula + 1));
					alumnoEncontrado = true;
				}
			}
		}

		if (!alumnoEncontrado) {
			System.out.println("El alumno " + alumnoABuscar + " no se ha encontrado.");
		}
	}

	private static void borrarAlumno(int aulas, int alumnosAula, String[][] nombresAlumnos, String alumnoABorrar,
			boolean alumnoEncontrado) {

		for (int aula = 0; aula < aulas; aula++) {
			for (int alumno = 0; alumno < alumnosAula; alumno++) {
				if (nombresAlumnos[aula][alumno] != null
						&& nombresAlumnos[aula][alumno].equalsIgnoreCase(alumnoABorrar)) {
					alumnoEncontrado = true;
					String respuesta = Utilidades.pideDatoCadena("\n¿Está seguro de querer borrar a " + alumnoABorrar
							+ ", que está en el aula " + (aula + 1) + "?\nIndique \"Si\" para borrar al alumno.");

					if (respuesta.toLowerCase().equals("si") || respuesta.toLowerCase().equals("\"si\"")) {
						System.out.println("\nSe ha borrado el alumno " + nombresAlumnos[aula][alumno]);
						nombresAlumnos[aula][alumno] = null;
					} else {
						System.out.println("\nNo se ha borrado el nombre indicado, " + nombresAlumnos[aula][alumno]);
					}
				}
			}
		}
		if (!alumnoEncontrado) {
			System.out.println("El alumno que desea borrar no está en ninguna mesa de ningún aula.");
		}
	}
}