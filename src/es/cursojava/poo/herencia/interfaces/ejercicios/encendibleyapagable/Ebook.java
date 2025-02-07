package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import lombok.Getter;
import lombok.Setter;

public class Ebook extends ProductoElectronico {

	@Getter @Setter private double memoria;
	
	public Ebook(String nombre, double precio, String fechaFabricacion, double memoria) {
		super(nombre, precio, fechaFabricacion);
		this.memoria = memoria;
	}

	@Override
	public void apagar() {
		System.out.println(getNombre() + " está encendido.");
	}

	@Override
	public void encender() {
		System.out.println(getNombre() + " está apagado.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ebook [memoria=");
		builder.append(memoria);
		builder.append("]");
		return builder.toString();
	}
}
