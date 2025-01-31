package es.cursojava.poo.herencia.ejercicios;

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
		// TODO Auto-generated method stub
		super.afinar();
		System.out.println("\tAfinando guitarra.");
	}
	
	
}
