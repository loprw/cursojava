package es.cursojava.poo.herencia.ejercicios;

public class Piano extends Instrumento{

	private int numOctavas;
	private String tipoPiano;
	
	public Piano(String nombre, String tipo, int numOctavas, String tipoPiano) {
		super(nombre, tipo);
		this.numOctavas = numOctavas;
		this.tipoPiano = tipoPiano;
	}
		
	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public String getTipoPiano() {
		return tipoPiano;
	}

	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}

	@Override
	public void afinar() {
		super.afinar();
		System.out.println("\tAfinando piano.");
	}
}
