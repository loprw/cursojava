package es.cursojava.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaSets {

	public static void main(String[] args) {

		Set<Alumno> alumnos = new HashSet<>();

		alumnos.add(new Alumno("N1", "A1", 22, 8, "n1a1@example.com"));
		alumnos.add(new Alumno("N2", "A2", 22, 8, "n2a2@example.com"));
		alumnos.add(new Alumno("N3", "A3", 22, 8, "n3a3@example.com"));
		
		Alumno a4 = new Alumno("N4", "A4", 22, 8, "n4a4@example.com");
		
		alumnos.add(a4);
		alumnos.add(a4);
		
		System.out.println(alumnos.size());
		
		Iterator<Alumno> alumni = alumnos.iterator();
		
		Stack<Alumno> pila = new Stack<>();
		
		Alumno a = alumni.next();
		System.out.println(a.getNombre());
		a = alumni.next();
		System.out.println(a.getNombre());
		
		while (alumni.hasNext()) {
			Alumno al = alumni.next();
			System.out.println(al.getNombre());
		}
	}
}
