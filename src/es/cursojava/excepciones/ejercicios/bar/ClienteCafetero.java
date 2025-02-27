package es.cursojava.excepciones.ejercicios.bar;

import es.cursojava.excepciones.ejercicios.bar.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios.bar.excepciones.TooHotTemperatureException;

public abstract class ClienteCafetero extends Cliente implements Cafeteable {

	public ClienteCafetero(String nombre) {
		super(nombre);
	}
	
	public void beberCafe(TazaCafe cafe) throws TooHotTemperatureException, TooColdTemperatureException {
		System.out.println(getNombre() + " está tomando café...");
		if (cafe.getTemperatura() > 80) {
			throw new TooHotTemperatureException("¡Quema!");
		} else if (cafe.getTemperatura() < 20) {
			throw new TooColdTemperatureException("¡Está demasiado frío!");
		} else {
			System.out.println("Disfruta del café " + cafe.getTipoCafe());
		}
	}
}
