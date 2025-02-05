package es.cursojava.poo.herencia.ejercicios.garaje;

public class Coche extends Vehiculo {

	private int numeroPuertas;
	private boolean tieneAireAcondicionado;

	public Coche(String marca, String modelo, int any, int velocidadMaxima, String tipo, int numeroPuertas,
			boolean tieneAireAcondicionado) {
		super(marca, modelo, any, velocidadMaxima, tipo);
		this.numeroPuertas = numeroPuertas;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}

	public int getNumPuertas() {
		return numeroPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numeroPuertas = numPuertas;
	}

	public boolean getTieneAireAcondicionado() {
		return tieneAireAcondicionado;
	}

	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [");
		builder.append(super.toString());
		builder.append("\n\tnumeroPuertas=");
		builder.append(numeroPuertas);
		builder.append("\n\ttieneAireAcondicionado=");
		builder.append(tieneAireAcondicionado);

		builder.append("]");
		return builder.toString();
	}
}
