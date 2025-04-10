package es.cursojava.dao;

import java.util.List;

import es.cursojava.entities.Estudiante;

public interface EstudianteDAO {

	abstract boolean agregarEstudiante(Estudiante estudiante);
	abstract List<Estudiante> mostrarEstudiantes();
}
