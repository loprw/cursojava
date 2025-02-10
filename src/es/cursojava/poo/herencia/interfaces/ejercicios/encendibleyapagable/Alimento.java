package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Insertable;
import lombok.Getter;
import lombok.Setter;

public abstract class Alimento extends Producto implements Insertable {

	@Getter
	@Setter
	private String fechaCaducidad;
	
	public Alimento (String nombre, double precio, String fechaCaducidad) {
		super(nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
		}
}
