package es.cursojava.colecciones.ejercicios.alumnos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.inicio.funciones.Utilidades;
import es.cursojava.poo.ejercicios.Alumno;

/*
 * 1. Vamos a crear 6 alumnos
 * 2. Los metemos en una lista
 * 3. Creamos un método para mostrar la información de todos los alumnos.
 * 4. Otro método donde vamos a preguntar por el nombre de un alumno y dirá la nota media de todos los alumnos que se llamen igual.
 * 
 * 5. Último en hacerse, actualizar para todos los alumnos suspensos su nota a 0.
 * 
 * Después vamosa separar a los alumnos por aulas.
 * aula1 -> 2 alumnos.
 * aula2 -> 2 alumnos.
 * aula3 -> 2 alumnos.
 * 
 * Mostrar por cada aula los datos de los alumnos.
 * Indicar cual es el aula que tiene el alumno con la nota media más alta.
 */
public class MainAlumnosColecciones {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("Jose", "Llorente", 22, 4.5, "alumno1@example.com");
		Alumno alumno2 = new Alumno("Duban", "Dubai", 29, 8.4, "alumno2@example.com");
		Alumno alumno3 = new Alumno("Jose", "Pedriza", 32, 8.25, "alumno3@example.com");
		Alumno alumno4 = new Alumno("Pedro", "Picapiedra", 42, 6, "alumno4@example.com");
		Alumno alumno5 = new Alumno("Victoria", "Jubilosa", 18, 9.3, "alumno5@example.com");
		Alumno alumno6 = new Alumno("Pedro", "Martínez", 30, 4, "alumno6@example.com");

		List<Alumno> alumnos = new ArrayList<>();
		alumnos = Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6);

		String nombre = Utilidades.pideDatoCadena("Indica el nombre de un alumno:");
		mostrarInformacionAlumnos(alumnos);
		notaMediaNombre(alumnos, nombre);

		double notaMedia = notaMediaIgualNombre(alumnos, nombre);

		if (notaMedia != -1) {
			System.out.println(
					"La nota media de los alumnos con el nombre " + alumno4.getNombre() + " es: " + notaMedia + ".");
		} else {
			System.out.println("No hay alumnos con ese nombre en nuestros archivos.");
		}

		Map<String, List<Alumno>> aulas = new LinkedHashMap<>();

		List<Alumno> listado1 = Arrays.asList(alumno1, alumno2);
		aulas.put("aula1", listado1);

		List<Alumno> listado2 = Arrays.asList(alumno3, alumno4);
		aulas.put("aula2", listado2);

		List<Alumno> listado3 = Arrays.asList(alumno5, alumno6);
		aulas.put("aula3", listado3);

		mostrarAlumnosAula(aulas);
	}

	public static void mostrarInformacionAlumnos(List<Alumno> alumnos) {

		for (Alumno alumno : alumnos) {
			alumno.mostrarInformacion();
		}
	}

	public static void notaMediaNombre(List<Alumno> alumnos, String nombre) {

		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equals(nombre)) {
				System.out.println("El alumno " + alumno.getNombre() + " " + alumno.getApellidos()
						+ " tiene una nota media de " + alumno.getNotaMedia());
			}
		}
	}

	public static double notaMediaIgualNombre(List<Alumno> alumnos, String nombre) {

		double sumaNotasMedias = 0;
		int contador = 0;
		double mediaAlumnos = -1;

		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equals(nombre)) {
				sumaNotasMedias += alumno.getNotaMedia();
				contador++;
			}
		}

		if (contador != 0) {
			mediaAlumnos = sumaNotasMedias / contador;
		}

		return mediaAlumnos;
	}

	public static void mostrarAlumnosAula(Map<String, List<Alumno>> aulas) {

		for (String aula : aulas.keySet()) {
			System.out.println("Datos de los alumnos del " + aula + ":");
			System.out.println(aulas.get(aula));
		}
	}
	
	public static void mostrarAulaMejorNota(Map<String, List<Alumno>> aulas) {
		double numAula = -1;
		for (String aula: aulas.keySet()) {
			for (int i = 0; i < aulas.get(aula).size(); i++) {
				if (aulas.get(aula).get(i).getNotaMedia() > numAula) {
					numAula += aulas.get(aula).get(i).getNotaMedia();
				}
			}
		}
		
		System.out.println("El aula con la mayor nota media es el aula " + aulas);
	}
}
