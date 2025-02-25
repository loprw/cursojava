package es.cursojava.excepciones.ejercicios.bar;

public class TemperatureException extends Exception {

	public TemperatureException() {
		super("La temperatura del líquido no es correcta");
	}
	
	public TemperatureException(String mensaje) {
		super(mensaje);
	}
}
