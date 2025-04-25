package es.cursojava.hibernate.ejercicios.caballos.exceptions;

public class ErrorExperienciaException extends Exception{

	public ErrorExperienciaException() {
		super("Se ha producido un error en la experiencia del caballo.");
	}
	
	public ErrorExperienciaException(String message) {
		super(message);
	}
}
