package es.cursojava.colecciones.ejercicios.alumnos;

import java.util.List;
import java.util.Map;

import es.cursojava.poo.ejercicios.Alumno;

public class Colegio {

	private String nombre;
	private String direccion;
	private Map<String, List<Alumno>> aulas;
	
	public Colegio(String nombre, String direccion, Map<String, List<Alumno>> aulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Map<String, List<Alumno>> getAulas() {
		return aulas;
	}

	public void setAulas(Map<String, List<Alumno>> aulas) {
		this.aulas = aulas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Colegio [nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", aulas=");
		builder.append(aulas);
		builder.append("]");
		return builder.toString();
	}	
}
