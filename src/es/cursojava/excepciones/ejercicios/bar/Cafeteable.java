package es.cursojava.excepciones.ejercicios.bar;

import es.cursojava.excepciones.ejercicios.bar.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios.bar.excepciones.TooHotTemperatureException;

public interface Cafeteable {

	public void beberCafe(TazaCafe cafe) throws TooHotTemperatureException, TooColdTemperatureException;
}
