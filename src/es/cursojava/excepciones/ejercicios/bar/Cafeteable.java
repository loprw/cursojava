package es.cursojava.excepciones.ejercicios.bar;

public interface Cafeteable {

	public void beberCafe(TazaCafe cafe) throws TooHotTemperatureException, TooColdTemperatureException;
}
