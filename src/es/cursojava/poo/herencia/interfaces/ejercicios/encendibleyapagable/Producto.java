package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Consultable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Producto implements Consultable {

	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private double precio;
}
