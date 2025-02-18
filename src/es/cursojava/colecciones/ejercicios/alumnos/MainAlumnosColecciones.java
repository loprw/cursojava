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
		Alumno alumno7 = new Alumno("Miguel", "Perez", 25, 7.5, "alumno7@example.com");
		Alumno alumno8 = new Alumno("Jaime", "Gascón", 17, 9.4, "alumno8@example.com");
		Alumno alumno9 = new Alumno("Adolfo", "Moreno", 32, 2.05, "alumno9@example.com");
		Alumno alumno10 = new Alumno("Adriana", "de la Torre", 42, 10, "alumno10@example.com");
		Alumno alumno11 = new Alumno("Sonsoles", "Hermosilla", 35, 9, "alumno11@example.com");
		Alumno alumno12 = new Alumno("Soledad", "Jiménez", 60, 4, "alumno12@example.com");

		// otra opcion, tener en cuenta que .addAll AÑADE datos a la lista (manteniendo
		// los datos añadidos anteriormente), igualar la variable crea un
		// nuevo objeto y reemplaza a donde apunta la variable (eliminando los datos
		// almacenados previamente)
		
		//el quitar alumnos funcionaria aquí pq es un ArrayList.
		List<Alumno> listaAlumnos = new ArrayList<>();
		listaAlumnos.addAll(Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6));
		//el quitar alumnos no funcionaria aquí pq no es un ArrayList (en realidad no se sabe qué clase es)
		List<Alumno> alumnos = Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6);

		mostrarInformacionAlumnos(alumnos);
		String nombre = Utilidades.pideDatoCadena("Indica el nombre de un alumno:");
		notaMediaNombre(alumnos, nombre);

		double notaMedia = notaMediaIgualNombre(alumnos, nombre);

		if (notaMedia != -1) {
			System.out.println("La nota media de los alumnos con el nombre " + nombre + " es: " + notaMedia + ".");
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

		mostrarAulaMejorNota(aulas);
		
		eliminarAlumnosSuspensos(listaAlumnos);
		
		mostrarInformacionAlumnos(listaAlumnos);
		
		List<Alumno> aula1 = new ArrayList<>();
		aula1.addAll(Arrays.asList(alumno1, alumno12));
		List<Alumno> aula2 = new ArrayList<>();
		aula2.addAll(Arrays.asList(alumno2, alumno11));
		List<Alumno> aula3 = new ArrayList<>();
		aula3.addAll(Arrays.asList(alumno3, alumno10));
		List<Alumno> aula4 = new ArrayList<>();
		aula4.addAll(Arrays.asList(alumno4, alumno9));
		List<Alumno> aula5 = new ArrayList<>();
		aula5.addAll(Arrays.asList(alumno5, alumno8));
		List<Alumno> aula6 = new ArrayList<>();
		aula6.addAll(Arrays.asList(alumno6, alumno7));
		Map<String, List<Alumno>> aulas1 = new LinkedHashMap<>();
		aulas1.put("aula1", aula1);
		aulas1.put("aula2", aula2);
		Map<String, List<Alumno>> aulas2 = new LinkedHashMap<>();
		aulas2.put("aula1", aula3);
		aulas2.put("aula2", aula4);
		Map<String, List<Alumno>> aulas3 = new LinkedHashMap<>();
		aulas3.put("aula1", aula5);
		aulas3.put("aula2", aula6);
		
		Colegio colegio1 = new Colegio("CP Nuestra Señora de Jesús", "Calle Marcelo Usera 1", aulas1);
		Colegio colegio2 = new Colegio("Cas Serres", "Avda Sant Jordi 2", aulas2);
		Colegio colegio3 = new Colegio("CP Puig de'n Valls", "Calle Madrid 4", aulas3);
		
		List<Colegio> colegios = Arrays.asList(colegio1, colegio2, colegio3);
		
		mostrarInformacionColegios(colegios);
		
		
	}
	
	public static void mostrarInformacionColegios(List<Colegio> colegios) {
		
		for (Colegio colegio : colegios) {
			System.out.println(colegio);
			
		}
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
		double mayorNotaMedia = -1;
		String nombreAula = "";

		for (String aula : aulas.keySet()) {
			for (int i = 0; i < aulas.get(aula).size(); i++) {
				if (aulas.get(aula).get(i).getNotaMedia() > mayorNotaMedia) {
					mayorNotaMedia = aulas.get(aula).get(i).getNotaMedia();
					nombreAula = aula;
				}
			}
		}
		System.out.println("El aula con la mayor nota media es el " + nombreAula);
	}

	public static void eliminarAlumnosSuspensos(List<Alumno> alumnos) {
// 		forma incorrecta, pq estamos recorriendo la lista y eliminamos datos de la
// 		misma, por lo que Java se vuelve loco al ser un ArrayList. Si es un objeto de tipo
//		CopyOnWriteArrayList, crea una copia al recorrerla y no da error.
//		for (Alumno alumno : alumnos) {
//			if (alumno.getNotaMedia() < 5) {
//				alumnos.remove(alumno);
//			}
//		}
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno alumno = alumnos.get(i);
			if (alumno.getNotaMedia() < 5) {
				alumnos.remove(i--);
			}
		}
	}
}