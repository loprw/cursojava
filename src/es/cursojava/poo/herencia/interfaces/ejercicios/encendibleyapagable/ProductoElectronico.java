package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Deletable;
import lombok.Getter;
import lombok.Setter;

public abstract class ProductoElectronico extends Producto implements Apagable, Encendible, Deletable {

	@Getter
	@Setter
	private String fechaFabricacion;
	
	public ProductoElectronico (String nombre, double precio, String fechaFabricacion) {
		super(nombre, precio);
		this.fechaFabricacion = fechaFabricacion;
	}
}
