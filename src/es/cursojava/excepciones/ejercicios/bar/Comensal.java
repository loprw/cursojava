package es.cursojava.excepciones.ejercicios.bar;

public class Comensal extends Cliente implements Cafeteable {

	private boolean tieneReserva;

	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
	}

	public boolean isTieneReserva() {
		return tieneReserva;
	}

	public void setTieneReserva(boolean tieneReserva) {
		this.tieneReserva = tieneReserva;
	}

	@Override
	public void beberCafe(TazaCafe cafe) throws TooHotTemperatureException, TooColdTemperatureException {
		System.out.println("El comensal " + getNombre() + " está tomando café...");
		if (cafe.getTemperatura() < 20) {
			throw new TooColdTemperatureException("¡Muy frío!");
		} else if (cafe.getTemperatura() > 80) {
			throw new TooHotTemperatureException("¡Quema!");
		} else {
			System.out.println("Disfruta del café " + cafe.getTipoCafe());
		}
	}
}
