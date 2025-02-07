package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import es.cursojava.poo.herencia.ejercicios.garaje.Coche;

public class MainApagableyEncendible {

	public static void main(String[] args) {
		
		MainApagableyEncendible nuevo = new MainApagableyEncendible();
		Object[] objetos = nuevo.crearObjetos();
		
		Encendible[] encendibles = nuevo.mostarEncendible(objetos);
		Apagable[] apagables = nuevo.mostarApagable(objetos);

		nuevo.pintarEncendidoApagado(encendibles, apagables);
	}
	
	public Object[] crearObjetos() {
		
		Coche coche = new Coche("Chevrolet", "Kalos", 2008, 140, "Gasolina", "90 CV", 5, true);
		Bicicleta bici = new Bicicleta("Shimano", "SH1", 2019, 60, "A pedales", 5);
		Galleta galleta = new Galleta("Cookie", 0.75, "15/5/2025", "trigo", true);
		Ebook ebook = new Ebook("SPC", 20.05, "15/12/2020", 40.4);
		
		ebook.encender();
		ebook.apagar();
		coche.encender();
		coche.apagar();
		
		Object[] objetos = {coche, bici, galleta, ebook};
		
		return objetos;
	}
	
	public Apagable[] mostarApagable(Object[] objetos) {
		
		int contador = 0;
		
		for (Object objeto: objetos) {
			if (objeto instanceof Apagable) {
				contador++;
			}
		}
		
		Apagable[] apagables = new Apagable[contador];
		
		for (;;) {
			
		}
		
		return apagables;
	}
	
	public Encendible[] mostarEncendible(Object[] objetos) {
		
		int contador = 0;
		
		for (Object objeto: objetos) {
			if (objeto instanceof Encendible) {
				contador++;
			}
		}
		
		Encendible[] apagables = new Encendible[contador];
		
		return apagables;
	}
	
	public void pintarEncendidoApagado(Encendible[] encendibles, Apagable[] apagables) {
		
		for (Encendible encendible : encendibles) {
			encendible.encender();
		}
		for (Apagable apagable : apagables) {
			apagable.apagar();
		}
	}
}