package es.cursojava.excepciones.ejercicios.bar;

public abstract class Cliente {
	
	private String nombre;

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
