package es.cursojava.poo.herencia.ejercicios;

public class Instrumento {
	
	private String nombre;
	private String tipo;
	private boolean afinado;
	
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}
	
	public void afinar() {
		
		System.out.println("Afinanado instrumento " + nombre + ".");
		if (Math.random() > 0.4) {
			this.afinado = true;
		} else {
			this.afinado = false;
		}
		
	}
	
	public void tocar() {
		
		System.out.println("Tocando instrumento " + nombre + ".");
	}
}
