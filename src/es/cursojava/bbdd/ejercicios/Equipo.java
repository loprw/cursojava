package es.cursojava.bbdd.ejercicios;

import java.util.Date;
import java.util.List;

public class Equipo {

	private int id;
	private String nombre;
	Date fecha_creacion;
	List<Empleado> empleados;
	
	public Equipo(int id, String nombre, Date fecha_creacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
		this.empleados = null;
	}
	
	public Equipo(int id, String nombre, Date fecha_creacion, List<Empleado> empleados) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
		this.empleados = empleados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Equipo [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", fecha_creacion=");
		builder.append(fecha_creacion);
		builder.append("]");
		return builder.toString();
	}
}
