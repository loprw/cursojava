package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import lombok.Getter;
import lombok.Setter;

public class Galleta extends Alimento {

	@Getter
	@Setter
	private String tipoHarina;
	@Getter
	@Setter
	private boolean tieneTropezones;
	
	public Galleta(String nombre, double precio, String fechaCaducidad, String tipoHarina, boolean tieneTropezones) {
		super(nombre, precio, fechaCaducidad);
		this.tipoHarina = tipoHarina;
		this.tieneTropezones = tieneTropezones;
	}	
}
