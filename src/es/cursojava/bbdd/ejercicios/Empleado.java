package es.cursojava.bbdd.ejercicios;

import java.util.Date;

public class Empleado {

	private int id;
	private String nombre;
	private int edad;
	private double salario;
	private int departamento_id;
	private Date fecha_contratacion;
	private int equipo_id;
	
	public Empleado(int id, String nombre, int edad, double salario, int departamento_id, Date fecha_contratacion,
			int equipo_id) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.departamento_id = departamento_id;
		this.fecha_contratacion = fecha_contratacion;
		this.equipo_id = equipo_id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDepartamento_id() {
		return departamento_id;
	}

	public void setDepartamento_id(int departamento_id) {
		this.departamento_id = departamento_id;
	}

	public Date getFecha_contratacion() {
		return fecha_contratacion;
	}

	public void setFecha_contratacion(Date fecha_contratacion) {
		this.fecha_contratacion = fecha_contratacion;
	}

	public int getEquipo_id() {
		return equipo_id;
	}

	public void setEquipo_id(int equipo_id) {
		this.equipo_id = equipo_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", departamento_id=");
		builder.append(departamento_id);
		builder.append(", fecha_contratacion=");
		builder.append(fecha_contratacion);
		builder.append(", equipo_id=");
		builder.append(equipo_id);
		builder.append("]");
		return builder.toString();
	}
}
