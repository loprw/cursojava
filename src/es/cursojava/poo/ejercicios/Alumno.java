package es.cursojava.poo.ejercicios;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;
	private double notaMedia;
	private String email;
	private String[] asignaturas;
	
	public Alumno(String nombre, String apellidos, int edad, double notaMedia, String email, String[] asignaturas) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notaMedia = notaMedia;
		this.email = email;
		this.asignaturas = asignaturas;
	}
	
	public Alumno(String nombre, String apellidos, int edad, double notaMedia, String email) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notaMedia = notaMedia;
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
	
	
}
