package es.cursojava.excepciones.ejercicios.alumnos;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;
	private double notaMedia;
	private String email;
	private String[] asignaturas;

	public Alumno(String nombre, String apellidos, int edad, double notaMedia, String email, String[] asignaturas)
			throws NotaInvalidaException {

		this.nombre = nombre;
		this.apellidos = apellidos;
		validarEdad(edad);
		validarNotaMedia(notaMedia);
		this.email = email;
		this.asignaturas = asignaturas;
	}

	public Alumno(String nombre, String apellidos, int edad, double notaMedia, String email)
			throws NotaInvalidaException {

		this.nombre = nombre;
		this.apellidos = apellidos;
		validarEdad(edad);
		validarNotaMedia(notaMedia);
		this.email = email;
	}

	public Alumno() {

	}

	public void estudiar() {

		if (notaMedia == 0) {
			System.out.println("No ha estudiado nada.");
		} else if (notaMedia < 5) {
			System.out.println("Ha estudiado muy poco.");
		} else if (notaMedia < 7) {
			System.out.println("Es buen estudiante.");
		} else if (notaMedia < 10) {
			System.out.println("Es muy bueno.");
		} else if (notaMedia == 10) {
			System.out.println("Es un genio.");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", notaMedia=");
		builder.append(notaMedia);
		builder.append(", email=");
		builder.append(email);
		builder.append(", asignaturas=");
		builder.append(Arrays.toString(asignaturas));
		builder.append("]");
		return builder.toString();
	}

	public void mostrarInformacion() {
		System.out.println(this.toString());
	}

	private void validarEdad(int edad) {
		if (edad <= 0) {
			throw new IllegalArgumentException("El valor de edad es inválido, debe ser 0 o mayor.");
		} else {
			this.edad = edad;
		}
	}

	private void validarNotaMedia(double notaMedia) throws NotaInvalidaException {
		if (notaMedia < 0 || notaMedia > 10) {
			throw new NotaInvalidaException("El valor de la nota media es incorrecto, debe estar entre 0 y 10.");
		} else {
			this.notaMedia = notaMedia;
		}
	}
}
