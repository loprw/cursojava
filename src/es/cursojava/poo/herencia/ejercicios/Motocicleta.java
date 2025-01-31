package es.cursojava.poo.herencia.ejercicios;

public class Motocicleta extends Vehiculo {

	private boolean tieneSidecar;
	private int cilindrada;

	public Motocicleta(String marca, String modelo, int any, int velocidadMaxima, String tipo, boolean tieneSidecar,
			int cilindrada) {
		super(marca, modelo, any, velocidadMaxima, tipo);
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
	public void mostrarInformacion() {
		
		super.mostrarInformacion();
		System.out.println("\t¿Tiene sidecar?: " + (getTieneSidecar()?"Sí":"No"));
		System.out.println("\tCilindrada: " + this.cilindrada);
		
	}
	
	
	

}
