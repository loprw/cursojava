package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class Guitarra extends Instrumento{

	int numCuerdas;
	
	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	@Override
	public void afinar() {
		super.afinar();
		System.out.println("\tAfinando guitarra.");
	}

	@Override
	public String toString() {
		String supertexto = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(supertexto);
		builder.append("Guitarra [numCuerdas=");
		builder.append(numCuerdas);
		builder.append("]");
		return builder.toString();
	}


}
