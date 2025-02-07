package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Producto {

	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private double precio;
}
