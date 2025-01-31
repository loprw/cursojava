package es.cursojava.poo.herencia.ejercicios;

public class Pantalon extends Prenda{


	private Boton boton;
	
	public Pantalon(String color, double precio, String talla, Boton boton) {

		super(color, precio, talla);
		this.boton = boton;
	}

	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	
}
