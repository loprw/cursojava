package es.cursojava.poo.herencia.ejercicios.garaje;

public class Motocicleta extends VehiculoMotorizado {

	private boolean tieneSidecar;
	private int cilindrada;

	public Motocicleta(String marca, String modelo, int any, int velocidadMaxima, String tipo, String motor, boolean tieneSidecar,
			int cilindrada) {
		super(marca, modelo, any, velocidadMaxima, tipo, motor);
		this.tieneSidecar = tieneSidecar;
		this.cilindrada = cilindrada;

	}

	public boolean getTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motocicleta [");
		builder.append(super.toString());
		builder.append("\n\ttieneSidecar=");
		builder.append(tieneSidecar);
		builder.append("\n\tcilindrada=");
		builder.append(cilindrada);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void acelerar() {
	}

	@Override
	public void apagar() {
	}

	@Override
	public void encender() {
	}	
}
