package es.cursojava.services;

import java.util.Date;
import java.util.List;

import es.cursojava.dao.EstudianteDAOImpl;
import es.cursojava.dto.EstudianteDTO;
import es.cursojava.entities.CarnetBiblioteca;
import es.cursojava.entities.Estudiante;
import es.cursojava.utils.Utilidades;

public class BibliotecaService {
	
	EstudianteDAOImpl est = new EstudianteDAOImpl();
	
	public void crearEstudiante(EstudianteDTO estudiante) {
		
		String nombre = estudiante.getNombre();
		String apellidos = estudiante.getApellidos();
		CarnetBiblioteca carnet = crearCarnet(estudiante.getFechaEmision());
		
		
		est.agregarEstudiante(new Estudiante(nombre, apellidos, carnet));
	}
	
	private CarnetBiblioteca crearCarnet() {
		
		Date fecha = Utilidades.convertirFecha();
		
		return new CarnetBiblioteca(fecha);
	}
	
	private CarnetBiblioteca crearCarnet(Date fecha) {
		return new CarnetBiblioteca(fecha);
	}
	
	public List<Estudiante> mostrarEstudiantesService() {
		
		List<Estudiante> listado = est.mostrarEstudiantes();
		
		return listado;
	}
}
