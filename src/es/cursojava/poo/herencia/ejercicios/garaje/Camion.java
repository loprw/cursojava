package es.cursojava.poo.herencia.ejercicios.garaje;

public class Camion extends VehiculoMotorizado {

	private double capacidadCarga;
	private int numeroEjes;

	public Camion(String marca, String modelo, int any, int velocidadMaxima, String tipo, String motor, double capacidadCarga,
			int numeroEjes) {
		super(marca, modelo, any, velocidadMaxima, tipo, motor);
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
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Camion [");
		builder.append(super.toString());
		builder.append("\n\tcapacidadCarga=");
		builder.append(capacidadCarga);
		builder.append("\n\tnumeroEjes=");
		builder.append(numeroEjes);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void acelerar() {
	}

	@Override
	public void encender() {
	}

	@Override
	public void apagar() {
	}
	
	
	
}
