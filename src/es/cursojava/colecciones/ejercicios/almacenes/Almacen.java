package es.cursojava.colecciones.ejercicios.almacenes;

import java.util.Map;

public class Almacen {

	private String nombre;
	private Map<String, Integer> productos;
	private Map<String, Map<String, Integer>> almacen;
	
	public Almacen(String nombre, Map<String, Integer> productos) {
		super();
		this.nombre = nombre;
		this.productos = productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Integer> getProductos() {
		return productos;
	}

	public void setProductos(Map<String, Integer> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Almacen [nombre=");
		builder.append(nombre);
		builder.append(", productos=");
		builder.append(productos);
		builder.append("]");
		return builder.toString();
	}
}
