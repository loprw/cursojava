package es.cursojava.poo.herencia.interfaces;

public interface Interfaz1 {

	//las variables son siempre static y final, aunque no aparece.
	int VALOR = 0;
	
	//son abstractas aunque no tengan el modificador abstract, porque están dentro de una interfaz.
	public void metodo1();
	public void metodo2(String param);
}
