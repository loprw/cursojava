package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import lombok.Getter;
import lombok.Setter;

public final class Ebook extends ProductoElectronico implements Operable {

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
	
	public void suspender() {
		System.out.println(getNombre() + " está suspendido.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ebook [memoria=");
		builder.append(memoria);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void select() {
		System.out.println("Consultando " + getNombre());	
	}

	@Override
	public void delete() {
		System.out.println("Borrando " + getNombre());	
	}

	@Override
	public void update() {
		System.out.println("Actualizando " + getNombre());		
	}

	@Override
	public void insert() {
		System.out.println("Insertando en " + getNombre());	
	}
	
	
}
