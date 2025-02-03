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
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("\tNúmero de puertas: " + this.numeroPuertas);
		System.out.println("\t¿Tiene aire acondiconado?: " + (getTieneAireAcondicionado()?"Sí":"No"));
	}
	
	
	
}
