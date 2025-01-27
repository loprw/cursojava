package es.cursojava.poo.ejercicios;

public class Espectador {
	
	private String nombre;
	private String dni;
	
	public Espectador(String nombre, String dni) {

		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void irCine(Cine cine) {
		
		System.out.println("\nHola " + getNombre() +".\n");
		cine.mostrarCartelera();
	}
}
