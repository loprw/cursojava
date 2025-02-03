package es.cursojava.poo.herencia.ejercicios.garaje;

public class Camion extends Vehiculo {

	private double capacidadCarga;
	private int numeroEjes;

	public Camion(String marca, String modelo, int any, int velocidadMaxima, String tipo, double capacidadCarga,
			int numeroEjes) {
		super(marca, modelo, any, velocidadMaxima, tipo);
		this.capacidadCarga = capacidadCarga;
		this.numeroEjes = numeroEjes;

	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getNumeroEjes() {
		return numeroEjes;
	}

	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}

	@Override
	public void mostrarInformacion() {

		super.mostrarInformacion();
		System.out.println("\tCapacidad de Carga: " + this.capacidadCarga);
		System.out.println("\tNúmero de ejes: " + this.numeroEjes);
		
	}
}
