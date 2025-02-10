package es.cursojava.poo.herencia.ejercicios.garaje;

public class Coche extends VehiculoMotorizado {

	private int numeroPuertas;
	private boolean tieneAireAcondicionado;

	public Coche(String marca, String modelo, int any, int velocidadMaxima, String tipo, String motor, int numeroPuertas,
			boolean tieneAireAcondicionado) {
		super(marca, modelo, any, velocidadMaxima, tipo, motor);
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

	@Override
	public void acelerar() {
	}

	@Override
	public void encender() {
		System.out.println(getMarca() + " " + getModelo() + " está encendido.");
	}

	@Override
	public void apagar() {
		System.out.println(getMarca() + " " + getModelo() + " está apagado.");
	}
	
	@Override
	public void delete() {
		System.out.println("Borrando " + getMarca() + " " + getModelo());	
	}

	@Override
	public void update() {
		System.out.println("Actualizando " + getMarca() + " " + getModelo());
	}

	@Override
	public void select() {
		System.out.println("Consultando " + getMarca() + " " + getModelo());	
	}

	@Override
	public void insert() {
		System.out.println("Insertando en " + getMarca() + " " + getModelo());
	}
}
