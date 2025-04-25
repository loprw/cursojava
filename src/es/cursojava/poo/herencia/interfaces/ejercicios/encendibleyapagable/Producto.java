package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Consultable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Producto implements Consultable {


	private String nombre;

	private double precio;
	
	

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
