package es.cursojava.inicio.condicionales.ejercicios;

/*
 * Ejercicio 1:
 * +Crear un paquete ejercicios dentro de condicionales.
 * +Declarar las variables asignatura de tipo String, nombreAlumno de tipo String y nota de tipo int.
 * +Inicilizar las variables con valores inventados.
 * +El resultado a mostrar sería: El alumno Juan en la asignatura de Matemáticas tiene un Notable.
 * 0 < 5 Suspenso
 * 5 < 7 Aprobado
 * 7 < 9 Notable
 * 9-10 Sobresaliente 
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		String asignatura;
		String nombreAlumno = "Pedro";
		int nota = 7;
		String notaTexto = "";

//		//código con repeticiones, si se tuviera que modificar se tendría que hacer muchas veces
//		if (nota >= 9) {
//			System.out.println("El alumno " + nombreAlumno + " en la asignatura de " + asignatura + " tiene un Sobresaliente.");
//		} else if (nota >= 7) {
//			System.out.println("El alumno " + nombreAlumno + " en la asignatura de " + asignatura + " tiene un Notable.");
//		} else if (nota >= 5) {
//			System.out.println("El alumno " + nombreAlumno + " en la asignatura de " + asignatura + " tiene un Aprobado.");
//		} else {
//			System.out.println("El alumno " + nombreAlumno + " en la asignatura de " + asignatura + " tiene un Suspenso.");
//		}

		// más eficiente, menos código y más sencillo de modificar

		if (Math.random() > 0.5) {
			asignatura = "Matemáticas";
		} else {
			asignatura = "Física";
		}

		if (nota >= 9) {
			notaTexto = "Sobresaliente";
		} else if (nota >= 7) {
			notaTexto = "Notable";
		} else if (nota >= 5) {
			notaTexto = "Aprobado";
		} else {
			notaTexto = "Suspenso";
		}

		System.out.println("El alumno " + nombreAlumno + " en la asignatura de " + asignatura + " tiene un " + notaTexto);
	}
}
