package es.cursojava.colecciones;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.poo.herencia.Vaca;

public class PruebaListas {

	public static void main(String[] args) {

		List<Vaca> lista = new ArrayList<>();
//		lista.add("Azul"); da error pq al indicar que solo puede haber objetos tipo Vaca, no acepta un String
//		lista.add(1); da error pq al indicar que solo puede haber objetos tipo Vaca, no acepta un int
		lista.add(new Vaca("vaca1", 0, 0));
		Vaca v2 = new Vaca("vaca2", 0, 0);
		lista.add(v2);

		System.out.println(lista.size());
		
		lista.get(0).mugir();
		lista.add(0, new Vaca("vaca3", 0, 0)); // la pone en la posición 0, moviendo a las anteriores.

		lista.contains(new Vaca("vaca3", 0, 0)); // devuelve false porque aunque tiene los mismos valroes que la
													// anterior, tiene una posición de memoria distinta al ser un nuevo
													// objeto
		
		lista.remove(0);//elimina la posición 0 de la lista.
		lista.remove(v2);//elimina el objeto referenciado por v2 de la lista.

		// recorre con Object porque es la clase de la que heredan los demás. El int lo
		// considera un clase Integer.
		for (Object objeto : lista) {
			if (objeto instanceof Vaca) {
				((Vaca) objeto).mugir();
//				Tb
//				Vaca v = (Vaca) objeto;
//				v.mugir();
			}
		}

		for (Vaca vaca : lista) {
			vaca.mugir();
		}
	}
}
