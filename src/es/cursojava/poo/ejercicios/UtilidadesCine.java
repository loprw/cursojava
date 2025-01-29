package es.cursojava.poo.ejercicios;

public class UtilidadesCine {

	public static Espectador[] obtenerEspectadores() {
		
		Espectador espectador1 = new Espectador("Neo", "987654321Z");
		Espectador espectador2 = new Espectador("Luisa", "123456789A");
		Espectador espectador3 = new Espectador("Melanie", "123987465G");
		
		Espectador[] espectadores = {espectador1, espectador2, espectador3};
		
		return espectadores;
	}
	
	public static Sala[] obtenerSalas() {
		
		Espectador[][] butacas1 = new Espectador[2][3];
		Sala sala1 = new Sala(1, "Matrix", butacas1);
		
		Espectador[][] butacas2 = new Espectador[2][3];
		Sala sala2 = new Sala(2, "Yo, Robot", butacas2);
		
		Espectador[][] butacas3 = new Espectador[2][3];
		Sala sala3 = new Sala(3, "Desperado", butacas3);
		
		Sala[] salas = {sala1, sala2, sala3};
		
		return salas;
	}
}
