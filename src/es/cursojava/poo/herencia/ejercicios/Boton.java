package es.cursojava.poo.herencia.ejercicios;

public class Boton {

	private String color;
	private String tamany;
	private String forma;
	
	public Boton (String color, String tamany, String forma) {
		this.color = color;
		this.tamany = tamany;
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamany() {
		return tamany;
	}

	public void setTamany(String tamany) {
		this.tamany = tamany;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
}
