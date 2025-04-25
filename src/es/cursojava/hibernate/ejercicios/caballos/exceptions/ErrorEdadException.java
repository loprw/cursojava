package es.cursojava.hibernate.ejercicios.caballos.exceptions;

public class ErrorEdadException extends Exception {
	
	public ErrorEdadException() {
		super("Se ha producido un error en la edad del caballo.");
	}
	
	public ErrorEdadException(String message) {
		super(message);
	}
}
