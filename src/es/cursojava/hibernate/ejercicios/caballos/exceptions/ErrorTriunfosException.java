package es.cursojava.hibernate.ejercicios.caballos.exceptions;

public class ErrorTriunfosException extends Exception{

	public ErrorTriunfosException() {
		super("Se ha producido un error en el número de triunfos del caballo.");
	}
	
	public ErrorTriunfosException(String message) {
		super(message);
	}
}
