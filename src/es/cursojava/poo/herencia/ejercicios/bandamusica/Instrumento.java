package es.cursojava.poo.herencia.ejercicios.bandamusica;

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

	public boolean isAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	public void afinar() {

		System.out.println("Afinanado instrumento " + nombre + ".");
//		Es mejor esta opción:
		this.afinado = Math.random() > 0.4;
		System.out.println("El instrumento " + nombre
				+ (afinado ? " se ha afinado correctamente" : "no se ha afinado correctamente"));
//		if (Math.random() > 0.4) {
//			this.afinado = true;
//		} else {
//			this.afinado = false;
//		}

	}

	public void tocar() {

		System.out.println("Tocando instrumento " + nombre + ".");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Instrumento [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", afinado=");
		builder.append(afinado);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
