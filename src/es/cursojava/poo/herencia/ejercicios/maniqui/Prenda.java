package es.cursojava.poo.herencia.ejercicios.maniqui;

public class Prenda {

	private String color;
	private double precio;
	private String talla;
	
	public Prenda(String color, double precio, String talla) {
		this.color = color;
		this.precio = precio;
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}
	

}
