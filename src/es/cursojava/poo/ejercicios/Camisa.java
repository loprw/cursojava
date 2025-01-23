package es.cursojava.poo.ejercicios;

public class Camisa {

	private String color;
	private double precio;
	private String talla;
	private Boton[] botones;
	
	public Camisa(String color, double precio, String talla, Boton[] botones) {
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.botones = botones;
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

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}
	
}
