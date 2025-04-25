package es.cursojava.hibernate.ejercicios.caballos.exceptions;

public class ErrorVelocidadMaxException extends Exception {

	
	public ErrorVelocidadMaxException() {
		super("Se ha producido un error en la velocidad del caballo.");
	}
	
	public ErrorVelocidadMaxException(String message) {
		super(message);
	}
}
