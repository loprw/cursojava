package es.cursojava.ficheros.ejercicios;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.ficheros.ArchivoServicio;
import es.cursojava.poo.ejercicios.Alumno;

/*
 * Crear 3 objetos de tipo alumno
 * Añadirlos a una lista
 * Recorrer la lista
 * Por cada alumno crear una línea de datos en el fichero alumnos.txt
 * con el siguiente formato:
 * nombre|apelldios|edad|notaMedia|email|asignatura1,asignatura2,asignatura3
 */
public class EjercicioAlumnos {
	
	public static void main(String[] args) {
		
		List<Alumno> alumnos = crearAlumnos();
		ArchivoServicio service = new ArchivoServicio();
		String pathname = "./recursos/alumnos.txt";
		service.crearArchivo(pathname, alumnos);
		
	}
	
	public static List<Alumno> crearAlumnos() {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		String[] asignaturas = {"Física,Matemáticas,Historia"};
		String[] asignaturas2 = {"Física,Química,Historia"};
		String[] asignaturas3 = {"Literatura,Química,Historia"};
		
		alumnos.add(new Alumno("Jose", "Mínguez", 25, 5.8, "jmingez@ejemplo.es", asignaturas));
		alumnos.add(new Alumno("Elena", "Santos", 37, 8.5, "esantos@ejemplo.es", asignaturas2));
		alumnos.add(new Alumno("Antonio", "López", 41, 7.1, "alopez@ejemplo.es", asignaturas3));
		
		return alumnos;
	}
	
	
}
