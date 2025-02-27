package es.cursojava.excepciones.ejercicios.bar.excepciones;

public class TooColdTemperatureException extends TemperatureException {

	public TooColdTemperatureException() {
		super("La temperatura del líquido es demasiado baja. ¡Está fría!");
	}

	public TooColdTemperatureException(String mensaje) {
		super(mensaje);
	}
}
