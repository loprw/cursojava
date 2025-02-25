package es.cursojava.excepciones.ejercicios.bar;

public class TooHotTemperatureException extends TemperatureException {

	public TooHotTemperatureException() {
		super("La temperatura del líquido es demasiado alta. ¡Quema!");
	}

	public TooHotTemperatureException(String mensaje) {
		super(mensaje);
	}
}
