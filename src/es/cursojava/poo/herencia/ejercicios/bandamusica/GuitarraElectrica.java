package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class GuitarraElectrica extends Guitarra{

	private double potencia;
	
	public GuitarraElectrica(String nombre, String tipo, int numCuerdas, double potencia) {
		
		super(nombre, tipo, numCuerdas);
		this.potencia = potencia;
	}
	
	public double getPotencia() {
		return potencia;
	}



	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public void tocar() {
		super.tocar();
		System.out.println("\tTocando muy alto.");
	}
}
