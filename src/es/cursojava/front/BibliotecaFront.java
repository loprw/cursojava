package es.cursojava.front;

import java.util.Date;
import java.util.List;

import es.cursojava.dao.EstudianteDAOImpl;
import es.cursojava.dto.EstudianteDTO;
import es.cursojava.entities.Estudiante;
import es.cursojava.services.BibliotecaService;
import es.cursojava.utils.Utilidades;

public class BibliotecaFront {
	
	BibliotecaService service = new BibliotecaService();

	public void mostrarMenu() {

		int opcion = -1;
		final int OPCION_SALIDA = 0;


		do {
			Utilidades.pintaMenu("\n\t\t**MENU**:\n\n" + "\n\t1. Añade un Estudiante."
					+ "\n\t2. Muestra todos los Estudiantes." + "\n\n\t0. Salir.\n", "");
			opcion = Utilidades.pideDatoNumerico("Indica una opción:");
			
			switch (opcion) {
			case 1 -> {crearEstudiante();}
			case 2 -> {mostrarEstudiantes();}
			case 0 -> {System.out.println("¡Adiós!");}
			default -> {System.out.println("Has indicado una opción incorrecta.");}
			}
		} while (opcion != OPCION_SALIDA);
	}
	
	public void crearEstudiante() {
		
		String nombre = Utilidades.pideDatoCadena("Indica el nombre del estudiante:");
		String apellidos = Utilidades.pideDatoCadena("Indica los apellidos del estudiante");
		Date fecha = Utilidades.convertirFecha();
		
		service.crearEstudiante(new EstudianteDTO(nombre, apellidos, fecha));
	}
	
	public void mostrarEstudiantes() {
		
		List<Estudiante> listado = service.mostrarEstudiantesService();
		for (Estudiante estudiante : listado) {
			System.out.println(estudiante);
		}
	}
}
