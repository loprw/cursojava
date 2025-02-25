package es.cursojava.excepciones.ejercicios.alumnos;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.inicio.funciones.Utilidades;
import es.cursojava.poo.ejercicios.Alumno;

public class MainEjercicio1 {

	public static void main(String[] args) {

		List<es.cursojava.excepciones.ejercicios.alumnos.Alumno> listaAlumnos = crearAlumnos();
		for (es.cursojava.excepciones.ejercicios.alumnos.Alumno alumno : listaAlumnos) {
			System.out.println(alumno);
		}

	}

	public static List<es.cursojava.excepciones.ejercicios.alumnos.Alumno> crearAlumnos() {
		System.out.println("Vamos a crear 5 alumnos:");
		int numAlumnos = 5;
		List<es.cursojava.excepciones.ejercicios.alumnos.Alumno> listaAlumnos = new ArrayList<>();
		int contador = 1;

		do {

			String nombre = Utilidades.pideDatoCadena("Indica el nombre del alumno " + contador + ":");
			String apellidos = Utilidades.pideDatoCadena("Indica los apellidos del alumno " + contador + ":");
			int edad = Utilidades.pideDatoNumerico("Indica la edad del alumno " + contador + ":");
			double notaMedia = Utilidades.pideDatoDouble("Indica la nota media del alumno " + contador + ":");
			String email = Utilidades.pideDatoCadena("Indica el email del alumno " + contador + ":");
			try {
				es.cursojava.excepciones.ejercicios.alumnos.Alumno varAlumno = 
						new es.cursojava.excepciones.ejercicios.alumnos.Alumno(
						nombre, apellidos, edad, notaMedia, email);
				listaAlumnos.add(varAlumno);
			} catch (NotaInvalidaException nie) {
				System.err.println("Error 1: " + nie.getMessage());
			} catch (IllegalArgumentException iae) {
				System.err.println("Error 2: " + iae.getMessage());
			}

			contador++;
			numAlumnos--;
		} while (numAlumnos != 0);

		return listaAlumnos;
	}
}
