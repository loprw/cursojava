package es.cursojava.excepciones.ejercicios.bar;

public class TazaCafe {

	private String tipoCafe;
	private int temperatura;
	
	public TazaCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
		this.temperatura = fijarTemperatura();
	}

	public String getTipoCafe() {
		return tipoCafe;
	}

	public int getTemperatura() {
		return temperatura;
	}
	
	private int fijarTemperatura() {
		
		int temperatura = (int) (Math.random() * 101); 
		
		return temperatura;
	}	
}
